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

            Console.WriteLine("    Source = " + node.Source);
            Console.WriteLine("    Child: " + String.Join(',', node.Destinations));
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
            node.Right = node.Right;
            Console.WriteLine("    Right Child: " + node.Right);
            return node;
        }

        //TODO this is never accessed, visitInt_assign grabs element from source
        public override ProgNode VisitInt_declaration(BetterAdvGmParser.Int_declarationContext ctx) {

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
    }
}