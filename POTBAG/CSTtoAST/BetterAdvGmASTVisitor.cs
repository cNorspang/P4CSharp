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

        public override ProgNode VisitBuffernode(BetterAdvGmParser.BuffernodeContext context)
        {
            Console.WriteLine("Buffer_node");
            BufferNode node = new BufferNode {SetUpNode = (SetupNode) Visit(context.setup())};
            Console.WriteLine($"SETUP NODE IS === {Visit(context.setup())}");
            context.inBlock().ToList().ForEach(i => node.inBlock.Add(Visit(i)));

            return node;
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

            List<string> InnerVal = new List<string>(ctx.GetText().Split("+"));
            InnerVal[0] = InnerVal[0].Substring(4);
            InnerVal[InnerVal.Count - 1] = InnerVal[InnerVal.Count - 1].Remove(InnerVal[InnerVal.Count - 1].Length - 1); 

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

        //TODO right node is never set
        public override ProgNode VisitInt_assign(BetterAdvGmParser.Int_assignContext ctx) {
            Console.WriteLine("Int_assign");
            IntAssignNode node = new IntAssignNode();
            node.Left = (IntDeclarationNode)Visit(ctx.int_declaration());
            
            Console.WriteLine("    Left Child: "+node.Left);
            //hmmmm
            node.Right = node.Right;
            Console.WriteLine("    Right Child: " + node.Right);
            return node;
        }

        //TODO this is never accessed, visitInt_assign grabs element from source
        public override ProgNode VisitInt_declaration(BetterAdvGmParser.Int_declarationContext ctx) {
            Console.WriteLine("int_declaraion");
            
            IntDeclarationNode node = new IntDeclarationNode {VarName = ctx.VAR_NAME().GetText()};
            Console.WriteLine("    Child Varname of Int_declaration: " + node.VarName);
            //Console.WriteLine("yikes: "+node.getVarName());

            return node;
        }

        
        public override ProgNode VisitString_assign(BetterAdvGmParser.String_assignContext ctx) {
            Console.WriteLine("string_assign");
            stringAssignNode node = new stringAssignNode {Left = ctx.string_declaration().VAR_NAME().GetText()};

            Console.WriteLine("    Left child of assign: " + node.Left);

            node.Right = ctx.STRING().GetText();
            Console.WriteLine("    Right child of assign: " + node.Right);

            //Console.WriteLine("string assignment: "+node.getLeft() + " = "+node.getRight());
            return node;

        }

        //TODO this is never accessed, visitstring_assign grabs element from source
        public override ProgNode VisitString_declaration(BetterAdvGmParser.String_declarationContext ctx) {
            Console.WriteLine("string_declaration");
            stringDeclarationNode node = new stringDeclarationNode();
            node.VarName = ctx.VAR_NAME().GetText();
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
                    : new LocationDeclarationNode {VarName = ctx.VAR_NAME().GetText()}
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
            node.VarName = ctx.VAR_NAME().GetText();
            Console.WriteLine("    Child Varname of location_declaration: " + node.VarName);
            return node;
        }

        public override ProgNode VisitTravel_statement([NotNull] BetterAdvGmParser.Travel_statementContext ctx)
        {
            Console.WriteLine("travel_statement");
            TravelStatementNode node = new TravelStatementNode();
            node.Destination = ctx.VAR_NAME().GetText();
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

            switch (op)
            {
                case "PLUS":
                    return (AdditionNode) Visit(ctx.);
            }
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
            OptionStatementNode node = new OptionStatementNode
            {
                Left = ctx.STRING() != null ? ctx.STRING().GetText() : ctx.VAR_NAME().GetText()
            };


            Console.WriteLine("    Child Left of option_statement: " + node.Left);
            ctx.inBlock().ToList().ForEach(i => node.Right.Add(Visit(i)));
            Console.WriteLine("################");
            Console.WriteLine(node.Right.Count());
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
            node.Left = ctx.Payload.GetChild(0).GetText();
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

            Console.WriteLine($"    Operator = {node.Operator}");
            
            //Right hand side
            node.Right = ctx.Payload.GetChild(2).GetText();
            Console.WriteLine($"    Right side = {node.Right}");

            //Visit children, if children are visitable
            ctx.predicate().ToList().ForEach(i => VisitPredicate(i));
            ctx.expression().ToList().ForEach(i => VisitExpression(i));

            return node;
        }

        public override ProgNode VisitInput_assign([NotNull] BetterAdvGmParser.Input_assignContext ctx)
        {
            Console.WriteLine("VisitInput_assign");

            InputAssignNode node = new InputAssignNode();

            if (ctx.string_declaration() != null)
                node.LeftStrDclNode = (stringDeclarationNode)Visit(ctx.string_declaration());
            else
                node.LeftStr = ctx.VAR_NAME().GetText();

            //Console.WriteLine("     VisitInput_assign left  child: " + node.LeftStr + node.LeftStrDclNode.VarName);

            node.Right = (InputStatementNode)Visit(ctx.input_statement());

            //Not needed, is printet in input_statement when Visit is called.
            //node.Right.Text.ForEach(i => Console.WriteLine("     VisitInput_assign right List child: " + i));

            return node;
        }
    }
}