using SWAE.ContextualAnalysis;
using SWAE.CSTtoAST;
using SWAE.Exceptions;
using System;
using System.Collections.Generic;
using System.Text;
using System.Text.RegularExpressions;
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
            code.Add("#include <stdbool.h>");

            code.Add("#ifdef _WIN32 \n#include <conio.h> " +
                    "\n#else// do Unix-specific stuff \n#include <termios.h> \n#include <unistd.h>" +
                    "\n    int getch (void){ int ch; struct termios oldt, newt; tcgetattr(STDIN_FILENO, &oldt); newt = oldt; newt.c_lflag &= ~(ICANON|ECHO);" +
                    "\n        tcsetattr(STDIN_FILENO, TCSANOW, &newt); ch = getchar(); tcsetattr(STDIN_FILENO, TCSANOW, &oldt); return ch;}\n#endif");

            // Clear screen func
            code.Add("\n#define clrscr() printf(\"\\e[1;1H\\e[2J\")");

            //Random func
            code.Add("\nint Random_Int_Num(int from, int to){ return (rand() % (to + 1 - from)) + from;}");

            //top banner
            string Tui =("\nvoid COMPILER_TOOL_PRINT_TUI(){" +
                    "\n    clrscr();" +
                    "\n    printf(\"##| SWAE TEST |##################################################################\\n\");" + 
                    "\n    printf(\"#################################################################################\\n\\n\");}");
            code.Add(Tui);
            Console.WriteLine(Tui);

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

        private string GetUniqueId()
        {
            string id = Convert.ToBase64String(Guid.NewGuid().ToByteArray()).Substring(1, 8);
            return Regex.Replace(id, "[^a-zA-Z0-9_.]+", "", RegexOptions.Compiled);
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
            Visit(node.SetUpNode);
            Visit(node.inBlock);

            string startLocationFuncCall = st.GetStartLocation();

            code.Add("int main(int argc, char const *argv[]){" +
                "\n    time_t t;" +
                "\n    srand((unsigned)time(&t));" +
                "\n    COMPILER_PLAYER_STRUCT_INIT();" +
                "\n    DEFINED_LOCATION_" + startLocationFuncCall + "();" +
                "\n    return 0;\n}");
            
            return "";
        }

        public override string Visit(SetupNode node)
        {
            Visit(node.Locations);
            return Visit(node.PlayerNode);

        }

        public override string Visit(LocationsSetupNode node)
        {

            node.Children.ForEach(n => Visit(n));
            return "";
        }

        public override string Visit(LocationMappingNode node)
        {
            code.Add("void DEFINED_LOCATION_" + node.Source.variableName+"();");
            return "";
        }

        // Warning: Cursed code
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

            initPlayerStruct += ("void COMPILER_PLAYER_STRUCT_INIT(){");

            //outOfStruct.ForEach(i => initPlayerStruct += "\n    " + structName + "." + i);
            foreach (var item in outOfStruct)
            {
                string[] varNameAndValue = item.Split('=');

                if (item.Contains('\"')) { 
                    string varName = varNameAndValue[0].Split('[')[0];
                    string fvalue = varNameAndValue[1].Replace(";", string.Empty).Trim();
                    initPlayerStruct += ("\n    strcpy(" + structName + "." + varName + ", " + fvalue + ");");
                }
                else
                    initPlayerStruct += ("\n    " + structName + "." + item);
            }
            initPlayerStruct += "}\n";
            code.Add(initPlayerStruct);

            return "";
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

            //linesToPrint = linesToPrint.Replace("\t", "");
            //linesToPrint = linesToPrint.Replace("\\n", "\\n");
            //linesToPrint = linesToPrint.Replace("\n", "\"\"");
            


            return codeStr + typeToPrint + "\"" + linesToPrint + ");\n    COMPILER_TOOL_WAIT_FOR_INPUT();";
        }

        //TODO
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
            code.Add("\n  while(" + Visit(node.predicate) + ") {");            
            Visit(node.body);
            code.Add("\n  }");
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
            code.Add("  if (" + predicate + ") {");
            Visit(node.body);
            code.Add("  }");
            return "";
        }

        public override string Visit(ElseIfStatementNode node)
        {
            string predicate = Visit(node.predicate);
            code.Add("  else if (" + predicate + ") {");
            Visit(node.body);
            code.Add("  }");
            return "";
        }

        public override string Visit(elseNode node)
        {
            code.Add("  else {");
            Visit(node.body);
            code.Add("  }");
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
            return node.value ? "true" : "false";
        }

        public override string Visit(TravelStatementNode node)
        {
            return "\nDEFINED_LOCATION_" + node.Destination.variableName + "();";
        }

        public override string Visit(ChoiceStatementNode node)
        {
            //node.Options.ForEach(i => Visit(i));
            int id = 0;
            string stmtId = GetUniqueId();

            foreach (var item in node.Options)
            {
                if(item.predicate != null)
                    code.Add("\n  if ("+Visit(item.predicate)+") printf(\"\\n" + $"{++id}. " + Visit(item.Left).Replace("\"", string.Empty) + "\"); ");
                else
                {
                    code.Add("\n    printf(\"\\n" + $"{++id}. " + Visit(item.Left).Replace("\"", string.Empty) + "\"); ");
                }
                
            }
            code.Add($"\n    int USER_CHOICE_INPUT_{stmtId} = COMPILER_TOOL_GET_INPUT({id});");
            id = 0;


            foreach (var item in node.Options)
            {
                if (item.predicate != null)
                    code.Add($"\n if ({Visit(item.predicate)}){{");
                    
                code.Add($"\n  if (USER_CHOICE_INPUT_{stmtId} == {++id}){{");

                Visit(item.Right);

                code.Add("  }");

                if (item.predicate != null)
                    code.Add($"\n }} else if (USER_CHOICE_INPUT_{stmtId} == " + id+ $") {{ USER_CHOICE_INPUT_{stmtId} = " + (id+1)+"; } ");
            }

            return "";
        }

        public override string Visit(OptionStatementNode node)
        {
            //this is done, it is handled in choice
            node.Right.ForEach(i => Visit(i));

            return "";
        }

        public override string Visit(AssignNode node)
        {
            switch (node)
            {
                case AnonymousAssignNode AnoAssignNode:
                    return Visit(AnoAssignNode);
                case IntAssignNode intAssignNode:
                    return Visit(intAssignNode);
                case stringAssignNode stringAssignNode:
                    return Visit(stringAssignNode);
                case InputAssignNode inputAssignNode:
                    return Visit(inputAssignNode);
                case LocationAssignNode locationAssignNode:
                    return Visit(locationAssignNode);
                case BoolAssignNode boolAssignNode:
                    return Visit(boolAssignNode);
            }
            return "";
        }

        public override string Visit(AnonymousAssignNode node)
        {
            //TODO typeof(Exception).. feels bad maybe change.
            Type leftType = typeof(Exception);
            string leftName = "";
            string rightName = "";

            switch (node.Left)
            {
                case DotNotationNode dotNode:
                    leftType = st.GetSymbolByName(dotNode.variableName).GetSymbolType();
                    leftName = Visit(dotNode);
                    break;
                case variableNode varNode:
                    leftType = st.GetSymbolByName(varNode.variableName).GetSymbolType();
                    leftName = Visit(varNode);
                    break;
            }
            switch (node.Right)
            {
                case DotNotationNode dotNode:
                    rightName = Visit(dotNode);
                    break;
                case variableNode varNode:
                    rightName = Visit(varNode);
                    break;
            }

            if (leftType == typeof(string))
                return "    strcpy(" + leftName + ", " + rightName + ");";
            else
                return "    " + leftName + " = " + rightName + ";";
        }

        public override string Visit(IntAssignNode node)
        {
            string left = "";
            string op = "";
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

            op = node.Operator;

            switch (node.Right)
            {
                case ExpressionNode exprNode:
                    right = Visit(exprNode);
                    break;
                case InputStatementNode inputNode:
                    right = Visit(inputNode);
                    break;
            }

            return "    " + left + op + right + ";";
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
            strAssignStr += Visit(node.Right);
            return strAssignStr + ';';
        }

        public override string Visit(BoolAssignNode node)
        {
            string left = "";
            string right = Visit(node.Right);

            switch (node.Left)
            {
                case DotNotationNode dotNode:
                    left = Visit(dotNode);
                    break;
                case variableNode varNode:
                    left = Visit(varNode);
                    break;
                case BoolDeclarationNode boolDclNode:
                    left = Visit(boolDclNode);
                    break;
                default:
                    throw new BennoException($"### ERROR boolAssignNode => {node.GetType().Name}");
            }
            return "    " + left + " = " + right + ";";
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
            string locationName = "";
            switch (node.Left)
            {
                case DotNotationNode dotNode:
                    locationStr += Visit(dotNode);
                    locationName = locationStr + "()";
                    break;
                case variableNode varNode:
                    locationStr += Visit(varNode);
                    locationName = locationStr + "()";
                    break;
                case LocationDeclarationNode locationDclNode:
                    locationStr += Visit(locationDclNode);
                    locationName = locationStr.Split(' ')[1];
                    break;
            }
            locationStr += "{";
            code.Add(locationStr);
            Visit(node.Right);
            code.Add(locationName+";\n}");
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
            return "void DEFINED_LOCATION_" + node.VarName.variableName + "()";
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
                    return "PLAYER_STRUCT."+nodeDOT.VarName;
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
