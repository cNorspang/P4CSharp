using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;

namespace POTBAG.CSTtoAST
{
    public class BetterAdvGmASTVisitor : BetterAdvGmBaseVisitor<ProgNode>
    {
        public override ProgNode VisitSetup(BetterAdvGmParser.SetupContext ctx) 
        {
            Console.WriteLine("setup");
            return base.VisitSetup(ctx);
        }
    
        public override ProgNode VisitLocationsetup(BetterAdvGmParser.LocationsetupContext ctx) {
            Console.WriteLine("LocationSetup");
            return base.VisitLocationsetup(ctx);
        }
        
        public override ProgNode VisitLocationmapping(BetterAdvGmParser.LocationmappingContext ctx) {
            Console.WriteLine("LocationMapping");

            LocationMappingNode node = new LocationMappingNode();
            string source = ctx.GetText().Substring(0, ctx.GetText().IndexOf('-'));
            string deststring = ctx.GetText().Substring(ctx.GetText().IndexOf('>') + 1);
            
            List<string> destArr = deststring.Split(",").ToList(); 
            //destArr = (destArr.Count - 1, destArr[destArr.Count - 1].Substring(0, destArr[destArr.Count - 1].Length - 1));
            destArr[destArr.Count].Remove(destArr[destArr.Count].Length - 1);
            
            node.Source = source;
            node.setDestinations(destArr);

            Console.WriteLine("    Source = " + node.getSource());
            Console.WriteLine("    Destinations = " + node.getDestinations());
            return node;
        }
        
        public override ProgNode VisitText_statement(BetterAdvGmParser.Text_statementContext ctx) {
            Console.WriteLine("TextStatement");
            TextStatementNode node = new TextStatementNode();

            List<string> InnerVal = new List(ctx.GetText().Split("+"));
            InnerVal[0] = InnerVal[0].Replace("Text ", "");

            node.setText(InnerVal);
            Console.WriteLine("    Child: " + node.GetText());
            return node;
            //return super.visitText_statement(ctx);
        }
        
        public override ProgNode VisitInput_statement(BetterAdvGmParser.Input_statementContext ctx) {
            Console.WriteLine("InputStatement");
            InputStatementNode node = new InputStatementNode();

            ArrayList<string> InnerVal = new ArrayList<>(Arrays.asList(ctx.GetText().split("[+]")));

            InnerVal.set(0, InnerVal.get(0).replace("userInput", ""));
            InnerVal.set(InnerVal.size() - 1, InnerVal.get(InnerVal.size() - 1).substring(0, InnerVal.get(InnerVal.size() - 1).length() - 1));
            node.setText(InnerVal);

            Console.WriteLine("    Child: " + node.GetText());

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