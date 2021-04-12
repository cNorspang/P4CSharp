using System;

namespace POTBAG.CSTtoAST
{
    public class TestEvaluation : ASTVistor<int>
    {
        public override int Visit(SetupNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(LocationsSetupNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(LocationMappingNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(StatementNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(TextStatementNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(InputStatementNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(IfStatementNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(ifChainStatementNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(ifNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(ElseIfStatementNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(elseNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(predicateNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(TravelStatementNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(ChoiceStatementNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(OptionStatementNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(AssignNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(IntAssignNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(stringAssignNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(InputAssignNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(LocationAssignNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(DeclarationNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(IntDeclarationNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(stringDeclarationNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(LocationDeclarationNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(ExpressionNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(AdditionNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(SubtractionNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(MultiplicationNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(DivisionNode node)
        {
            FileHandler.write("Setupnode TEST\n");
            return 0;
        }

        public override int Visit(NumberNode node)
         {
             FileHandler.write("Setupnode TEST\n");
             return 0;
        }
    }
}