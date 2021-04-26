using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using POTBAG.Exceptions;
using static POTBAG.DebugPrinter;

namespace POTBAG.CSTtoAST
{
    public class BetterAdvGmASTVisitor : BetterAdvGmBaseVisitor<ProgNode>
    {
        public override ProgNode VisitProg([NotNull] BetterAdvGmParser.ProgContext ctx)
        {
            
            Ccw("prog");
            ProgNode node = (BufferNode)Visit(ctx.buffernode());
            return node;
        }

        public override ProgNode VisitBuffernode(BetterAdvGmParser.BuffernodeContext ctx)
        {
            Ccw("Buffer_node");
            BufferNode node = new BufferNode {SetUpNode = (SetupNode) Visit(ctx.setup())};
            ctx.inBlock().ToList().ForEach(i => node.inBlock.Add(Visit(i)));

            return node;
        }

        public override ProgNode VisitDeclaration([NotNull] BetterAdvGmParser.DeclarationContext ctx)
        {
            //this is important. everything breaks if this is touched.
            return Visit(ctx.GetChild(0));
        }


        public override ProgNode VisitSetup(BetterAdvGmParser.SetupContext ctx) 
        {
            Ccw("setup");
            SetupNode node = new SetupNode();

            node.Locations = (LocationsSetupNode)Visit(ctx.locationsetup());
            
            
            return node;
        }

        public override ProgNode VisitLocationsetup(BetterAdvGmParser.LocationsetupContext ctx) {
            Ccw("LocationSetup");
            LocationsSetupNode node = new LocationsSetupNode();

            ctx.locationmapping().ToList().ForEach(i => node.Children.Add((LocationMappingNode)Visit(i)));

            Ccw("     - Location setup done");
            return node;
        }
        
        public override ProgNode VisitLocationmapping(BetterAdvGmParser.LocationmappingContext ctx) {
            Ccw("LocationMapping");

            LocationMappingNode node = new LocationMappingNode();
            node.Source = (variableNode)Visit(ctx.GetChild(0));

            ctx.variable().ToList().ForEach(i => node.Destinations.Add((variableNode)Visit(i)));
            //The  first entry is the source
            node.Destinations.RemoveAt(0);

            Ccw("    Source: " + node.Source);
            Ccw("    Child:  " + String.Join(',', node.Destinations));
            return node;
        }

        
        public override ProgNode VisitText_statement(BetterAdvGmParser.Text_statementContext ctx) {
            Ccw("TextStatement");
            TextStatementNode node = new TextStatementNode();
            
            //works because every other child is a variable. (keyword var + var + var ;...)
            for (int i = 1; i <= ctx.children.Count - 1; i += 2)
            {
                node.Text.Add(Visit(ctx.GetChild(i)));
                Ccw(ctx.GetChild(i).GetText());   
            }
            Ccw("    Child: " + String.Join(',', node.Text));
            return node;
        }
        
        public override ProgNode VisitInput_statement(BetterAdvGmParser.Input_statementContext ctx) {
            Ccw("InputStatement");
            InputStatementNode node = new InputStatementNode();

            //works because every other child is a variable. (keyword var + var + var ;...)
            for (int i = 1; i <= ctx.children.Count - 1; i += 2)
            {
                Ccw(ctx.GetChild(i).GetText());
                //breaks...
                node.Text.Add(Visit(ctx.GetChild(i)));
            }
            Ccw("    Child: " + String.Join(',', node.Text));
            return node;
        }

        public override ProgNode VisitInt_assign(BetterAdvGmParser.Int_assignContext ctx) {
            Ccw("Int_assign");
            IntAssignNode node = new IntAssignNode();

            if (ctx.ASSIGN_OPERATOR() != null)
                node.Operator = "ASSIGN_OPERATOR";
            else if (ctx.COMPOUND_OPERATOR() != null)
                node.Operator = "COMPOUND_OPERATOR";
            else
                throw new InvalidOperationException();

            node.Left = Visit(ctx.GetChild(0));          
            Ccw("    Left Child Int_assign: "+node.Left + "\n     Operator child Int_assign: "+node.Operator);

            node.Right = Visit(ctx.GetChild(2));
            Ccw("    Right Child Int_assign: " + node.Right);
            return node;
        }

        public override ProgNode VisitInt_declaration(BetterAdvGmParser.Int_declarationContext ctx) {
            Ccw("int_declaraion");
            
            IntDeclarationNode node = new IntDeclarationNode {VarName = (variableNode)Visit(ctx.variable())};
            Ccw("    Child Varname of Int_declaration: " + node.VarName);
            //Ccw("yikes: "+node.getVarName());

            return node;
        }

        
        public override ProgNode VisitString_assign(BetterAdvGmParser.String_assignContext ctx) {
            Ccw("string_assign");
            //if check på left vari || string_dec
            stringAssignNode node = new stringAssignNode();

            node.Left = Visit(ctx.GetChild(0));
            Ccw("    Left child of assign: " + node.Left);

            node.Right = (stringNode)Visit(ctx.GetChild(2));
            Ccw("    Right child of assign: " + node.Right);
            return node;

        }

        public override ProgNode VisitString_declaration(BetterAdvGmParser.String_declarationContext ctx) {
            Ccw("string_declaration");
            stringDeclarationNode node = new stringDeclarationNode();
            node.VarName = (variableNode)Visit(ctx.variable());
            Ccw("    Child Varname of string_Declaration: " + node.VarName);
            return node;
        }
        
        public override ProgNode VisitLocation_assign([NotNull] BetterAdvGmParser.Location_assignContext ctx)
        {
            Ccw("location_assign");
            LocationAssignNode node = new LocationAssignNode();

            node.Left = Visit(ctx.GetChild(0));
            Ccw("    Child Left of location_assign: " + node.Left);

            ctx.inBlock().ToList().ForEach(i => node.Right.Add(Visit(i)));
            node.Right.ForEach(i => Ccw($"LIST ENTRY: {i} location"));
            return node;
        }

        public override ProgNode VisitLocation_declaration([NotNull] BetterAdvGmParser.Location_declarationContext ctx)
        {
            Ccw("location_declaration");
            LocationDeclarationNode node = new LocationDeclarationNode();
            node.VarName =  (variableNode)Visit(ctx.variable());
            Ccw("    Child Varname of location_declaration: " + node.VarName);
            return node;
        }

        public override ProgNode VisitTravel_statement([NotNull] BetterAdvGmParser.Travel_statementContext ctx)
        {
            Ccw("travel_statement");
            TravelStatementNode node = new TravelStatementNode();
            node.Destination = (variableNode)Visit(ctx.variable());
            Ccw("    Child destination of Travel_statement: " + node.Destination);
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
                    Ccw("ADD     "+ ctx.GetChild(0).GetText() +" "+ctx.GetChild(2).GetText());
                    AdditionNode nodeADD = new AdditionNode();
                    nodeADD.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeADD.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeADD;
                    break;
                case "DIVISION":
                    Ccw("DIV     " + ctx.GetChild(0).GetText() + " " + ctx.GetChild(2).GetText());
                    DivisionNode nodeDIV = new DivisionNode();
                    nodeDIV.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeDIV.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeDIV;
                    break;
                case "TIMES":
                    Ccw("TIMES   " + ctx.GetChild(0).GetText() + " " + ctx.GetChild(2).GetText());
                    MultiplicationNode nodeMUL = new MultiplicationNode();
                    nodeMUL.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeMUL.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeMUL;
                    break;
                case "MINUS":
                    Ccw("SUB     " + ctx.GetChild(0).GetText() + " " + ctx.GetChild(2).GetText());

                    SubtractionNode nodeSUB = new SubtractionNode();
                    nodeSUB.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeSUB.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeSUB;
                    break;
                case "NUM":
                    Ccw("NUM     " + ctx.NUM().GetText());
                    NumberNode nodeNUM = new NumberNode();
                    nodeNUM.Value = int.Parse(ctx.NUM().GetText());
                    node = nodeNUM;
                    break;
                case "VAR":
                    Ccw("VAR     " + ctx.variable().GetText());
                    ExpressionVarNameNode nodeVAR = new ExpressionVarNameNode();
                    nodeVAR.VarName = ctx.variable().GetText();
                    node = nodeVAR;
                    break;
                case "ISO":
                    Ccw("ISO     " + ctx.expression(0).GetText());
                    ExpressionSoloNode nodeISO = new ExpressionSoloNode();
                    nodeISO.expr = (ExpressionNode)Visit(ctx.GetChild(1));
                    node = nodeISO;
                    break;
                default:
                    throw new InvalidOperationException();
                    break;
            }

            return node;


        }

        public override ProgNode VisitChoice_statement([NotNull] BetterAdvGmParser.Choice_statementContext ctx)
        {
            Ccw("choice_statement");
            ChoiceStatementNode node = new ChoiceStatementNode();

            ctx.option_statment().ToList().ForEach(i => node.Options.Add((OptionStatementNode)Visit(i)));

            node.Options.ForEach(i => Ccw("    Child option of choice_statement: " + i.Left + " + codeblock (Option_statement)"));

            return node;
        }

        //stavefejl statEment
        public override ProgNode VisitOption_statment([NotNull] BetterAdvGmParser.Option_statmentContext ctx)
        {
            Ccw("option_statement");
            OptionStatementNode node = new OptionStatementNode();

            node.Left = Visit(ctx.GetChild(0));
            Ccw("    Child Left of option_statement: " + node.Left);

            ctx.inBlock().ToList().ForEach(i => node.Right.Add(Visit(i)));
            node.Right.ForEach(i => Ccw($"LIST ENTRY: {i}"));
            //node.RightStatement.ForEach(i => Ccw("    Child stmt of option_statement: " + i.GetText()));

            return node;
        }

        public override ProgNode VisitIf_chain_statement([NotNull] BetterAdvGmParser.If_chain_statementContext ctx)
        {
            Ccw("if_chain_statement");
            IfChainStatementNode node = new IfChainStatementNode();

            node.ifNode = (ifNode)Visit(ctx.if_statement());
            ctx.else_if_statement().ToList().ForEach(i => node.elseIfChain.Add((ElseIfStatementNode)Visit(i)));
            if(ctx.else_statement() != null)
                node.elseNode = (elseNode)Visit(ctx.else_statement());

            return node;
        }
        public override ProgNode VisitIf_statement(BetterAdvGmParser.If_statementContext ctx)
        {
            Ccw("if_statement");
            ifNode node = new ifNode();
            
            node.predicate = (predicateNode)VisitPredicate(ctx.predicate());
            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));
            return node;
        }

        public override ProgNode VisitElse_if_statement([NotNull] BetterAdvGmParser.Else_if_statementContext ctx)
        {
            Ccw("elif_statement");
            ElseIfStatementNode node = new ElseIfStatementNode();

            node.predicate = (predicateNode)VisitPredicate(ctx.predicate());
            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));
            return node;
        }

        public override ProgNode VisitElse_statement([NotNull] BetterAdvGmParser.Else_statementContext ctx)
        {
            Ccw("else_statement");
            elseNode node = new elseNode();

            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));
            return node;
        }

        public override ProgNode VisitWhile_statement([NotNull] BetterAdvGmParser.While_statementContext ctx)
        {
            Ccw("while_statement");
            WhileStatementNode node = new WhileStatementNode();

            node.predicate = (predicateNode)Visit(ctx.predicate());
            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));
            
            return node;
        }

        public override ProgNode VisitPredicate(BetterAdvGmParser.PredicateContext ctx)
        {
            predicateNode node = new predicateNode();
            Ccw("predicate");

            //Left hand side
            node.Left = Visit(ctx.GetChild(0));
            Ccw($"    Left side = {node.Left}");
            
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

            Ccw($"    Operator = {node.Operator}");

            //Right hand side
            node.Right = Visit(ctx.GetChild(2));
            Ccw($"    Right side = {node.Right}");


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
            Ccw("VisitInput_assign");
            InputAssignNode node = new InputAssignNode();
            node.Left = Visit(ctx.GetChild(0));

            node.Right = (InputStatementNode)Visit(ctx.input_statement());
            return node;
        }
    }
}