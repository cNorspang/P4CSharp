﻿using System.Collections.Generic;
using Antlr4.Runtime.Tree;

namespace POTBAG.CSTtoAST
{
    //Setup Node, consisting of all locations, and where they go
    public abstract class ProgNode { }

    public class SetupNode : ProgNode
    {
        public LocationsSetupNode Locations { get; set; }
    }

    public class LocationsSetupNode
    {
        public List<LocationMappingNode> Children { get; set; }
    }

    public class LocationMappingNode : ProgNode
    {
        public string Source { get; set; }
        public List<string> Destinations { get; set; }

    }

    //Statement Nodes
    public abstract class StatementNode : ProgNode { }

    public class TextStatementNode : StatementNode
    {
        public List<string> Text { get; set; }
    }


    public class InputStatementNode : StatementNode
    {
        public List<string> Text { get; set; }
    }

    public class IfStatementNode : StatementNode
    {
        public ifNode ifNode;
        public List<ElseIfStatementNode> elseIfChain;
        public elseNode elseNode;
    }

    public class ifChainStatementNode : StatementNode
    {
        public predicateNode predicate;
        public ProgNode body;
    }

    public class ifNode : ifChainStatementNode { }

    public class ElseIfStatementNode : ifChainStatementNode { }
    
    //TODO: Pls work
    public class elseNode : StatementNode { }

    public class predicateNode : ProgNode
    {
        public string Left { get; set; }
        public string Right{ get; set; }
        public string Operator { get; set; }
    }

    public class TravelStatementNode : StatementNode
    {
        public string Destination { get; set; }
    }


    public class ChoiceStatementNode : StatementNode
    {
        public List<OptionStatementNode> Options { get; set; } = new List<OptionStatementNode>();
    }

    public class OptionStatementNode : StatementNode
    {
       
        public string Left { get; set; } //var_name or string
        public List<ProgNode> Right = new List<ProgNode>();
        public List<BetterAdvGmParser.DeclarationContext> RightDeclaration;
        public List<BetterAdvGmParser.StatementContext> RightStatement;
        public List<BetterAdvGmParser.ExpressionContext> RightExpression;
        public List<BetterAdvGmParser.AssignContext> RightAssign;

    }

    //AssignNodes
    public abstract class AssignNode : ProgNode { }


    public class IntAssignNode : AssignNode
    {
        public string Left { get; set; }
        public ExpressionNode Right { get; set; }
    }

    public class stringAssignNode : AssignNode
    {
        public string Left { get; set; }
        public string Right { get; set; }
    }

    public class InputAssignNode : AssignNode
    {
        public string Left;
        public InputStatementNode Right;
    }

    public class LocationAssignNode : AssignNode
    {
        public LocationDeclarationNode Left;

        public List<ProgNode> Right = new List<ProgNode>();
        // public List<BetterAdvGmParser.StatementContext> RightStatement;
        // public List<BetterAdvGmParser.AssignContext> RightAssign;
        // public List<BetterAdvGmParser.DeclarationContext> RightDeclaration;
        // public List<BetterAdvGmParser.ExpressionContext> RightExpression;
    }

    //Declaration Nodes
    public abstract class DeclarationNode : ProgNode
    {
        public string VarName { get; set; }
    }

    public class IntDeclarationNode : DeclarationNode { }

    public class stringDeclarationNode : DeclarationNode { }

    public class LocationDeclarationNode : DeclarationNode { }

    public abstract class ExpressionNode : ProgNode
    {
        public ExpressionNode Left { get; set; }
        public ExpressionNode Right { get; set; }
    }

    public class AdditionNode : ExpressionNode { }

    public class SubtractionNode : ExpressionNode { }

    public class MultiplicationNode : ExpressionNode { }

    public class DivisionNode : ExpressionNode { }

    public class NumberNode : ExpressionNode
    {
        public int Value { get; set; }
    }
}