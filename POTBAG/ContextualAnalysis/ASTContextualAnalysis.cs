using POTBAG.CSTtoAST;
using System;
using System.Collections.Generic;
using System.Text;

namespace POTBAG.ContextualAnalysis
{
    public class ASTContextualAnalysis : ASTVistor<object>
    {
        private SymbolTable st;
        public ASTContextualAnalysis(SymbolTable symbolTable)
        {
            st = symbolTable;
        }

        public override object Visit(List<ProgNode> node)
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
            return true; ;
        }

        public override object Visit(BufferNode node)
        {
            #region debugSplit
            Console.WriteLine("" +
                "\n   ______            __            __              __   ___                __           _     " +
                "\n  / ____/___  ____  / /____  _  __/ /___  ______ _/ /  /   |  ____  ____ _/ /_  _______(_)____" +
                "\n / /   / __ \\/ __ \\/ __/ _ \\| |/_/ __/ / / / __ `/ /  / /| | / __ \\/ __ `/ / / / / ___/ / ___/" +
                "\n/ /___/ /_/ / / / / /_/  __/>  </ /_/ /_/ / /_/ / /  / ___ |/ / / / /_/ / / /_/ (__  ) (__  ) " +
                "\n\\____/\\____/_/ /_/\\__/\\___/_/|_|\\__/\\__,_/\\__,_/_/  /_/  |_/_/ /_/\\__,_/_/\\__, /____/_/____/  " +
                "\n                                                                         /____/               \n");
            #endregion

            Visit(node.SetUpNode);
            //Visit(node.inBlock);
            return true;
        }

        public override object Visit(SetupNode node)
        {
            st.PushScope();

            st.CurrentScope().Define("hej", typeof(int));

            Visit(node.Locations);

            st.PopScope();

            return true;
        }

        public override object Visit(LocationsSetupNode node)
        {
            st.PushScope();
            node.Children.ForEach(n => Visit(n));
            st.CurrentScope().PrintAllAccessibleKeys();
            st.PopScope();
            return true;
        }

        public override object Visit(LocationMappingNode node)
        {
            st.CurrentScope().Define(node.Source, typeof(LocationMappingNode));
            return true;
        }

        public override object Visit(StatementNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(TextStatementNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(InputStatementNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(IfStatementNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(IfChainStatementNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(ifNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(ElseIfStatementNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(elseNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(predicateNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(BoolNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(TravelStatementNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(ChoiceStatementNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(OptionStatementNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(AssignNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(IntAssignNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(stringAssignNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(InputAssignNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(variableNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(LocationAssignNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(DeclarationNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(IntDeclarationNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(stringDeclarationNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(stringNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(LocationDeclarationNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(ExpressionNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(AdditionNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(SubtractionNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(MultiplicationNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(DivisionNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(NumberNode node)
        {
            throw new NotImplementedException();
        }
    }
}
