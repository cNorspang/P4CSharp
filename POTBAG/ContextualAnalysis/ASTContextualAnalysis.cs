using POTBAG.CSTtoAST;
using POTBAG.Exceptions;
using System;
using System.Collections.Generic;
using System.Text;
using static POTBAG.DebugPrinter;

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
            foreach (ProgNode item in node)
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
                        Console.WriteLine($"### ERROR List<ProgNode> (inBlock) => {string.Join(',', node)}");
                        POTBAGErrorListener.Report(new inBlockErrorException());
                        break;
                }
            }
            return true;
        }

        public override object Visit(BufferNode node)
        {
            #region CBanner
            Ccwl("   ______            __            __              __   ___                __           _     ");
            Ccwl("  / ____/___  ____  / /____  _  __/ /___  ______ _/ /  /   |  ____  ____ _/ /_  _______(_)____");
            Ccwl(" / /   / __ \\/ __ \\/ __/ _ \\| |/_/ __/ / / / __ `/ /  / /| | / __ \\/ __ `/ / / / / ___/ / ___/");
            Ccwl("/ /___/ /_/ / / / / /_/  __/>  </ /_/ /_/ / /_/ / /  / ___ |/ / / / /_/ / / /_/ (__  ) (__  ) ");
            Ccwl("\\____/\\____/_/ /_/\\__/\\___/_/|_|\\__/\\__,_/\\__,_/_/  /_/  |_/_/ /_/\\__,_/_/\\__, /____/_/____/  ");
            Ccwl($"                                                                         /____/ feat. {Environment.UserName}  \n");
            #endregion
            
            #region debugSplit
            /*
            Ccwl(
                "\n   ______            __            __              __   ___                __           _     " +
                "\n  / ____/___  ____  / /____  _  __/ /___  ______ _/ /  /   |  ____  ____ _/ /_  _______(_)____" +
                "\n / /   / __ \\/ __ \\/ __/ _ \\| |/_/ __/ / / / __ `/ /  / /| | / __ \\/ __ `/ / / / / ___/ / ___/" +
                "\n/ /___/ /_/ / / / / /_/  __/>  </ /_/ /_/ / /_/ / /  / ___ |/ / / / /_/ / / /_/ (__  ) (__  ) " +
                "\n\\____/\\____/_/ /_/\\__/\\___/_/|_|\\__/\\__,_/\\__,_/_/  /_/  |_/_/ /_/\\__,_/_/\\__, /____/_/____/  " +
                "\n                                                                         /____/               \n");
            */
            #endregion
            
            Visit(node.SetUpNode);
            Visit(node.inBlock);
            st.ValidateTravelArrangement();


            //for debugging
            st.PrintAllKeysInSymbolTable();
            return true;
        }

        public override object Visit(SetupNode node)
        {
            st.PushScope();
            Visit(node.Locations);
            Visit(node.PlayerNode);
            st.PopScope();

            return true;
        }

        public override object Visit(LocationsSetupNode node)
        {
            try
            {
                st.PushScope();
                node.Children.ForEach(n => Visit(n));
                st.PopScope();
            }
            catch (Exception e)
            {
                POTBAGErrorListener.Report( new LocationSetupErrorException(e.Message));
            }
            
            return true;
        }

        public override object Visit(LocationMappingNode node)
        {
            st.DefineNewTravelSource(node);
            return true;
        }

        public override object Visit(PlayerSetupNode node)
        {
            node.assignNodes.ForEach(i => Visit(i));
            return true;
        }

        public override object Visit(StatementNode node)
        {
            switch (node)
            {
                case TextStatementNode statementNode:
                    Visit(statementNode);
                    break;
                case WhileStatementNode statementNode:
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
            foreach (ProgNode item in node.Text)
            {
                switch (item)
                {
                    case DotNotaionNode dotNode:
                        Visit(dotNode);
                        st.ResolvePlayerVariable(dotNode.variableName, typeof(string), true);
                        break;
                    case variableNode varNode:
                        Visit(varNode);
                        //Validate variable
                        st.CurrentScope().Resolve(varNode.variableName, typeof(string), true);
                        break;
                    case stringNode strNode:
                        Visit(strNode);
                        break;
                    default:
                        throw new BennoException($"### ERROR TextStatementNode => {node.GetType().Name}");
                }
            }
            return true;
        }

        public override object Visit(WhileStatementNode node)
        {
            st.PushScope();
            Visit(node.predicate);
            Visit(node.body);
            st.PopScope();
            return true;
        }

        public override object Visit(InputStatementNode node)
        {
            foreach (ProgNode item in node.Text)
            {
                switch (item)
                {
                    case DotNotaionNode dotNode:
                        Visit(dotNode);
                        st.ResolvePlayerVariable(dotNode.variableName, typeof(string), false);
                        break;
                    case variableNode varNode:
                        Visit(varNode);
                        //Validate variable
                        st.CurrentScope().Resolve(varNode.variableName, typeof(string), false);
                        break;
                    case stringNode strNode:
                        Visit(strNode);
                        break;
                    default:
                        throw new BennoException($"### ERROR InputStatementNode => {node.GetType().Name}");
                }
            }
            return true;
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
            st.PopScope();
            return true;
        }

        public override object Visit(ElseIfStatementNode node)
        {
            st.PushScope();
            Visit(node.predicate);
            Visit(node.body);
            st.PopScope();
            return true;
        }

        public override object Visit(elseNode node)
        {
            st.PushScope();
            Visit(node.body);
            st.PopScope();
            return true;
        }
        //Absolut horrible code.. good luck reading
        public override object Visit(predicateNode node)
        {
            switch (node.Left)
            {
                case DotNotaionNode dotNode:
                    Visit(dotNode);
                    if (node.Right == null)
                    {
                        st.ResolvePlayerVariable(dotNode.variableName, typeof(bool), true);
                        break;
                    }
                    Symbol symbolDOT = st.CurrentScope().Resolve(dotNode.variableName);

                    switch (node.Right)
                    {
                        case stringNode strNode:
                            if (symbolDOT.GetSymbolType() != typeof(string)) POTBAGErrorListener.Report(
                                new TypeErrorException(typeof(string).ToString(), symbolDOT.GetSymbolType().ToString()));
                            Visit(strNode);
                            break;
                        case DotNotaionNode dotNodeR:
                            st.ResolvePlayerVariable(dotNodeR.variableName, symbolDOT.GetSymbolType(), true);
                            Visit(dotNodeR);
                            break;
                        case variableNode varNode:
                            st.CurrentScope().Resolve(varNode.variableName, symbolDOT.GetSymbolType(), true);
                            if (symbolDOT.GetSymbolType() == typeof(LocationDeclarationNode)) throw new NotImplementedException("nononono, plz dont use locations as predicates.");
                            Visit(varNode);
                            break;
                        case ExpressionNode exprNode:
                            if (symbolDOT.GetSymbolType() != typeof(int)) POTBAGErrorListener.Report(
                                new TypeErrorException(typeof(int).ToString(), symbolDOT.GetSymbolType().ToString()));
                            Visit(exprNode);
                            break;
                        case BoolNode boolNode:
                            if (symbolDOT.GetSymbolType() != typeof(bool)) POTBAGErrorListener.Report(
                                new TypeErrorException(typeof(bool).ToString(), symbolDOT.GetSymbolType().ToString()));
                            Visit(boolNode);
                            break;
                        default:
                            throw new BennoException("predicate variable right node no wuuurking");
                    }

                    break;
                case variableNode NodeNode:
                    Visit(NodeNode);

                    if (node.Right == null) 
                    {
                        st.CurrentScope().Resolve(NodeNode.variableName, typeof(bool), true);
                        break;
                    }
                    Symbol symbol = st.CurrentScope().Resolve(NodeNode.variableName);

                    switch (node.Right)
                    {
                        case stringNode strNode:
                            if (symbol.GetSymbolType() != typeof(string)) POTBAGErrorListener.Report( 
                                new TypeErrorException(typeof(string).ToString(), symbol.GetSymbolType().ToString()));
                            Visit(strNode);
                            break;
                        case DotNotaionNode dotNode:
                            st.ResolvePlayerVariable(dotNode.variableName, symbol.GetSymbolType(), true);
                            Visit(dotNode);
                            break;
                        case variableNode varNode:
                            st.CurrentScope().Resolve(varNode.variableName, symbol.GetSymbolType(), true);
                            if (symbol.GetSymbolType() == typeof(LocationDeclarationNode)) throw new NotImplementedException("nononono, plz dont use locations as predicates.");
                            Visit(varNode);
                            break;
                        case ExpressionNode exprNode:
                            if (symbol.GetSymbolType() != typeof(int)) POTBAGErrorListener.Report(
                                new TypeErrorException(typeof(int).ToString(), symbol.GetSymbolType().ToString()));
                            Visit(exprNode);
                            break;
                        case BoolNode boolNode:
                            if (symbol.GetSymbolType() != typeof(bool)) POTBAGErrorListener.Report(
                                new TypeErrorException(typeof(bool).ToString(), symbol.GetSymbolType().ToString()));
                            Visit(boolNode);
                            break;
                        default:
                            throw new BennoException("predicate variable right node no wuuurking");
                    }

                    break;
                case stringNode NodeNode:
                    Visit(NodeNode);
                    variableNode strVarNode = (variableNode)node.Right;
                    st.CurrentScope().Resolve(strVarNode.variableName, typeof(string), true);
                    Visit(strVarNode);
                    break;
                case ExpressionNode NodeNode:
                    Visit(NodeNode);
                    switch (node.Right)
                    {
                        case variableNode exprVarNode:
                            st.CurrentScope().Resolve(exprVarNode.variableName, typeof(int), true);
                            Visit(exprVarNode);
                            break;
                        case ExpressionNode exprExprNode:
                            Visit(exprExprNode);
                            break;
                        default:
                            throw new BennoException("predicate expr node no wuuurking");
                            break;
                    }
                    break;
                case BoolNode NodeNode:
                    Visit(NodeNode);
                    if (node.Right != null)
                    {
                        variableNode boolVarNode = (variableNode)node.Right;
                        st.CurrentScope().Resolve(boolVarNode.variableName, typeof(bool), true);
                        Visit(boolVarNode);
                    }                   
                    break;
                case predicateNode NodeNode:
                    Visit(NodeNode);
                    Visit(node.Right);
                    break;
                default:
                    Console.WriteLine("#### ERROR predicateNode => " + node.Left.GetType());
                    throw new BennoException();
            }
            return true;
        }

        public override object Visit(BoolNode node)
        {
            return true;
        }

        public override object Visit(TravelStatementNode node)
        {
            st.ResolveTravel(node, st.CurrentScope());
            return true;
        }

        public override object Visit(ChoiceStatementNode node)
        {
            node.Options.ForEach(i => Visit(i));
            return true;
        }

        public override object Visit(OptionStatementNode node)
        {
            switch (node.Left)
            {
                case DotNotaionNode dotNode:
                    Visit(dotNode);
                    st.ResolvePlayerVariable(dotNode.variableName, typeof(string), true);
                    break;
                case variableNode varNode:
                    Visit(varNode);
                    Symbol symbol = st.CurrentScope().Resolve(varNode.variableName, typeof(string), true);
                    break;
                case stringNode strDclNode:
                    Visit(strDclNode);
                    break;
                default:
                    throw new BennoException($"### ERROR OptionStatementNode Left => {node.Left.GetType().Name}");
            }
            node.Right.ForEach(i => Visit(i));

            return true;
        }

        public override object Visit(AssignNode node)
        {
            Symbol symbol = new Symbol(null, null);
            switch (node)
            {
                case IntAssignNode intAssignNode:
                    symbol = (Symbol)Visit(intAssignNode);
                    break;
                case stringAssignNode stringAssignNode:
                    symbol = (Symbol)Visit(stringAssignNode);
                    break;
                case InputAssignNode inputAssignNode:
                    symbol = (Symbol)Visit(inputAssignNode);
                    break;
                case LocationAssignNode locationAssignNode:
                    symbol = (Symbol)Visit(locationAssignNode);
                    break;
                case BoolAssignNode boolAssignNode:
                    symbol = (Symbol)Visit(boolAssignNode);
                    break;
            }

            if(symbol != null) symbol.SetContentStatus(Symbol.AssignedStatus.full);

            return true;
        }

        public override object Visit(IntAssignNode node)
        {
            Symbol symbol = new Symbol(null, null);
            switch (node.Left)
            {
                case DotNotaionNode dotNode:
                    symbol = st.ResolvePlayerVariable(dotNode.variableName, typeof(string), false);
                    Visit(dotNode);
                    break;
                case variableNode varNode:
                    Visit(varNode);
                    symbol = st.CurrentScope().Resolve(varNode.variableName, typeof(int), false);
                    break;
                case IntDeclarationNode intDclNode:
                    symbol = (Symbol)Visit(intDclNode);
                    break;
            }
            
            //TODO inputStmt cannot take intergers.. also IF this should be implemented *correct* it should be done in Input_assign
            switch (node.Right)
            {
                case ExpressionNode exprNode:
                    Visit(exprNode);                  
                    break;
                case InputStatementNode inputNode:
                    Visit(inputNode);
                    break;
            }

            return symbol;
        }

        public override object Visit(stringAssignNode node)
        {
            Symbol symbol = new Symbol(null, null);

            switch (node.Left)
            {
                case DotNotaionNode dotNode:
                    Visit(dotNode);
                    symbol = st.ResolvePlayerVariable(dotNode.variableName, typeof(string), false);
                    break;
                case variableNode varNode:
                    Visit(varNode);
                    symbol = st.CurrentScope().Resolve(varNode.variableName, typeof(string), false);
                    break;
                case stringDeclarationNode stringDclNode:
                    symbol = (Symbol)Visit(stringDclNode);
                    break;
                default:
                    throw new BennoException($"### ERROR stringAssignNode => {node.GetType().Name}");
            }
            //can only be one string_obj node so just a visit
            Visit(node.Right);
            return symbol;
        }

        public override object Visit(BoolAssignNode node)
        {
            Symbol symbol = new Symbol(null, null);

            switch (node.Left)
            {
                case DotNotaionNode dotNode:
                    Visit(dotNode);
                    symbol = st.ResolvePlayerVariable(dotNode.variableName, typeof(bool), false);
                    break;
                case variableNode varNode:
                    Visit(varNode);
                    symbol = st.CurrentScope().Resolve(varNode.variableName, typeof(bool), false);
                    break;
                case BoolDeclarationNode boolDclNode:
                    symbol = (Symbol)Visit(boolDclNode);
                    break;
                default:
                    throw new BennoException($"### ERROR boolAssignNode => {node.GetType().Name}");
            }
            Visit(node.Right);
            return symbol;
        }

      

        public override object Visit(InputAssignNode node)
        {
            Symbol symbol = new Symbol(null, null);

            switch (node.Left)
            {
                case DotNotaionNode dotNode:
                    Visit(dotNode);
                    symbol = st.ResolvePlayerVariable(dotNode.variableName, typeof(string), false);
                    break;
                case variableNode varNode:
                    Visit(varNode);
                    symbol = st.CurrentScope().Resolve(varNode.variableName, typeof(string), false);
                    break;
                case stringDeclarationNode strDclNode:
                    symbol = (Symbol)Visit(strDclNode);
                    break;
                default:
                    throw new BennoException($"### ERROR InputAssignNode => {node.Left.GetType().Name}");
            }
            //can only be one string_obj node so just a visit
            Visit(node.Right);
            return symbol;
        }

        
        //TODO: Jeg har brug for en voksens hjælp
        public override object Visit(DotNotaionNode node)
        {
            return true;
        }

        public override object Visit(variableNode node)
        {
            //it's a variable..
            return true;
        }

        public override object Visit(LocationAssignNode node)
        {
            /* This makes the location exist in its own scope instead of main.
             * This is very much on purpose, since it allows Scope.cs to search
             * for location via enclosing scopes.
             */
            st.PushScope();

            Symbol symbol = new Symbol(null, null);

            switch (node.Left)
            {
                case variableNode varNode:
                    Visit(varNode);
                    symbol = st.CurrentScope().Resolve(varNode.variableName, typeof(LocationDeclarationNode), false);
                    break;
                case LocationDeclarationNode locationDclNode:
                    symbol = (Symbol)Visit(locationDclNode);
                    break;
            }

            Visit(node.Right);
            st.PopScope();
            return symbol;
        }

        public override object Visit(DeclarationNode node)
        {
            Symbol symbol = new Symbol(null, null);

            switch (node)
            {
                case IntDeclarationNode intdeclarationNode:
                    symbol = (Symbol)Visit(intdeclarationNode);
                    break;
                case stringDeclarationNode stringDeclarationNode:
                    symbol = (Symbol)Visit(stringDeclarationNode);
                    break;
                case LocationDeclarationNode locationDeclarationNode:
                    symbol = (Symbol)Visit(locationDeclarationNode);
                    break;
                case BoolDeclarationNode boolDeclarationNode:
                    symbol = (Symbol)Visit(boolDeclarationNode);
                    break;
                default:
                    throw new BennoException($"### ERROR DeclarationNode => {node.GetType().Name}");
            }
            return symbol;
        }

        public override object Visit(IntDeclarationNode node)
        {
            Symbol symbol = st.CurrentScope().Define(node.VarName.variableName, typeof(int));
            return symbol;
        }

        public override object Visit(stringDeclarationNode node)
        {
            Symbol symbol = st.CurrentScope().Define(node.VarName.variableName, typeof(string));
            return symbol;
        }

        public override object Visit(BoolDeclarationNode node)
        {
            Symbol symbol = st.CurrentScope().Define(node.VarName.variableName, typeof(bool));
            return symbol;
        }

        public override object Visit(stringNode node)
        {
            return true;
        }

        public override object Visit(LocationDeclarationNode node)
        {
            Symbol symbol = st.CurrentScope().Define(node.VarName.variableName, typeof(LocationDeclarationNode));
            return symbol;
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
                    Symbol symbol = st.CurrentScope().Resolve(nodeVAR.VarName, typeof(int), true);
                    break;
                case ExpressionSoloNode nodeISO:
                    Visit(nodeISO.expr);
                    break;
                case RandomExpressionNode nodeRND:
                    Visit(nodeRND);
                    break;
                default:
                    throw new BennoException($"### ERROR ExpressionNode => {node.GetType().Name}");
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

        public override object Visit(RandomExpressionNode node)
        {
            if(node.MinValue != null)
            {
                Visit(node.MinValue);
                Visit(node.MaxValue);
            }
            else
                return true;

            return false;
        }
    }
}
