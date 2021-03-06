using System;
using System.Collections.Generic;
using Antlr4.Runtime.Tree;

namespace SWAE.CSTtoAST
{
    //Setup Node, consisting of all locations, and where they go
    public abstract class ProgNode { }

    public class BufferNode : ProgNode
    {
        public SetupNode SetUpNode { get; set; } = new SetupNode();
        public List<ProgNode> inBlock = new List<ProgNode>();
    }

    public class SetupNode : ProgNode
    {
        public LocationsSetupNode Locations { get; set; }
        public PlayerSetupNode PlayerNode { get; set; } = new PlayerSetupNode();
    }

    public class LocationsSetupNode : ProgNode
    {
        public List<LocationMappingNode> Children { get; set; } = new List<LocationMappingNode>();
    }

    public class LocationMappingNode : ProgNode
    {
        public variableNode Source { get; set; }
        public List<variableNode> Destinations { get; set; } = new List<variableNode>();
    }

    public class PlayerSetupNode : AssignNode
    {
        public List<AssignNode> assignNodes { get; set; } = new List<AssignNode>();
    }

    //Statement Nodes
    public abstract class StatementNode : ProgNode { }

    public class TextStatementNode : StatementNode
    {
        public List<ProgNode> Text { get; set; } = new List<ProgNode>();
    }


    public class InputStatementNode : StatementNode
    {
        public List<ProgNode> Text { get; set; } = new List<ProgNode>();
    }

    public class IfChainStatementNode : StatementNode
    {
        public ifNode ifNode = new ifNode();
        public List<ElseIfStatementNode> elseIfChain = new List<ElseIfStatementNode>();
        public elseNode elseNode = new elseNode();
    }

    public class ifNode : IfStatementNode { }
    public class ElseIfStatementNode : IfStatementNode { }
    public class elseNode : StatementNode
    {
        public List<ProgNode> body { get; set; } = new List<ProgNode>();
    }
    public class IfStatementNode : StatementNode
    {
        public predicateNode predicate = new predicateNode();
        public List<ProgNode> body { get; set; } = new List<ProgNode>();
    }

    public class WhileStatementNode : IfStatementNode { }

    public class predicateNode : ProgNode
    {
        public ProgNode Left { get; set; }
        public ProgNode Right { get; set; }
        public string Operator { get; set; }
    }

    public class BoolNode : ProgNode
    {
        public bool value { get; set; }
    }

    public class TravelStatementNode : StatementNode
    {
        public variableNode Destination { get; set; }
    }


    public class ChoiceStatementNode : StatementNode
    {
        public List<OptionStatementNode> Options { get; set; } = new List<OptionStatementNode>();
    }

    public class OptionStatementNode : StatementNode
    {
        public predicateNode predicate { get; set; }
        public ProgNode Left { get; set; } //var_name or string
        public List<ProgNode> Right = new List<ProgNode>();

    }

    //AssignNodes
    public abstract class AssignNode : ProgNode { }

    public class AnonymousAssignNode : AssignNode
    {
        public variableNode Left { get; set; }
        public variableNode Right { get; set; }
    }

    public class IntAssignNode : AssignNode
    {
        //ProgNode allows Int_declarationNode, variableNode
        public ProgNode Left { get; set; }
        public string Operator { get; set; }
        //progNode allows expressionNode, inputStatement
        public ProgNode Right { get; set; }
    }

    public class stringAssignNode : AssignNode
    {
        public ProgNode Left { get; set; }
        public ProgNode Right { get; set; }
    }

    public class BoolAssignNode : AssignNode
    {
        public ProgNode Left { get; set; }
        public BoolNode Right { get; set; }
    }

    public class InputAssignNode : AssignNode
    {
        public ProgNode Left;
        public InputStatementNode Right;
    }

    public class LocationAssignNode : AssignNode
    {
        public ProgNode Left;

        public List<ProgNode> Right = new List<ProgNode>();
        // public List<BetterAdvGmParser.StatementContext> RightStatement;
        // public List<BetterAdvGmParser.AssignContext> RightAssign;
        // public List<BetterAdvGmParser.DeclarationContext> RightDeclaration;
        // public List<BetterAdvGmParser.ExpressionContext> RightExpression;
    }

    //Declaration Nodes
    public abstract class DeclarationNode : ProgNode
    {
        public variableNode VarName { get; set; }
    }

    public class IntDeclarationNode : DeclarationNode { }

    public class stringDeclarationNode : DeclarationNode { }

    public class BoolDeclarationNode : DeclarationNode { }

    public class LocationDeclarationNode : DeclarationNode { }

    public class variableNode : ProgNode
    {
        public string variableName { get; set; }

    }

    public class DotNotationNode : variableNode { }

    public class stringNode : ProgNode
    {
        public string strVal { get; set; }
    }


    public abstract class ExpressionNode : ProgNode
    {
        public ExpressionNode Left { get; set; }
        public ExpressionNode Right { get; set; }
    }

    public class ExpressionVarNameNode : ExpressionNode
    {
        public string VarName { get; set; }
    }

    public class ExpressionDotNameNode : ExpressionNode
    {
        public string VarName { get; set; }
    }


    public class ExpressionSoloNode : ExpressionNode
    {
        public ExpressionNode expr { get; set; }
    }

    public class RandomExpressionNode : ExpressionNode
    {
        public ExpressionNode MinValue { get; set; }
        public ExpressionNode MaxValue { get; set; }
    }

    public class AdditionNode : ExpressionNode { }

    public class SubtractionNode : ExpressionNode { }

    public class MultiplicationNode : ExpressionNode { }

    public class DivisionNode : ExpressionNode { }

    public class NumberNode : ExpressionNode
    {
        public int Value { get; set; }
    }

    public class NegativeNumNode : ExpressionNode 
    {
        public ExpressionNode negativeExpr { get; set; }
    }
}