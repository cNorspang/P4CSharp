using System;
using System.Collections.Generic;

namespace POTBAG.CSTtoAST
{
    public class TestEvaluation : ASTVistor<int>
    {
        private int counter = 0;
        public override int Visit(List<ProgNode> node)
        {
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
            Console.WriteLine("LocationSetuNodeVisit");
            
            node.Children.ForEach(i => Visit(i));
            return 0;
        }

        public override int Visit(LocationMappingNode node)
        {
            FileHandler.write($"char* LocationMappingNode{counter++};\n");
            return 0;
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
            }

            return 0;
        }

        public override int Visit(TextStatementNode node)
        {
            string outputstring = "";
            FileHandler.write($"char* TextStatementNode{counter++};\n");
            outputstring += "printf(\"";
            node.Text.ForEach(i => outputstring += "%s");
            outputstring +="\",";
            node.Text.ForEach(i => outputstring += $"{i},");
            outputstring = outputstring.Remove(outputstring.LastIndexOf(','));
            outputstring +=");";
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

        public override int Visit(IfStatementNode node)
        {
            FileHandler.write($"char* IfStatementNode{counter++};\n");
            return 0;
        }

        public override int Visit(IfChainStatementNode node)
        {
            FileHandler.write($"char* ifChainStatementNode{counter++};\n");
            Visit(node.ifNode);
            node.elseIfChain.ForEach(i => Visit(i));
            if(node.elseNode.body.Count != 0) Visit(node.elseNode);

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
            return 0;
        }

        public override int Visit(elseNode node)
        {
            FileHandler.write($"char* elseNode{counter++};\n");
            return 0;
        }

        public override int Visit(predicateNode node)
        {
            FileHandler.write($"char* predicateNode{counter++};\n");
            
            switch (node.Left)
            {
                //FileHandler.write("StatementNode \n");
                case variableNode NodeNode:
                    Visit(NodeNode);
                    break;
                case stringNode NodeNode:
                    Visit(NodeNode);
                    break;
                case ExpressionNode NodeNode:
                    Visit(NodeNode);
                    break;
                //case BoolNode NodeNode:
                //    Visit(NodeNode);
                //    break;
            }
            return 0;
        }
        //public override int Visit(BoolNode node)
        //{
        //    //FileHandler.write($"char* BoolNode{counter++};\n");
        //    return 0;
        //}


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

        public override int Visit(IntDeclarationNode node)
        {
            FileHandler.write($"char* IntDeclarationNode{counter++};\n");
            return 0;
        }

        public override int Visit(stringDeclarationNode node)
        {
            FileHandler.write($"char* stringDeclarationNode{counter++};\n");
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
    }
}