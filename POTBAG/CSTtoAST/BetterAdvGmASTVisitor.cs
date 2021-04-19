using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;

namespace POTBAG.CSTtoAST
{
    public class BetterAdvGmASTVisitor : BetterAdvGmBaseVisitor<ProgNode>
    {
        public override ProgNode VisitProg([NotNull] BetterAdvGmParser.ProgContext context)
        {
            Console.WriteLine("prog");
            ProgNode node = (BufferNode)Visit(context.buffernode());
            return node;
        }

        public override ProgNode VisitBuffernode(BetterAdvGmParser.BuffernodeContext ctx)
        {
            Console.WriteLine("Buffer_node");
            BufferNode node = new BufferNode {SetUpNode = (SetupNode) Visit(ctx.setup())};
            ctx.inBlock().ToList().ForEach(i => node.inBlock.Add(Visit(i)));

            return node;
        }

        public override ProgNode VisitDeclaration([NotNull] BetterAdvGmParser.DeclarationContext ctx)
        {
            return Visit(ctx.GetChild(0));
        }


        public override ProgNode VisitSetup(BetterAdvGmParser.SetupContext ctx) 
        {
            Console.WriteLine("setup");
            SetupNode node = new SetupNode();

            node.Locations = (LocationsSetupNode)Visit(ctx.locationsetup());
            
            
            return node;
        }
    
        //TODO: Discuss whether or not this is needed
        public override ProgNode VisitLocationsetup(BetterAdvGmParser.LocationsetupContext ctx) {
            Console.WriteLine("LocationSetup");
            LocationsSetupNode node = new LocationsSetupNode();

            ctx.locationmapping().ToList().ForEach(i => node.Children.Add((LocationMappingNode)Visit(i)));
            
            Console.WriteLine($"    {ctx.GetText()}");
            return node;
        }
        
        public override ProgNode VisitLocationmapping(BetterAdvGmParser.LocationmappingContext ctx) {
            Console.WriteLine("LocationMapping");

            LocationMappingNode node = new LocationMappingNode();
            string source = ctx.GetText().Substring(0, ctx.GetText().IndexOf('-'));
            string deststring = ctx.GetText().Substring(ctx.GetText().IndexOf('>') + 1);
            
            List<string> destArr = deststring.Split(",").ToList(); 
            //destArr = (destArr.Count - 1, destArr[destArr.Count - 1].Substring(0, destArr[destArr.Count - 1].Length - 1));
            destArr[destArr.Count - 1].Remove(destArr[destArr.Count - 1].Length - 1);
            
            node.Source = source;
            node.Destinations = destArr;

            Console.WriteLine("    Source: " + node.Source);
            Console.WriteLine("    Child:  " + String.Join(',', node.Destinations));
            return node;
        }

        
        public override ProgNode VisitText_statement(BetterAdvGmParser.Text_statementContext ctx) {
            Console.WriteLine("TextStatement");
            TextStatementNode node = new TextStatementNode();
            
            List<ProgNode> InnerVal = new List<ProgNode>();
            string[] textStmtElements = ctx.GetText().Split("+");

            textStmtElements[0] = textStmtElements[0].Substring(4, textStmtElements.Length - 1);
            //not needed anymore... textStmtElements[textStmtElements.Length - 1] = textStmtElements[textStmtElements.Length - 1].Remove(textStmtElements[textStmtElements.Length - 1].Length - 1);

            foreach (string item in textStmtElements)
            {
                if (item.StartsWith('\"'))
                    InnerVal.Add(new stringNode { strVal = item });
                else
                    InnerVal.Add(new variableNode { variableName = item });
            }

            node.Text = InnerVal;
            Console.WriteLine("    Child: " + String.Join(',', node.Text));
            return node;
            //return super.visitText_statement(ctx);
        }
        
        public override ProgNode VisitInput_statement(BetterAdvGmParser.Input_statementContext ctx) {
            Console.WriteLine("InputStatement");
            InputStatementNode node = new InputStatementNode();

            List<string> InnerVal = new List<string>(ctx.GetText().Split("+"));

            //InnerVal.set(0, InnerVal.get(0).replace("userInput", ""));
            InnerVal[0] = InnerVal[0].Replace("userInput", "");
            InnerVal[InnerVal.Count - 1].Remove(InnerVal[InnerVal.Count - 1].Length - 1);
            node.Text = InnerVal;
            Console.WriteLine("    Child: " + String.Join(',',node.Text));

            return node;
        }

        public override ProgNode VisitInt_assign(BetterAdvGmParser.Int_assignContext ctx) {
            Console.WriteLine("Int_assign");
            IntAssignNode node = new IntAssignNode();

            if (ctx.ASSIGN_OPERATOR() != null)
                node.Operator = "ASSIGN_OPERATOR";
            else if (ctx.COMPOUND_OPERATOR() != null)
                node.Operator = "COMPOUND_OPERATOR";
            else
                throw new NotImplementedException();

            if (ctx.variable() != null)
                node.Left = (variableNode)Visit(ctx.variable());
            else if (ctx.int_declaration() != null)
                node.Left = Visit(ctx.int_declaration());
            else
                throw new NotImplementedException();
            
            Console.WriteLine("    Left Child Int_assign: "+node.Left + "\n     Operator child Int_assign: "+node.Operator);
            
            if (ctx.expression() != null)
                node.Right = Visit(ctx.expression());
            else if (ctx.input_statement() != null)
                node.Right = Visit(ctx.input_statement());
            else
                throw new NotImplementedException();

            Console.WriteLine("    Right Child Int_assign: " + node.Right);
            return node;
        }

        //TODO this is never accessed, visitInt_assign grabs element from source
        public override ProgNode VisitInt_declaration(BetterAdvGmParser.Int_declarationContext ctx) {
            Console.WriteLine("int_declaraion");
            
            IntDeclarationNode node = new IntDeclarationNode {VarName = (variableNode)Visit(ctx.variable())};
            Console.WriteLine("    Child Varname of Int_declaration: " + node.VarName);
            //Console.WriteLine("yikes: "+node.getVarName());

            return node;
        }

        
        public override ProgNode VisitString_assign(BetterAdvGmParser.String_assignContext ctx) {
            Console.WriteLine("string_assign");
            //if check på left vari || string_dec
            stringAssignNode node = new stringAssignNode();

            if (ctx.string_declaration() != null)
                node.Left = (stringDeclarationNode)Visit(ctx.string_declaration());
            else if (ctx.variable() != null)
                node.Left = (variableNode)Visit(ctx.variable());
            else
                throw new NotImplementedException();

            Console.WriteLine("    Left child of assign: " + node.Left);

            node.Right = (stringNode)Visit(ctx.string_obj());
            Console.WriteLine("    Right child of assign: " + node.Right);

            //Console.WriteLine("string assignment: "+node.getLeft() + " = "+node.getRight());
            return node;

        }

        //TODO this is never accessed, visitstring_assign grabs element from source
        public override ProgNode VisitString_declaration(BetterAdvGmParser.String_declarationContext ctx) {
            Console.WriteLine("string_declaration");
            stringDeclarationNode node = new stringDeclarationNode();
            node.VarName = (variableNode)Visit(ctx.variable());
            Console.WriteLine("    Child Varname of string_Declaration: " + node.VarName);
            return node;
        }
        
        public override ProgNode VisitLocation_assign([NotNull] BetterAdvGmParser.Location_assignContext ctx)
        {
            Console.WriteLine("location_assign");

            LocationAssignNode node = new LocationAssignNode
            {
                Left = ctx.location_declaration() != null
                    ? (LocationDeclarationNode) VisitLocation_declaration(ctx.location_declaration())
                    : new LocationDeclarationNode {VarName =  (variableNode)Visit(ctx.variable())}
            };


            Console.WriteLine("    Child Left of location_assign: " + node.Left.VarName);

            ctx.inBlock().ToList().ForEach(i => node.Right.Add(Visit(i)));

            node.Right.ForEach(i => Console.WriteLine($"LIST ENTRY: {i} location"));

            return node;
        }

        public override ProgNode VisitLocation_declaration([NotNull] BetterAdvGmParser.Location_declarationContext ctx)
        {
            Console.WriteLine("location_declaration");
            LocationDeclarationNode node = new LocationDeclarationNode();
            node.VarName =  (variableNode)Visit(ctx.variable());
            Console.WriteLine("    Child Varname of location_declaration: " + node.VarName);
            return node;
        }

        public override ProgNode VisitTravel_statement([NotNull] BetterAdvGmParser.Travel_statementContext ctx)
        {
            Console.WriteLine("travel_statement");
            TravelStatementNode node = new TravelStatementNode();
            node.Destination = (variableNode)Visit(ctx.variable());
            Console.WriteLine("    Child destination of Travel_statement: " + node.Destination);
            return node;
        }

        public override ProgNode VisitExpression(BetterAdvGmParser.ExpressionContext ctx)
        {

            string op = "";
            if (ctx.PLUS_OPERATOR() != null) { op = "PLUS"; }
            else if (ctx.DIVISION_OPERATOR() != null) { op = "DIVISION"; }
            else if (ctx.TIMES_OPERATOR() != null) { op = "TIMES"; } 
            else if (ctx.MINUS_OPERATOR() != null) { op = "MINUS"; }
            else if (ctx.NUM() != null) { op = "NUM"; }
            else if (ctx.variable() != null) { op = "VAR"; }
            else if (ctx.PAREN_LEFT() != null) { op = "ISO"; }

            ExpressionNode node;

            switch (op)
            {
                case "PLUS":
                    Console.WriteLine("ADD     "+ ctx.GetChild(0).GetText() +" "+ctx.GetChild(2).GetText());
                    AdditionNode nodeADD = new AdditionNode();
                    nodeADD.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeADD.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeADD;
                    break;
                case "DIVISION":
                    Console.WriteLine("DIV     " + ctx.GetChild(0).GetText() + " " + ctx.GetChild(2).GetText());
                    DivisionNode nodeDIV = new DivisionNode();
                    nodeDIV.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeDIV.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeDIV;
                    break;
                case "TIMES":
                    Console.WriteLine("TIMES   " + ctx.GetChild(0).GetText() + " " + ctx.GetChild(2).GetText());
                    MultiplicationNode nodeMUL = new MultiplicationNode();
                    nodeMUL.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeMUL.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeMUL;
                    break;
                case "MINUS":
                    Console.WriteLine("SUB     " + ctx.GetChild(0).GetText() + " " + ctx.GetChild(2).GetText());

                    SubtractionNode nodeSUB = new SubtractionNode();
                    nodeSUB.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeSUB.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeSUB;
                    break;
                case "NUM":
                    Console.WriteLine("NUM     " + ctx.NUM().GetText());
                    NumberNode nodeNUM = new NumberNode();
                    nodeNUM.Value = int.Parse(ctx.NUM().GetText());
                    node = nodeNUM;
                    break;
                case "VAR":
                    Console.WriteLine("VAR     " + ctx.variable().GetText());
                    ExpressionVarNameNode nodeVAR = new ExpressionVarNameNode();
                    nodeVAR.VarName = ctx.variable().GetText();
                    node = nodeVAR;
                    break;
                case "ISO":
                    Console.WriteLine("ISO     " + ctx.expression(0).GetText());
                    ExpressionSoloNode nodeISO = new ExpressionSoloNode();
                    nodeISO.expr = (ExpressionNode)Visit(ctx.GetChild(1));
                    node = nodeISO;
                    break;
                default:
                    throw new NotImplementedException();
                    break;
            }

            return node;


        }

        public override ProgNode VisitChoice_statement([NotNull] BetterAdvGmParser.Choice_statementContext ctx)
        {
            Console.WriteLine("choice_statement");
            ChoiceStatementNode node = new ChoiceStatementNode();

            node.Options = ctx.option_statment().Select(item => (OptionStatementNode) VisitOption_statment(item))
                .Where(temp => temp != null).ToList();

            

            node.Options.ForEach(i => Console.WriteLine("    Child option of choice_statement: " + i.Left + " + codeblock (Option_statement)"));

            return node;
        }

        //stavefejl statEment
        public override ProgNode VisitOption_statment([NotNull] BetterAdvGmParser.Option_statmentContext ctx)
        {
            Console.WriteLine("option_statement");
            OptionStatementNode node = new OptionStatementNode();

            if(ctx.string_obj() != null)
                node.Left = Visit(ctx.string_obj());
            else if(ctx.variable() != null)
                node.Left = Visit(ctx.variable());


            Console.WriteLine("    Child Left of option_statement: " + node.Left);
            ctx.inBlock().ToList().ForEach(i => node.Right.Add(Visit(i)));
            node.Right.ForEach(i => Console.WriteLine($"LIST ENTRY: {i}"));
            //node.RightStatement.ForEach(i => Console.WriteLine("    Child stmt of option_statement: " + i.GetText()));

            return node;
        }

        public override ProgNode VisitIf_chain_statement([NotNull] BetterAdvGmParser.If_chain_statementContext ctx)
        {
            Console.WriteLine("if_chain_statement");
            IfChainStatementNode node = new IfChainStatementNode();

            node.ifNode = (ifNode)Visit(ctx.if_statement());
            ctx.else_if_statement().ToList().ForEach(i => node.elseIfChain.Add((ElseIfStatementNode)Visit(i)));
            if(ctx.else_statement() != null)
                node.elseNode = (elseNode)Visit(ctx.else_statement());

            return node;
        }
        public override ProgNode VisitIf_statement(BetterAdvGmParser.If_statementContext ctx)
        {
            Console.WriteLine("if_statement");
            ifNode node = new ifNode();
            

            node.predicate = (predicateNode)VisitPredicate(ctx.predicate());
            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));

            return node;
        }

        public override ProgNode VisitElse_if_statement([NotNull] BetterAdvGmParser.Else_if_statementContext ctx)
        {
            Console.WriteLine("elif_statement");
            ElseIfStatementNode node = new ElseIfStatementNode();

            node.predicate = (predicateNode)VisitPredicate(ctx.predicate());
            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));

            return node;
        }

        public override ProgNode VisitElse_statement([NotNull] BetterAdvGmParser.Else_statementContext ctx)
        {
            Console.WriteLine("else_statement");
            elseNode node = new elseNode();

            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));
            return node;
        }

        public override ProgNode VisitPredicate(BetterAdvGmParser.PredicateContext ctx)
        {
            predicateNode node = new predicateNode();
            Console.WriteLine("predicate");

            //Left hand side
            node.Left = Visit(ctx.GetChild(0));
            Console.WriteLine($"    Left side = {node.Left}");
            
            //Checking the operator
            if (ctx.AND_OPERATOR() != null) { node.Operator = "AND";} 
            else if (ctx.OR_OPERATOR() != null) { node.Operator = "OR";}
            else if (ctx.BOOL_CMP_OPERATOR() != null)
            {
                node.Operator = ctx.BOOL_CMP_OPERATOR().GetText() switch
                {
                    "==" => "EQUALS",
                    "is" => "EQUALS",
                    "!=" => "NOT_EQUALS", 
                    "is not" => "NOT_EQUALS",
                    _ => node.Operator
                };
            }
            else if (ctx.CMP_OPERATOR() != null)
            {
                node.Operator = ctx.CMP_OPERATOR().GetText() switch
                {
                    ">" => "GREATER_THAN",
                    "greater than" => "GREATER_THAN",
                    ">=" => "GREATER_THAN_EQUAL",
                    "<" => "LESS_THAN",
                    "less than" => "LESS_THAN",
                    "<=" => "LESS_THAN_EQUAL",
                    _ => node.Operator
                };
            }
            else
            {
                return node;
            }

            Console.WriteLine($"    Operator = {node.Operator}");

            //Right hand side
            node.Right = Visit(ctx.GetChild(2));
            Console.WriteLine($"    Right side = {node.Right}");


            return node;
        }

        public override ProgNode VisitVariable([NotNull] BetterAdvGmParser.VariableContext ctx)
        {
            variableNode node = new variableNode();
            node.variableName = ctx.VAR_NAME().GetText();
            return node;
        }

        public override ProgNode VisitString_obj([NotNull] BetterAdvGmParser.String_objContext ctx)
        {
            stringNode node = new stringNode();
            node.strVal = ctx.STRING().GetText();
            return node;
        }

        public override ProgNode VisitBool_obj([NotNull] BetterAdvGmParser.Bool_objContext ctx)
        {
            BoolNode node = new BoolNode();
            node.value = bool.Parse(ctx.BOOL().GetText());
            return node;
        }

        public override ProgNode VisitInput_assign([NotNull] BetterAdvGmParser.Input_assignContext ctx)
        {
            Console.WriteLine("VisitInput_assign");

            InputAssignNode node = new InputAssignNode();

            if (ctx.string_declaration() != null)
                node.LeftStrDclNode = (stringDeclarationNode)Visit(ctx.string_declaration());
            else
                node.LeftStr = (variableNode)Visit(ctx.variable());

            //Console.WriteLine("     VisitInput_assign left  child: " + node.LeftStr + node.LeftStrDclNode.VarName);

            node.Right = (InputStatementNode)Visit(ctx.input_statement());

            //Not needed, is printet in input_statement when Visit is called.
            //node.Right.Text.ForEach(i => Console.WriteLine("     VisitInput_assign right List child: " + i));

            return node;
        }
    }
}