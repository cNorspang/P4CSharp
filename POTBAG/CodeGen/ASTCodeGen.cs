using SWAE.ContextualAnalysis;
using SWAE.CSTtoAST;
using SWAE.Exceptions;
using System;
using System.Collections.Generic;
using System.Text;
using static SWAE.DebugPrinter;


namespace SWAE.CodeGen
{
    public class ASTCodeGen : ASTVistor<string>
    {
        protected List<string> code = new List<string>();
        private SymbolTable st;

        public ASTCodeGen(SymbolTable symbolTable)
        {
            st = symbolTable;
            Init();
        }

        public List<string> GetResult()
        {
            return code;
        }
        
        private void Init()
        {
            //Adds helper funcs and libs
            #region C_Funcs
            code.Add("#include <stdio.h>");
            code.Add("#include <stdlib.h>");
            code.Add("#include <string.h>");
            code.Add("#include <time.h>");
            code.Add("#include <ctype.h>");

            code.Add("#ifdef _WIN32 \n#include <conio.h> " +
                    "\n#else// do Unix-specific stuff \n#include <termios.h> \n#include <unistd.h>" +
                    "\n    int getch (void){ int ch; struct termios oldt, newt; tcgetattr(STDIN_FILENO, &oldt); newt = oldt; newt.c_lflag &= ~(ICANON|ECHO);" +
                    "\n        tcsetattr(STDIN_FILENO, TCSANOW, &newt); ch = getchar(); tcsetattr(STDIN_FILENO, TCSANOW, &oldt); return ch;}\n#endif");

            // Clear screen func
            code.Add("\n#define clrscr() printf(\"\\e[1;1H\\e[2J\")");

            //Random func
            code.Add("\nint Random_Int_Num(int from, int to){ return (rand() % (to + 1 - from)) + from;}");

            //top banner
            code.Add("\nvoid COMPILER_TOOL_PRINT_TUI(){" +
                    "\n    clrscr();" +
                    "\n    printf(\"##| SWAE TEST |##################################################################\\n\");" + 
                    "\n    printf(\"#################################################################################\\n\\n\");}");

            // Get user input from 
            code.Add("\nint COMPILER_TOOL_GET_INPUT(int max){"+
                    "\n    char pwd; "+
                    "int num; "+
                    "int m = max; " +
                    "printf(\"\\n\");" +
                    "\n    while (1) {" +
                        "pwd = getch(); "+
                        "if (isdigit(pwd)) {"+
                            "num = (int)pwd - 48;  /* b/c ASCII: nums start at 48.*/"+
                            "if (num <= max && num > 0) "+
                                "return num;} "+
                        "pwd = '\\0';}}");

            code.Add("\nvoid COMPILER_TOOL_WAIT_FOR_INPUT(){ printf(\"\\n\"); char c = getch();}");


            #endregion

        }

        public override string Visit(List<ProgNode> node)
        {
            string addToCode = "";
            foreach (ProgNode item in node)
            {
                switch (item)
                {
                    case StatementNode statementNode:
                        addToCode = Visit(statementNode);
                        break;
                    case ExpressionNode expressionNode:
                        addToCode = Visit(expressionNode);
                        break;
                    case DeclarationNode declarationNode:
                        addToCode = Visit(declarationNode);
                        break;
                    case AssignNode assignNode:
                        addToCode = Visit(assignNode);
                        break;
                    default:
                        Console.WriteLine($"### ERROR List<ProgNode> (inBlock) => {string.Join(',', node)}");
                        SWAEErrorListener.Report(new inBlockErrorException(), this);
                        break;
                }
                code.Add(addToCode);
                addToCode = "";
            }
            
            return "";
        }

        public override string Visit(BufferNode node)
        {
            string structInit = Visit(node.SetUpNode);
            Visit(node.inBlock);

            string startLocationFuncCall = st.GetStartLocation();

            code.Add("int main(int argc, char const *argv[]){" +
                "\n    time_t t;" +
                "\n    srand((unsigned)time(&t));" +
                "\n" + structInit +
                "\n    " + startLocationFuncCall + "();" +
                "\n    return 0;\n}");
            
            return "";
        }

        public override string Visit(SetupNode node)
        {
            //Visit(node.Locations);
            return Visit(node.PlayerNode);

        }

        public override string Visit(LocationsSetupNode node)
        {
            //obsolete

            node.Children.ForEach(n => Visit(n));
            return "";
        }

        public override string Visit(LocationMappingNode node)
        {
            //obsolete
            return "";
        }

        public override string Visit(PlayerSetupNode node)
        {
            List<string> intoStruct = new List<string>();
            List<string> outOfStruct = new List<string>();
            string structName = "PLAYER_STRUCT";
            string initPlayerStruct = "";

            foreach (var item in node.assignNodes)
            {
                string[] temp = Visit(item).Trim().Split('=');
                intoStruct.Add(temp[0] + ';');
                outOfStruct.Add(temp[0].Split(' ')[1] + " =" + temp[1]);
            }
            //node.assignNodes.ForEach(i => Visit(i));
            
            code.Add("\nstruct GENERATED_PLAYER_STRUCT { ");
            intoStruct.ForEach(i => code.Add(i));
            code.Add("};\nstruct GENERATED_PLAYER_STRUCT "+structName+";\n");

            outOfStruct.ForEach(i => initPlayerStruct += "\n    " + structName + "." + i);

            return initPlayerStruct;
        }

        public override string Visit(StatementNode node)
        {
            switch (node)
            {
                case TextStatementNode statementNode:
                    return Visit(statementNode);
                case WhileStatementNode statementNode:
                    return Visit(statementNode);
                case InputStatementNode statementNode:
                    return Visit(statementNode);
                case IfStatementNode statementNode:
                    return Visit(statementNode);
                case IfChainStatementNode statementNode:
                    return Visit(statementNode);
                case TravelStatementNode statementNode:
                    return Visit(statementNode);
                case ChoiceStatementNode statementNode:
                    return Visit(statementNode);
                case OptionStatementNode statementNode:
                    return Visit(statementNode);
            }

            return "";
        }

        public override string Visit(TextStatementNode node)
        {
            string codeStr = "\n    COMPILER_TOOL_PRINT_TUI();\n    printf(";
            string typeToPrint = "\"";
            string linesToPrint = "";
            foreach (ProgNode item in node.Text)
            {
                switch (item)
                {
                    case DotNotationNode dotNode:
                        linesToPrint += ", " + Visit(dotNode);
                        Type type = st.GetSymbolByName(dotNode.variableName).GetSymbolType();
                        if (type == typeof(string)) typeToPrint += "%s";
                        else if (type == typeof(int)) typeToPrint += "%d";
                        else throw new BennoException("code gen textStmt => idk how we got here");
                        break;
                    case variableNode varNode:
                        linesToPrint += ", " + Visit(varNode);
                        Type typee = st.GetSymbolByName(varNode.variableName).GetSymbolType();
                        if (typee == typeof(string)) typeToPrint += "%s";
                        else if (typee == typeof(int)) typeToPrint += "%d";
                        else throw new BennoException("code gen textStmt => idk how we got here");
                        break;
                    case stringNode strNode:
                        linesToPrint += ", " + Visit(strNode);
                        typeToPrint += "%s";
                        break;
                    default:
                        throw new BennoException($"### ERROR TextStatementNode => {node.GetType().Name}");
                }
            }

            return codeStr + typeToPrint + "\"" + linesToPrint + ");\n    COMPILER_TOOL_WAIT_FOR_INPUT();";
        }

        public override string Visit(InputStatementNode node)
        {
            foreach (ProgNode item in node.Text)
            {
                switch (item)
                {
                    case DotNotationNode dotNode:
                        Visit(dotNode);
                        break;
                    case variableNode varNode:
                        Visit(varNode);
                        break;
                    case stringNode strNode:
                        Visit(strNode);
                        break;
                    default:
                        throw new BennoException($"### ERROR InputStatementNode => {node.GetType().Name}");
                }
            }
            return "";
        }

        public override string Visit(WhileStatementNode node)
        {
            Visit(node.predicate);
            Visit(node.body);
            return "";
        }

        public override string Visit(IfChainStatementNode node)
        {
            Visit(node.ifNode);
            node.elseIfChain.ForEach(i => Visit(i));
            if (node.elseNode.body.Count != 0) Visit(node.elseNode);

            return "";
        }

        public override string Visit(ifNode node)
        {
            string predicate = Visit(node.predicate);
            code.Add("    if (" + predicate + ") {");
            Visit(node.body);
            code.Add("    }");
            return "";
        }

        public override string Visit(ElseIfStatementNode node)
        {
            string predicate = Visit(node.predicate);
            code.Add("    else if (" + predicate + ") {");
            Visit(node.body);
            code.Add("    }");
            return "";
        }

        public override string Visit(elseNode node)
        {
            code.Add("    else {");
            Visit(node.body);
            code.Add("    }");
            return "";
        }

        public override string Visit(predicateNode node)
        {
            string left = "";
            string op = "";
            string right = "";
            switch (node.Left)
            {
                case DotNotationNode dotNode:
                    left = Visit(dotNode);
                    if (node.Right == null)
                    {
                        break;
                    }

                    switch (node.Right)
                    {
                        case stringNode strNode:
                            right = Visit(strNode);
                            break;
                        case DotNotationNode dotNodeR:
                            right = Visit(dotNodeR);
                            break;
                        case variableNode varNode:
                            right = Visit(varNode);
                            break;
                        case ExpressionNode exprNode:
                            right = Visit(exprNode);
                            break;
                        case BoolNode boolNode:
                            right = Visit(boolNode);
                            break;
                        default:
                            throw new BennoException("predicate variable right node no wuuurking");
                    }

                    break;
                case variableNode NodeNode:
                    left = Visit(NodeNode);

                    if (node.Right == null)
                    {
                        break;
                    }



                    switch (node.Right)
                    {
                        case stringNode strNode:
                            right = Visit(strNode);
                            break;
                        case DotNotationNode dotNode:
                            right = Visit(dotNode);
                            break;
                        case variableNode varNode:
                            right = Visit(varNode);
                            break;
                        case ExpressionNode exprNode:
                            right = Visit(exprNode);
                            break;
                        case BoolNode boolNode:
                            right = Visit(boolNode);
                            break;
                        default:
                            throw new BennoException("predicate variable right node no wuuurking");
                    }

                    break;
                case stringNode NodeNode:
                    left = Visit(NodeNode);
                    variableNode strVarNode = (variableNode)node.Right;
                    right = Visit(strVarNode);
                    break;
                case ExpressionNode NodeNode:
                    left = Visit(NodeNode);
                    switch (node.Right)
                    {
                        case variableNode exprVarNode:
                            right = Visit(exprVarNode);
                            break;
                        case ExpressionNode exprExprNode:
                            right = Visit(exprExprNode);
                            break;
                        default:
                            throw new BennoException("predicate expr node no wuuurking");
                            break;
                    }
                    break;
                case BoolNode NodeNode:
                    left = Visit(NodeNode);
                    if (node.Right != null)
                    {
                        variableNode boolVarNode = (variableNode)node.Right;
                        right = Visit(boolVarNode);
                    }
                    break;
                case predicateNode NodeNode:
                    left = Visit(NodeNode);
                    right = Visit(node.Right);
                    break;
                default:
                    Console.WriteLine("#### ERROR predicateNode => " + node.Left.GetType());
                    throw new BennoException();
            }


            op = node.Operator switch
            {
                "GREATER_THAN" => " > ",
                "GREATER_THAN_EQUAL" => " >= ",
                "LESS_THAN" => " < ",
                "LESS_THAN_EQUAL" => "<=",
                "EQUALS" => " == ",
                "NOT_EQUALS" => " != ",
                "AND" => " && ",
                "OR" => " || ",
                _ => op
            };

            return left + op + right;
        }

        public override string Visit(BoolNode node)
        {
            return "";
        }

        public override string Visit(TravelStatementNode node)
        {
            return "";
        }

        public override string Visit(ChoiceStatementNode node)
        {
            node.Options.ForEach(i => Visit(i));
            return "";
        }

        public override string Visit(OptionStatementNode node)
        {
            switch (node.Left)
            {
                case DotNotationNode dotNode:
                    Visit(dotNode);
                    break;
                case variableNode varNode:
                    Visit(varNode);
                    break;
                case stringNode strDclNode:
                    Visit(strDclNode);
                    break;
                default:
                    throw new BennoException($"### ERROR OptionStatementNode Left => {node.Left.GetType().Name}");
            }
            node.Right.ForEach(i => Visit(i));

            return "";
        }

        public override string Visit(AssignNode node)
        {
            switch (node)
            {
                case IntAssignNode intAssignNode:
                    return Visit(intAssignNode);
                    break;
                case stringAssignNode stringAssignNode:
                    return Visit(stringAssignNode);
                    break;
                case InputAssignNode inputAssignNode:
                    return Visit(inputAssignNode);
                    break;
                case LocationAssignNode locationAssignNode:
                    return Visit(locationAssignNode);
                    break;
                case BoolAssignNode boolAssignNode:
                    return Visit(boolAssignNode);
                    break;
            }
            return "";
        }

        public override string Visit(IntAssignNode node)
        {
            string left = "";
            string right = "";

            switch (node.Left)
            {
                case DotNotationNode dotNode:
                    left = Visit(dotNode);
                    break;
                case variableNode varNode:
                    left = Visit(varNode);
                    break;
                case IntDeclarationNode intDclNode:
                    left = Visit(intDclNode);
                    break;
            }

            switch (node.Right)
            {
                case ExpressionNode exprNode:
                    right = Visit(exprNode);
                    break;
                case InputStatementNode inputNode:
                    right = Visit(inputNode);
                    break;
            }

            return "    " + left + " = " + right + ";";
        }

        public override string Visit(stringAssignNode node)
        {
            string strAssignStr = "    ";
            switch (node.Left)
            {
                case DotNotationNode dotNode:
                    return "    strcpy(" + Visit(dotNode) + ", " + Visit(node.Right) + ");";
                case variableNode varNode:
                    return "    strcpy(" + Visit(varNode) + ", " + Visit(node.Right) + ");";
                case stringDeclarationNode stringDclNode:
                    strAssignStr += Visit(stringDclNode) + " = ";
                    break;
                default:
                    throw new BennoException($"### ERROR stringAssignNode => {node.GetType().Name}");
            }
            //can only be one string_obj node so just a visit
            strAssignStr += Visit(node.Right);
            return strAssignStr + ';';
        }

        public override string Visit(BoolAssignNode node)
        {
            switch (node.Left)
            {
                case DotNotationNode dotNode:
                    Visit(dotNode);
                    break;
                case variableNode varNode:
                    Visit(varNode);
                    break;
                case BoolDeclarationNode boolDclNode:
                    Visit(boolDclNode);
                    break;
                default:
                    throw new BennoException($"### ERROR boolAssignNode => {node.GetType().Name}");
            }
            Visit(node.Right);
            return "";
        }

        public override string Visit(InputAssignNode node)
        {
            switch (node.Left)
            {
                case DotNotationNode dotNode:
                    Visit(dotNode);
                    break;
                case variableNode varNode:
                    Visit(varNode);
                    break;
                case stringDeclarationNode strDclNode:
                    Visit(strDclNode);
                    break;
                default:
                    throw new BennoException($"### ERROR InputAssignNode => {node.Left.GetType().Name}");
            }
            //can only be one string_obj node so just a visit
            Visit(node.Right);
            return "";
        }

        public override string Visit(variableNode node)
        {
            return node.variableName;
        }

        public override string Visit(LocationAssignNode node)
        {
            string locationStr = "";
            switch (node.Left)
            {
                case DotNotationNode dotNode:
                    locationStr += Visit(dotNode);
                    break;
                case variableNode varNode:
                    locationStr += Visit(varNode);
                    break;
                case LocationDeclarationNode locationDclNode:
                    locationStr += Visit(locationDclNode);
                    break;
            }
            locationStr += "{";
            code.Add(locationStr);
            Visit(node.Right);
            code.Add("}");
            return "";
        }

        public override string Visit(DeclarationNode node)
        {
            string addToCode = "";
            switch (node)
            {
                case IntDeclarationNode intdeclarationNode:
                    addToCode = Visit(intdeclarationNode);
                    break;
                case stringDeclarationNode stringDeclarationNode:
                    addToCode = Visit(stringDeclarationNode);
                    break;
                case LocationDeclarationNode locationDeclarationNode:
                    addToCode = Visit(locationDeclarationNode);
                    break;
                case BoolDeclarationNode boolDeclarationNode:
                    addToCode = Visit(boolDeclarationNode);
                    break;
                default:
                    throw new BennoException($"### ERROR DeclarationNode => {node.GetType().Name}");
            }
            
            return addToCode + ";";       
        }

        public override string Visit(IntDeclarationNode node)
        {
            return "int " + node.VarName.variableName;
        }

        public override string Visit(stringDeclarationNode node)
        {
            return "char " + node.VarName.variableName + "[256]";
        }

        public override string Visit(BoolDeclarationNode node)
        {
            return "bool " + node.VarName.variableName;
        }

        public override string Visit(stringNode node)
        {
            return node.strVal;
        }

        public override string Visit(LocationDeclarationNode node)
        {
            return "void " + node.VarName.variableName + "()";
        }

        public override string Visit(ExpressionNode node)
        {
            switch (node)
            {
                case AdditionNode nodeADD:
                    return Visit(nodeADD);
                case DivisionNode nodeDIV:
                    return Visit(nodeDIV);
                case MultiplicationNode nodeMUL:
                    return Visit(nodeMUL);
                case SubtractionNode nodeSUB:
                    return Visit(nodeSUB);
                case NumberNode nodeNUM:
                    return Visit(nodeNUM);
                case ExpressionVarNameNode nodeVAR:
                    return nodeVAR.VarName;
                case ExpressionDotNameNode nodeDOT:
                    return nodeDOT.VarName;
                case ExpressionSoloNode nodeISO:
                    return Visit(nodeISO.expr);
                case RandomExpressionNode nodeRND:
                    return Visit(nodeRND);
                default:
                    throw new BennoException($"### ERROR ExpressionNode => {node.GetType().Name}");
            }

        }

        public override string Visit(AdditionNode node)
        {
            return Visit(node.Left) + "+" + Visit(node.Right);   
        }

        public override string Visit(SubtractionNode node)
        {
            return Visit(node.Left) + "-" + Visit(node.Right);
        }

        public override string Visit(MultiplicationNode node)
        {
            return Visit(node.Left) + "*" + Visit(node.Right);
        }

        public override string Visit(DivisionNode node)
        {
            return Visit(node.Left) + "/" + Visit(node.Right);
        }

        public override string Visit(NumberNode node)
        {
            return node.Value.ToString();
        }

        public override string Visit(DotNotationNode node)
        {
            return "PLAYER_STRUCT." + node.variableName;
        }

        public override string Visit(RandomExpressionNode node)
        {
            return "Random_Int_Num(" + Visit(node.MinValue) + ", "  + Visit(node.MaxValue) + ")";
        }
    }
}
