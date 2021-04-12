namespace POTBAG.CSTtoAST
{
    public abstract class ASTVistor<T>
    {
        public abstract T Visit(SetupNode node);
        public abstract T Visit(LocationsSetupNode node);
        public abstract T Visit(LocationMappingNode node);
        public abstract T Visit(StatementNode node);
        public abstract T Visit(TextStatementNode node);
        public abstract T Visit(InputStatementNode node);
        public abstract T Visit(IfStatementNode node);
        public abstract T Visit(ifChainStatementNode node);
        public abstract T Visit(ifNode node);
        public abstract T Visit(ElseIfStatementNode node);
        public abstract T Visit(elseNode node);
        public abstract T Visit(predicateNode node);
        public abstract T Visit(TravelStatementNode node);
        public abstract T Visit(ChoiceStatementNode node);
        public abstract T Visit(OptionStatementNode node);
        public abstract T Visit(AssignNode node);
        public abstract T Visit(IntAssignNode node);
        public abstract T Visit(stringAssignNode node);
        public abstract T Visit(InputAssignNode node);
        public abstract T Visit(LocationAssignNode node);
        public abstract T Visit(DeclarationNode node);
        public abstract T Visit(IntDeclarationNode node);
        public abstract T Visit(stringDeclarationNode node);
        public abstract T Visit(LocationDeclarationNode node);
        public abstract T Visit(ExpressionNode node);
        public abstract T Visit(AdditionNode node);
        public abstract T Visit(SubtractionNode node);
        public abstract T Visit(MultiplicationNode node);
        public abstract T Visit(DivisionNode node);
        public abstract T Visit(NumberNode node);

        public T Visit(ProgNode node)
        {
            FileHandler.write("int main(int argc, char const *argv[]){");
            switch (node)
            {
                case SetupNode setupNode:
                    Visit(setupNode);
                    break;
                case LocationsSetupNode setupNode:
                    Visit(setupNode);
                    break;
                case LocationMappingNode mappingNode:
                    Visit(mappingNode);
                    break;
                case TextStatementNode textStatementNode:
                    Visit(textStatementNode);
                    break;
                case InputStatementNode inputStatementNode:
                    Visit(inputStatementNode);
                    break;
            }
            FileHandler.write("return 0;}");

            FileHandler.WriteToFile();
            return Visit((StatementNode)node);
        }
    }
}