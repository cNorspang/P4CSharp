using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;

namespace POTBAG.CSTtoAST
{
    public class BetterAdvGmASTVisitor : BetterAdvGmBaseVisitor<ProgNode>
    {
        public override ProgNode VisitProg([NotNull] BetterAdvGmParser.ProgContext context)
        {
            Console.WriteLine("prog");
            return base.VisitProg(context); 
        }

        public override ProgNode VisitSetup(BetterAdvGmParser.SetupContext ctx) 
        {
            Console.WriteLine("setup");
            return base.VisitSetup(ctx);
        }
    
        //TODO: Discuss whether or not this is needed
        public override ProgNode VisitLocationsetup(BetterAdvGmParser.LocationsetupContext ctx) {
            Console.WriteLine("LocationSetup");
            LocationsSetupNode node = new LocationsSetupNode();
            List<LocationMappingNode> childrenNodes = new List<LocationMappingNode>();
         
            Console.WriteLine($"    {ctx.GetText()}");
            return base.VisitLocationsetup(ctx);
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
            InnerVal[0] = InnerVal[0].Replace("Text ", "");

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
            node.Left = ctx.int_declaration().VAR_NAME().GetText();
            Console.WriteLine("    Left Child: "+node.Left);
            //hmm
            node.Right = node.Right;
            Console.WriteLine("    Right Child: " + node.Right);
            return node;
        }

        //TODO this is never accessed, visitInt_assign grabs element from source
        public override ProgNode VisitInt_declaration(BetterAdvGmParser.Int_declarationContext ctx) {
            Console.WriteLine("int_declaraion");

            IntDeclarationNode node = new IntDeclarationNode();
            node.VarName = ctx.VAR_NAME().GetText();
            Console.WriteLine("    Child Varname of Int_declaration: " + node.VarName);
            //Console.WriteLine("yikes: "+node.getVarName());

            return node;
        }

        
        public override ProgNode VisitString_assign(BetterAdvGmParser.String_assignContext ctx) {
            Console.WriteLine("string_assign");
            stringAssignNode node = new stringAssignNode();

            node.Left = ctx.string_declaration().VAR_NAME().GetText();
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

            LocationAssignNode node = new LocationAssignNode();

            if (ctx.location_declaration() != null)
            {
                node.Left = (LocationDeclarationNode)VisitLocation_declaration(ctx.location_declaration());
            }
            else
            {
                node.Left = new LocationDeclarationNode { VarName = ctx.VAR_NAME().GetText() };             
            }
            Console.WriteLine("    Child Left of location_assign: " + node.Left.VarName);
            
            //TODO This is shit and should be changed. I does not call any visits and does not reflect the order.
            node.RightDeclaration = ctx.declaration().ToList();
            node.RightAssign = ctx.assign().ToList();
            node.RightExpression = ctx.expression().ToList();
            node.RightStatement = ctx.statement().ToList();

            node.RightDeclaration.ForEach(i => Console.WriteLine("    Child dcl of location_assign: " + i.GetText()));
            node.RightAssign.ForEach(i => Console.WriteLine("    Child asg of location_assign: " + i.GetText()));
            node.RightExpression.ForEach(i => Console.WriteLine("    Child expr of location_assign: " + i.GetText()));
            node.RightStatement.ForEach(i => Console.WriteLine("    Child stmt of location_assign: " + i.GetText()));

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

        public override ProgNode VisitChoice_statement([NotNull] BetterAdvGmParser.Choice_statementContext ctx)
        {
            Console.WriteLine("choice_statement");
            ChoiceStatementNode node = new ChoiceStatementNode();

            List<OptionStatementNode> list = new List<OptionStatementNode>();

            foreach (var item in ctx.option_statment())
            {
                var temp = (OptionStatementNode)VisitOption_statment(item);
                if (temp != null) { list.Add(temp); }
            }

            node.Options = list;

            node.Options.ForEach(i => Console.WriteLine("    Child option of choice_statement: " + i.Left + " + codeblock (Option_statement)"));

            return node;
        }

        //stavefejl statEment
        public override ProgNode VisitOption_statment([NotNull] BetterAdvGmParser.Option_statmentContext ctx)
        {
            Console.WriteLine("option_statement");

            OptionStatementNode node = new OptionStatementNode();

            if (ctx.STRING() != null)
            {
                node.Left = ctx.STRING().GetText();
            }
            else
            {
                node.Left = ctx.VAR_NAME().GetText();
            }
            Console.WriteLine("    Child Left of option_statement: " + node.Left);

            //TODO This is shit and should be changed. I does not call any visits and does not reflect the order.
            node.RightDeclaration = ctx.declaration().ToList();
            node.RightAssign = ctx.assign().ToList();
            node.RightExpression = ctx.expression().ToList();
            node.RightStatement = ctx.statement().ToList();

            node.RightDeclaration.ForEach(i => Console.WriteLine("    Child dcl of option_statement: " + i.GetText()));
            node.RightAssign.ForEach(i => Console.WriteLine("    Child asg of option_statement: " + i.GetText()));
            node.RightExpression.ForEach(i => Console.WriteLine("    Child expr of option_statement: " + i.GetText()));
            node.RightStatement.ForEach(i => Console.WriteLine("    Child stmt of option_statement: " + i.GetText()));

            return node;
        }
        
        public override ProgNode VisitPredicate(BetterAdvGmParser.PredicateContext ctx)
        {
            Console.WriteLine("========================================================");
            predicateNode node = new predicateNode();
            if (ctx.AND_OPERATOR() != null)
            {
                Console.WriteLine($"AND OPERATOR DETECTED = {ctx.AND_OPERATOR()}");
                node.Operator = "AND";
            } 
            else if (ctx.OR_OPERATOR() != null)
            {
                Console.WriteLine($"OR OPERATOR DETECTED  = {ctx.OR_OPERATOR()}");
                node.Operator = "OR";
            }
            else if (ctx.CMP_OPERATOR() != null)
            {
                Console.WriteLine($"Compare Opreator Detected = {ctx.CMP_OPERATOR()}");
                node.Left = ctx.STRING().GetText();
                Console.WriteLine(node.Left);
                node.Right = ctx.
                node.Operator = ctx.CMP_OPERATOR().GetText() switch
                {
                    "==" => "EQUALS",
                    "is" => "EQUALS",
                    "!=" => "NOT_EQUALTS",
                    "is not" => "NOT_EQUALTS",
                    ">=" => "GREATER_THAN",
                    "greater than" => "GREATER_THAN",
                    "<=" => "LESS_THAN",
                    "less than" => "LESS_THAN",
                    _ => node.Operator
                };
            }
            Console.WriteLine("========================================================");

            return base.VisitPredicate(ctx);
        }
    }
}