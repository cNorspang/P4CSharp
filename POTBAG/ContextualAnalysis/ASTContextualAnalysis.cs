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
            foreach (var item in node)
            {
                switch (item)
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
                    default:
                        Console.WriteLine($"### ERROR List<ProgNode> (inBlock) => {String.Join(',', node)}");
                        throw new NotImplementedException();
                }
            }
            return true;
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
            Visit(node.inBlock);

            //for debugging
            st.PrintAllKeysInSymbolTable();
            return true;
        }

        public override object Visit(SetupNode node)
        {
            st.PushScope();
            Visit(node.Locations);
            st.PopScope();

            return true;
        }

        public override object Visit(LocationsSetupNode node)
        {
            st.PushScope();
            node.Children.ForEach(n => Visit(n));
            st.PopScope();
            return true;
        }

        public override object Visit(LocationMappingNode node)
        {
            //TODO this is not done at all. not sure how it should work.
            st.CurrentScope().Define(node.Source.variableName, typeof(LocationMappingNode));
            return true;
        }

        public override object Visit(StatementNode node)
        {
            switch (node)
            {
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

            return true;
        }

        public override object Visit(TextStatementNode node)
        {
            foreach (var item in node.Text)
            {
                switch (item)
                {
                    case variableNode varNode:
                        Visit(varNode);
                        //Validate variable
                        st.CurrentScope().Resolve(varNode.variableName, typeof(string));
                        break;
                    case stringNode strNode:
                        Visit(strNode);
                        break;
                    default:
                        Console.WriteLine($"### ERROR TextStatementNode => {node.GetType().Name}");
                        throw new NotImplementedException();
                }
            }
            return true;
        }

        public override object Visit(InputStatementNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(IfStatementNode node)
        {
            //Dont change this, pretty sure it is never called. Maybe remove from ASTVisitor.cs.
            throw new NotImplementedException();
        }

        public override object Visit(IfChainStatementNode node)
        {
            Visit(node.ifNode);
            node.elseIfChain.ForEach(i => Visit(i));
            if (node.elseNode.body.Count != 0) Visit(node.elseNode);

            return true;
        }

        public override object Visit(ifNode node)
        {
            st.PushScope();
            Visit(node.predicate);
            Visit(node.body);
            //node.body.ForEach(i => Visit(i));
            st.PopScope();
            return true;
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
            //TODO send help... 1/5 done
            switch (node.Left)
            {
                case variableNode NodeNode:
                    Visit(NodeNode);
                    break;
                case stringNode NodeNode:
                    Visit(NodeNode);
                    break;
                case ExpressionNode NodeNode:
                    Visit(NodeNode);
                    break;
                case BoolNode NodeNode:
                    Visit(NodeNode);
                    break;
                case predicateNode NodeNode:
                    Visit(NodeNode);
                    break;
                default:
                    Console.WriteLine("#### ERROR predicateNode => " + node.Left.GetType());
                    throw new NotImplementedException();
            }
            return true;
        }

        public override object Visit(BoolNode node)
        {
            return true;
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
            return true;
        }

        public override object Visit(IntAssignNode node)
        {
            switch (node.Left)
            {
                case variableNode varNode:
                    Visit(varNode);
                    Symbol symbol = st.CurrentScope().Resolve(varNode.variableName, typeof(int));
                    break;
                case IntDeclarationNode intDclNode:
                    Visit(intDclNode);
                    break;
            }

            switch (node.Right)
            {
                case ExpressionNode exprNode:
                    Visit(exprNode);                  
                    break;
                case InputStatementNode inputNode:
                    Visit(inputNode);
                    break;
            }

            return true;
        }

        public override object Visit(stringAssignNode node)
        {
            switch (node.Left)
            {
                case variableNode varNode:
                    Visit(varNode);
                    Symbol symbol = st.CurrentScope().Resolve(varNode.variableName, typeof(string));
                    break;
                case stringDeclarationNode stringDclNode:
                    Visit(stringDclNode);
                    break;
            }

            Visit(node.Right);
            return true;
        } 

        public override object Visit(InputAssignNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(variableNode node)
        {
            //it's a variable..
            return true;
        }

        public override object Visit(LocationAssignNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(DeclarationNode node)
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
                default:
                    Console.WriteLine($"### ERROR DeclarationNode => {node.GetType().Name}");
                    throw new NotImplementedException();
            }
            return true;
        }

        public override object Visit(IntDeclarationNode node)
        {
            st.CurrentScope().Define(node.VarName.variableName, typeof(int));
            return true;
        }

        public override object Visit(stringDeclarationNode node)
        {
            //TODO should typeof be of stringNode og string?
            st.CurrentScope().Define(node.VarName.variableName, typeof(string));
            return true;
        }

        public override object Visit(stringNode node)
        {
            //Well... idk what to do, its a string.
            return true;
        }

        public override object Visit(LocationDeclarationNode node)
        {
            throw new NotImplementedException();
        }

        public override object Visit(ExpressionNode node)
        {
            switch (node)
            {
                case AdditionNode nodeADD:
                    Visit(nodeADD);
                    break;
                case DivisionNode nodeDIV:
                    Visit(nodeDIV);
                    break;
                case MultiplicationNode nodeMUL:
                    Visit(nodeMUL);
                    break;
                case SubtractionNode nodeSUB:
                    Visit(nodeSUB);
                    break;
                case NumberNode nodeNUM:
                    Visit(nodeNUM);
                    break;
                case ExpressionVarNameNode nodeVAR:
                    //validate the variable.
                    Symbol symbol = st.CurrentScope().Resolve(nodeVAR.VarName, typeof(int));
                    break;
                case ExpressionSoloNode nodeISO:
                    Visit(nodeISO.expr);
                    break;
                default:
                    Console.WriteLine($"### ERROR ExpressionNode => {node.GetType().Name}");
                    throw new NotImplementedException();
            }

            return true;
        }

        public override object Visit(AdditionNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return true;
        }

        public override object Visit(SubtractionNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return true;
        }

        public override object Visit(MultiplicationNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return true;
        }

        public override object Visit(DivisionNode node)
        {
            Visit(node.Left);
            Visit(node.Right);
            return true;
        }

        public override object Visit(NumberNode node)
        {
            return true;
        }
    }
}
