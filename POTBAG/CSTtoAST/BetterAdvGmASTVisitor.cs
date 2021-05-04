using System;
using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;
using Antlr4.Runtime.Tree;
using SWAE.Exceptions;
using static SWAE.DebugPrinter;

namespace SWAE.CSTtoAST
{
    public class BetterAdvGmASTVisitor : SWAEBaseVisitor<ProgNode>
    {
        public override ProgNode VisitProg([NotNull] SWAEParser.ProgContext ctx)
        {
            
            Ccwl("prog");
            ProgNode node = (BufferNode)Visit(ctx.buffernode());
            return node;
        }

        public override ProgNode VisitBuffernode(SWAEParser.BuffernodeContext ctx)
        {
            Ccwl("Buffer_node");
            BufferNode node = new BufferNode {SetUpNode = (SetupNode) Visit(ctx.setup())};
            ctx.inBlock().ToList().ForEach(i => node.inBlock.Add(Visit(i)));

            return node;
        }

        public override ProgNode VisitDeclaration([NotNull] SWAEParser.DeclarationContext ctx)
        {
            //this is important. everything breaks if this is touched.
            return Visit(ctx.GetChild(0));
        }


        public override ProgNode VisitSetup(SWAEParser.SetupContext ctx) 
        {
            Ccwl("setup");
            SetupNode node = new SetupNode();
            node.Locations = (LocationsSetupNode)Visit(ctx.locationsetup());
            node.PlayerNode = (PlayerSetupNode)Visit(ctx.playersetup());

            return node;
        }

        public override ProgNode VisitLocationsetup(SWAEParser.LocationsetupContext ctx) {
            Ccwl("LocationSetup");
            LocationsSetupNode node = new LocationsSetupNode();

            ctx.locationmapping().ToList().ForEach(i => node.Children.Add((LocationMappingNode)Visit(i)));

            Ccwl("     - Location setup done");
            return node;
        }
        
        public override ProgNode VisitLocationmapping(SWAEParser.LocationmappingContext ctx) {
            Ccwl("LocationMapping");

            LocationMappingNode node = new LocationMappingNode();
            node.Source = (variableNode)Visit(ctx.GetChild(0));

            ctx.variable().ToList().ForEach(i => node.Destinations.Add((variableNode)Visit(i)));
            //The  first entry is the source
            node.Destinations.RemoveAt(0);

            Ccwl("    Source: " + node.Source);
            Ccwl("    Child:  " + string.Join(',', node.Destinations));
            return node;
        }


        public override ProgNode VisitPlayersetup([NotNull] SWAEParser.PlayersetupContext ctx)
        {
            Ccwl("PlayerSetup");

            PlayerSetupNode node = new PlayerSetupNode();
            ctx.assign().ToList().ForEach(i => node.assignNodes.Add((AssignNode)Visit(i)));

            return node;
        }


        public override ProgNode VisitText_statement(SWAEParser.Text_statementContext ctx) {
            Ccwl("TextStatement");
            TextStatementNode node = new TextStatementNode();
            
            //works because every other child is a variable. (keyword var + var + var ;...)
            for (int i = 1; i <= ctx.children.Count - 1; i += 2)
            {
                node.Text.Add(Visit(ctx.GetChild(i)));
                Ccwl(ctx.GetChild(i).GetText());   
            }
            Ccwl("    Child: " + string.Join(',', node.Text));
            return node;
        }
        
        public override ProgNode VisitInput_statement(SWAEParser.Input_statementContext ctx) {
            Ccwl("InputStatement");
            InputStatementNode node = new InputStatementNode();

            //works because every other child is a variable. (keyword var + var + var ;...)
            for (int i = 1; i <= ctx.children.Count - 1; i += 2)
            {
                Ccwl(ctx.GetChild(i).GetText());
                //breaks...
                node.Text.Add(Visit(ctx.GetChild(i)));
            }
            Ccwl("    Child: " + string.Join(',', node.Text));
            return node;
        }

        public override ProgNode VisitAnonymous_assign([NotNull] SWAEParser.Anonymous_assignContext ctx)
        {
            AnonymousAssignNode node = new AnonymousAssignNode();
            node.Left = (variableNode)Visit(ctx.GetChild(0));
            node.Right = (variableNode)Visit(ctx.GetChild(2));
            return node;
        }

        public override ProgNode VisitInt_assign(SWAEParser.Int_assignContext ctx) {
            Ccwl("Int_assign");
            IntAssignNode node = new IntAssignNode();

            if (ctx.ASSIGN_OPERATOR() != null)
                node.Operator = "=";
            else if (ctx.COMPOUND_OPERATOR() != null)
                node.Operator = ctx.COMPOUND_OPERATOR().GetText();
            else
                SWAEErrorListener.Report(new InvalidOperationException(), this);

            node.Left = Visit(ctx.GetChild(0));          
            Ccwl("    Left Child Int_assign: "+node.Left + "\n     Operator child Int_assign: "+node.Operator);

            node.Right = Visit(ctx.GetChild(2));
            Ccwl("    Right Child Int_assign: " + node.Right);
            return node;
        }

        public override ProgNode VisitInt_declaration(SWAEParser.Int_declarationContext ctx) {
            Ccwl("int_declaraion");
            
            IntDeclarationNode node = new IntDeclarationNode {VarName = (variableNode)Visit(ctx.variable())};
            Ccwl("    Child Varname of Int_declaration: " + node.VarName);

            return node;
        }
       
        public override ProgNode VisitString_assign(SWAEParser.String_assignContext ctx) {
            Ccwl("string_assign");
            stringAssignNode node = new stringAssignNode();

            node.Left = Visit(ctx.GetChild(0));
            Ccwl("    Left child of assign: " + node.Left);

            node.Right = Visit(ctx.GetChild(2));
            Ccwl("    Right child of assign: " + node.Right);
            return node;

        }

        public override ProgNode VisitString_declaration(SWAEParser.String_declarationContext ctx) {
            Ccwl("string_declaration");
            stringDeclarationNode node = new stringDeclarationNode();
            node.VarName = (variableNode)Visit(ctx.variable());
            Ccwl("    Child Varname of string_Declaration: " + node.VarName);
            return node;
        }
        public override ProgNode VisitBool_assign([NotNull] SWAEParser.Bool_assignContext ctx)
        {
            Ccwl("bool_assign");
            BoolAssignNode node = new BoolAssignNode();
            node.Left = Visit(ctx.GetChild(0));
            Ccwl("    Left child of bool_assign: " + node.Left);

            node.Right = (BoolNode)Visit(ctx.GetChild(2));
            Ccwl("    Right child of bool_assign: " + node.Right);
            return node;
        }

        public override ProgNode VisitBool_declaration([NotNull] SWAEParser.Bool_declarationContext ctx)
        {
            Ccwl("bool_declaration");
            BoolDeclarationNode node = new BoolDeclarationNode();
            node.VarName = (variableNode)Visit(ctx.variable());
            return node;
        }

        public override ProgNode VisitLocation_assign([NotNull] SWAEParser.Location_assignContext ctx)
        {
            Ccwl("location_assign");
            LocationAssignNode node = new LocationAssignNode();

            node.Left = Visit(ctx.GetChild(0));
            Ccwl("    Child Left of location_assign: " + node.Left);

            ctx.inBlock().ToList().ForEach(i => node.Right.Add(Visit(i)));
            node.Right.ForEach(i => Ccwl($"LIST ENTRY: {i} location"));
            return node;
        }

        public override ProgNode VisitLocation_declaration([NotNull] SWAEParser.Location_declarationContext ctx)
        {
            Ccwl("location_declaration");
            LocationDeclarationNode node = new LocationDeclarationNode();
            node.VarName =  (variableNode)Visit(ctx.variable());
            Ccwl("    Child Varname of location_declaration: " + node.VarName);
            return node;
        }

        public override ProgNode VisitTravel_statement([NotNull] SWAEParser.Travel_statementContext ctx)
        {
            Ccwl("travel_statement");
            TravelStatementNode node = new TravelStatementNode();
            node.Destination = (variableNode)Visit(ctx.variable());
            Ccwl("    Child destination of Travel_statement: " + node.Destination);
            return node;
        }

        public override ProgNode VisitExpression(SWAEParser.ExpressionContext ctx)
        {

            string op = "";
            if (ctx.PLUS_OPERATOR() != null) { op = "PLUS"; }
            else if (ctx.DIVISION_OPERATOR() != null) { op = "DIVISION"; }
            else if (ctx.TIMES_OPERATOR() != null) { op = "TIMES"; } 
            else if (ctx.MINUS_OPERATOR() != null) { op = "MINUS"; }
            else if (ctx.NUM() != null) { op = "NUM"; }
            else if (ctx.variable() != null) { op = "VAR"; }
            else if (ctx.PAREN_LEFT() != null) { op = "ISO"; }
            else if (ctx.random() != null) {op = "RNG"; }

            ExpressionNode node = null;

            switch (op)
            {
                case "PLUS":
                    Ccwl("ADD     "+ ctx.GetChild(0).GetText() +" "+ctx.GetChild(2).GetText());
                    AdditionNode nodeADD = new AdditionNode();
                    nodeADD.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeADD.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeADD;
                    break;
                case "DIVISION":
                    Ccwl("DIV     " + ctx.GetChild(0).GetText() + " " + ctx.GetChild(2).GetText());
                    DivisionNode nodeDIV = new DivisionNode();
                    nodeDIV.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeDIV.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeDIV;
                    break;
                case "TIMES":
                    Ccwl("TIMES   " + ctx.GetChild(0).GetText() + " " + ctx.GetChild(2).GetText());
                    MultiplicationNode nodeMUL = new MultiplicationNode();
                    nodeMUL.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeMUL.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeMUL;
                    break;
                case "MINUS":
                    Ccwl("SUB     " + ctx.GetChild(0).GetText() + " " + ctx.GetChild(2).GetText());

                    SubtractionNode nodeSUB = new SubtractionNode();
                    nodeSUB.Left = (ExpressionNode)Visit(ctx.GetChild(0));
                    nodeSUB.Right = (ExpressionNode)Visit(ctx.GetChild(2));
                    node = nodeSUB;
                    break;
                case "NUM":
                    Ccwl("NUM     " + ctx.NUM().GetText());
                    NumberNode nodeNUM = new NumberNode();
                    nodeNUM.Value = int.Parse(ctx.NUM().GetText());
                    node = nodeNUM;
                    break;
                case "VAR":
                    if (ctx.variable().dot_notaion() == null)
                    {
                        Ccwl("VAR     " + ctx.variable().GetText());
                        ExpressionVarNameNode nodeVAR = new ExpressionVarNameNode();
                        nodeVAR.VarName = ctx.variable().GetText();
                        node = nodeVAR;
                    }
                    else
                    {
                        Ccwl("DOTVAR     " + ctx.variable().dot_notaion().GetText());
                        ExpressionDotNameNode nodeDOT = new ExpressionDotNameNode();
                        nodeDOT.VarName = ctx.variable().dot_notaion().VAR_NAME().GetText();
                        node = nodeDOT;
                    }

                    break;
                case "RNG":
                    Ccwl("RNG      " + ctx.random());
                    RandomExpressionNode nodeRNG = new RandomExpressionNode();
                    if (ctx.random().expression() != null)
                    {
                        nodeRNG.MinValue = (ExpressionNode)Visit(ctx.random().expression(0));
                        nodeRNG.MaxValue = (ExpressionNode)Visit(ctx.random().expression(1));
                    }
                    node = nodeRNG;
                    break;
                case "ISO":
                    Ccwl("ISO     " + ctx.expression(0).GetText());
                    ExpressionSoloNode nodeISO = new ExpressionSoloNode();
                    nodeISO.expr = (ExpressionNode)Visit(ctx.GetChild(1));
                    node = nodeISO;
                    break;
                default:
                    SWAEErrorListener.Report(new InvalidOperationException(), this);
                    break;
            }
            return node;
        }


        public override ProgNode VisitChoice_statement([NotNull] SWAEParser.Choice_statementContext ctx)
        {
            Ccwl("choice_statement");
            ChoiceStatementNode node = new ChoiceStatementNode();

            ctx.option_statment().ToList().ForEach(i => node.Options.Add((OptionStatementNode)Visit(i)));

            node.Options.ForEach(i => Ccwl("    Child option of choice_statement: " + i + " + codeblock (Option_statement + ifchainstmt)"));

            return node;
        }

        //stavefejl statEment
        public override ProgNode VisitOption_statment([NotNull] SWAEParser.Option_statmentContext ctx)
        {
            Ccwl("option_statement");
            OptionStatementNode node = new OptionStatementNode();

            if(ctx.predicate() == null) { 
            node.Left = Visit(ctx.GetChild(0));
            }
            else
            {
                node.predicate = (predicateNode)Visit(ctx.predicate());
                node.Left = Visit(ctx.GetChild(3));
                Ccwl("    Child predicate of option_statement: " + node.predicate);              
            }

            Ccwl("    Child Left of option_statement: " + node.Left);

            ctx.inBlock().ToList().ForEach(i => node.Right.Add(Visit(i)));
            node.Right.ForEach(i => Ccwl($"LIST ENTRY: {i}"));

            return node;
        }

        public override ProgNode VisitIf_chain_statement([NotNull] SWAEParser.If_chain_statementContext ctx)
        {
            Ccwl("if_chain_statement");
            IfChainStatementNode node = new IfChainStatementNode();

            node.ifNode = (ifNode)Visit(ctx.if_statement());
            ctx.else_if_statement().ToList().ForEach(i => node.elseIfChain.Add((ElseIfStatementNode)Visit(i)));
            if(ctx.else_statement() != null)
                node.elseNode = (elseNode)Visit(ctx.else_statement());

            return node;
        }

        public override ProgNode VisitIf_statement(SWAEParser.If_statementContext ctx)
        {
            Ccwl("if_statement");
            ifNode node = new ifNode();
            
            node.predicate = (predicateNode)VisitPredicate(ctx.predicate());
            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));

            return node;
        }

        public override ProgNode VisitElse_if_statement([NotNull] SWAEParser.Else_if_statementContext ctx)
        {
            Ccwl("elif_statement");
            ElseIfStatementNode node = new ElseIfStatementNode();

            node.predicate = (predicateNode)VisitPredicate(ctx.predicate());
            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));
            return node;
        }

        public override ProgNode VisitElse_statement([NotNull] SWAEParser.Else_statementContext ctx)
        {
            Ccwl("else_statement");
            elseNode node = new elseNode();

            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));
            return node;
        }

        public override ProgNode VisitWhile_statement([NotNull] SWAEParser.While_statementContext ctx)
        {
            Ccwl("while_statement");
            WhileStatementNode node = new WhileStatementNode();

            node.predicate = (predicateNode)Visit(ctx.predicate());
            ctx.inBlock().ToList().ForEach(i => node.body.Add(Visit(i)));
            
            return node;
        }

        public override ProgNode VisitPredicate(SWAEParser.PredicateContext ctx)
        {
            predicateNode node = new predicateNode();
            Ccwl("predicate");

            //Left hand side
            node.Left = Visit(ctx.GetChild(0));
            Ccwl($"    Left side = {node.Left}");
            
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

            Ccwl($"    Operator = {node.Operator}");

            //Right hand side
            node.Right = Visit(ctx.GetChild(2));
            Ccwl($"    Right side = {node.Right}");


            return node;
        }

        public override ProgNode VisitVariable([NotNull] SWAEParser.VariableContext ctx)
        {
            variableNode node;
            if (ctx.dot_notaion() == null) {
                variableNode nodeVAR = new variableNode();
                nodeVAR.variableName = ctx.VAR_NAME().GetText();
                node = nodeVAR;
            }
            else if (ctx.dot_notaion() != null) {
                node = (variableNode)Visit(ctx.dot_notaion());
            }
            else
            {
                throw new BennoException("Variable not variableName or dotnotation");
            }
            
            return node;
        }

        public override ProgNode VisitDot_notaion([NotNull] SWAEParser.Dot_notaionContext ctx)
        {
            //Tilgå hvad der står efter "player.", altså, hvis
            //der står player.health, så blir node.variableName = health;
            DotNotationNode node = new DotNotationNode {variableName = ctx.VAR_NAME().GetText()};

            return node;
        }

        public override ProgNode VisitString_obj([NotNull] SWAEParser.String_objContext ctx)
        {
            stringNode node = new stringNode();
            node.strVal = ctx.STRING().GetText();
            return node;
        }

        public override ProgNode VisitBool_obj([NotNull] SWAEParser.Bool_objContext ctx)
        {
            BoolNode node = new BoolNode();
            node.value = bool.Parse(ctx.BOOL().GetText());
            return node;
        }

        public override ProgNode VisitInput_assign([NotNull] SWAEParser.Input_assignContext ctx)
        {
            Ccwl("VisitInput_assign");
            InputAssignNode node = new InputAssignNode();
            node.Left = Visit(ctx.GetChild(0));

            node.Right = (InputStatementNode)Visit(ctx.input_statement());
            return node;
        }

        
    }
}