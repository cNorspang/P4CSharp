using POTBAG.CSTtoAST;
using System;
using System.Collections.Generic;
using POTBAG.Exceptions;

namespace POTBAG.ContextualAnalysis
{
    public class TestEvaluation : ASTVistor<int>
    {
        private int counter = 0;
        public override int Visit(List<ProgNode> node)
        {
            FileHandler.write($"char* InBlock{counter++};\n");

            node.ForEach(i =>
            {
                switch (i)
                {
                    case StatementNode statementNode:
                        Visit(statementNode);
                        break;
                    case ExpressionNode expressionNode:
                        Visit(expressionNode);
                        break;
                    case DeclarationNode declarationNode:
                        Visit(declarationNode);
                        break;
                    case AssignNode assignNode:
                        Visit(assignNode);
                        break;
                }
            });
            return 0;
        }

        public override int Visit(BufferNode node)
        {
            //FileHandler.write("BufferNode \n");
            Visit(node.SetUpNode);
            Visit(node.inBlock);
            return 0;
        }

        public override int Visit(SetupNode node)
        {
            FileHandler.write($"char* SetupNode{counter++};\n");
            Visit(node.Locations);
            return 0;
        }

        public override int Visit(LocationsSetupNode node)
        {
            FileHandler.write($"char* LocationsSetupNode{counter++};\n");

            node.Children.ForEach(i => Visit(i));
            return 0;
        }

        public override int Visit(LocationMappingNode node)
        {
            FileHandler.write($"char* LocationMappingNode{counter++};\n");
            return 0;
        }

        public override int Visit(PlayerSetupNode node)
        {
            throw new NotImplementedException();
        }

        public override int Visit(StatementNode node)
        {
            switch (node)
            {
                //FileHandler.write("StatementNode \n");
                case TextStatementNode statementNode:
                    Visit(statementNode);
                    break;
                case InputStatementNode statementNode:
                    Visit(statementNode);
                    break;
                case IfStatementNode statementNode:
                    Visit(statementNode);
                    break;
                case IfChainStatementNode statementNode:
                    Visit(statementNode);
                    break;
                case TravelStatementNode statementNode:
                    Visit(statementNode);
                    break;
                case ChoiceStatementNode statementNode:
                    Visit(statementNode);
                    break;
                case OptionStatementNode statementNode:
                    Visit(statementNode);
                    break;
            }

            return 0;
        }

        public override int Visit(TextStatementNode node)
        {
            string outputstring = "";
            FileHandler.write($"char* TextStatementNode{counter++};\n");
            outputstring += "printf(\"";
            node.Text.ForEach(i => outputstring += "%s");
            outputstring += "\",";
            node.Text.ForEach(i => outputstring += $"{i},");
            outputstring = outputstring.Remove(outputstring.LastIndexOf(','));
            outputstring += ");";
            outputstring = outputstring.Replace("\r", "");
            outputstring = outputstring.Replace("\n", @"\n");
            FileHandler.write(outputstring);
            return 0;
        }

        public override int Visit(InputStatementNode node)
        {
            FileHandler.write($"char* InputStatementNode{counter++};\n");
            return 0;
        }

        public override int Visit(IfChainStatementNode node)
        {
            FileHandler.write($"char* ifChainStatementNode{counter++};\n");
            Visit(node.ifNode);
            node.elseIfChain.ForEach(i => Visit(i));
            if (node.elseNode.body.Count != 0) Visit(node.elseNode);

            return 0;
        }

        public override int Visit(ifNode node)
        {
            FileHandler.write($"char* ifNode{counter++};\n");
            Visit(node.predicate);
            node.body.ForEach(i => Visit(i));
            return 0;
        }

        public override int Visit(ElseIfStatementNode node)
        {
            FileHandler.write($"char* ElseIfStatementNode{counter++};\n");
            Visit(node.predicate);
            node.body.ForEach(i => Visit(i));
            return 0;
        }

        public override int Visit(elseNode node)
        {
            FileHandler.write($"char* elseNode{counter++};\n");
            node.body.ForEach(i => Visit(i));
            return 0;
        }

        public override int Visit(predicateNode node)
        {
            FileHandler.write($"char* predicateNode{counter++};\n");

            ProgNode nodeLeft;

            switch (node.Left)
            {
                //FileHandler.write("StatementNode \n");
                case variableNode NodeNode:
                    nodeLeft = NodeNode;
                    //Visit(NodeNode);
                    break;
                case stringNode NodeNode:
                    nodeLeft = NodeNode;
                    //Visit(NodeNode);
                    break;
                case ExpressionNode NodeNode:
                    nodeLeft = NodeNode;
                    //Visit(NodeNode);
                    break;
                case BoolNode NodeNode:
                    nodeLeft = NodeNode;
                    //Visit(NodeNode);
                    break;
                case predicateNode NodeNode:
                    nodeLeft = NodeNode;
                    //Visit(NodeNode);
                    break;
                default:
                    Console.WriteLine("#### ERROR #### => " + node.Left.GetType());
                    Console.ReadKey();
                    throw new BennoException();
            }

            var hej = Visit(nodeLeft);


            return 0;
        }

        public override int Visit(stringNode node)
        {
            FileHandler.write($"char* stringNode{counter++}; //{node.strVal}\n");

            return 0;
        }

        public override int Visit(BoolNode node)
        {
            //FileHandler.write($"char* BoolNode{counter++};\n");
            return 0;
        }


        public override int Visit(TravelStatementNode node)
        {
            FileHandler.write($"char* TravelStatementNode{counter++};\n");
            return 0;
        }

        public override int Visit(ChoiceStatementNode node)
        {
            FileHandler.write($"char* ChoiceStatementNode{counter++};\n");
            return 0;
        }

        public override int Visit(OptionStatementNode node)
        {
            FileHandler.write($"char* OptionStatementNode{counter++};\n");
            return 0;
        }

        public override int Visit(AssignNode node)
        {
            switch (node)
            {
                case IntAssignNode intAssignNode:
                    Visit(intAssignNode);
                    break;
                case stringAssignNode stringAssignNode:
                    Visit(stringAssignNode);
                    break;
                case InputAssignNode inputAssignNode:
                    Visit(inputAssignNode);
                    break;
                case LocationAssignNode locationAssignNode:
                    Visit(locationAssignNode);
                    break;
            }
            return 0;
        }

        public override int Visit(IntAssignNode node)
        {
            FileHandler.write($"char* IntAssignNode{counter++};\n");
            return 0;
        }

        public override int Visit(stringAssignNode node)
        {
            FileHandler.write($"char* stringAssignNode{counter++};\n");

            switch (node.Left)
            {
                case variableNode varNode:
                    Visit(varNode);
                    break;
                case stringDeclarationNode stringDclNode:
                    Visit(stringDclNode);
                    break;
            }

            Visit(node.Right);

            return 0;
        }

        public override int Visit(InputAssignNode node)
        {
            FileHandler.write($"char* InputAssignNode{counter++};\n");
            return 0;
        }

        public override int Visit(LocationAssignNode node)
        {
            FileHandler.write($"char* LocationAssignNode{counter++};\n");
            return 0;
        }

        public override int Visit(DeclarationNode node)
        {
            switch (node)
            {
                case IntDeclarationNode intdeclarationNode:
                    Visit(intdeclarationNode);
                    break;
                case stringDeclarationNode stringDeclarationNode:
                    Visit(stringDeclarationNode);
                    break;
                case LocationDeclarationNode locationDeclarationNode:
                    Visit(locationDeclarationNode);
                    break;
            }
            return 0;
        }

        public override int Visit(variableNode node)
        {
            FileHandler.write($"char* variableNode{counter++}; //{node.variableName}\n");

            return 0;
        }

        public override int Visit(IntDeclarationNode node)
        {
            FileHandler.write($"char* IntDeclarationNode{counter++};\n");
            return 0;
        }

        public override int Visit(stringDeclarationNode node)
        {
            FileHandler.write($"char* stringDeclarationNode{counter++};\n");
            Visit(node.VarName);

            return 0;
        }

        public override int Visit(LocationDeclarationNode node)
        {
            FileHandler.write($"char* LocationDeclarationNode{counter++};\n");
            return 0;
        }

        public override int Visit(ExpressionNode node)
        {
            FileHandler.write($"char* ExpressionNode{counter++};\n");
            return 0;
        }

        public override int Visit(AdditionNode node)
        {
            FileHandler.write($"char* AdditionNode{counter++};\n");
            return 0;
        }

        public override int Visit(SubtractionNode node)
        {
            FileHandler.write($"char* SubtractionNode{counter++};\n");
            return 0;
        }

        public override int Visit(MultiplicationNode node)
        {
            FileHandler.write($"char* MultiplicationNode{counter++};\n");
            return 0;
        }

        public override int Visit(DivisionNode node)
        {
            FileHandler.write($"char* DivisionNode{counter++};\n");
            return 0;
        }

        public override int Visit(NumberNode node)
        {
            FileHandler.write($"char* NumberNode{counter++};\n");
            return 0;
        }

        public override int Visit(WhileStatementNode node)
        {
            throw new  BennoException();
        }
    }
}