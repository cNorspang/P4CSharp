using System.Collections.Generic;

namespace POTBAG.CSTtoAST
{
    //Setup Node, consisting of all locations, and where they go
    internal abstract class ProgNode
    { };

    internal class SetupNode : ProgNode
    {
        public LocationsSetupNode Locations { get; set; }
    }

    internal class LocationsSetupNode
    {
        public List<LocationMappingNode> Children { get; set; }
    }

    internal class LocationMappingNode : ProgNode
    {
        private string Source { get; set; }
        private List<string> Destinations { get; set; }
    };

    //Statement Nodes
    internal abstract class StatementNode : ProgNode { };

    internal class TextStatementNode : StatementNode
    {
        private List<string> Text { get; set; }
    };

    internal class InputStatementNode : StatementNode
    {
        private List<string> Text { get; set; }
    };

    internal class IfStatementNode : StatementNode
    {
        private ifNode ifNode;
        private List<ElseIfStatementNode> elseIfChain;
        private elseNode elseNode;
    }

    internal class ifChainStatementNode : StatementNode
    {
        private predicateNode predicate;
        private ProgNode body;
    }

    internal class ifNode : ifChainStatementNode { };

    internal class ElseIfStatementNode : ifChainStatementNode { };

    internal class elseNode : ifChainStatementNode { };

    internal class predicateNode
    {
        //TODO: NIGGERIAMAMAMIA ITALIANO SPAGET
    }

    internal class TravelStatementNode : StatementNode
    {
        private string Destination { get; set; }
    }

    internal class ChoiceStatementNode : StatementNode
    {
        private List<OptionStatementNode> Options { get; set; }
    }

    internal class OptionStatementNode
    {
        private string Text { get; set; }
        private ProgNode InnerNode { get; set; }
    }

    //AssignNodes
    internal abstract class AssignNode : ProgNode { };

    internal class IntAssignNode : AssignNode
    {
        private string Left { get; set; }
        private ExpressionNode Right { get; set; }
    };

    internal class stringAssignNode : AssignNode
    {
        private string Left { get; set; }
        private string Right { get; set; }
    }

    internal class InputAssignNode : AssignNode
    {
        private string Left;
        private InputStatementNode Right;
    }

    internal class LocationAssignNode : AssignNode
    {
        private LocationDeclarationNode Left;
        private List<BetterAdvGmParser.StatementContext> RightStatement;
        private List<BetterAdvGmParser.AssignContext> RightAssign;
        private List<BetterAdvGmParser.DeclarationContext> RightDeclaration;
        private List<BetterAdvGmParser.ExpressionContext> RightExpression;
    }

    //Declaration Nodes
    internal abstract class DeclarationNode : ProgNode
    {
        private string VarName { get; set; }
    }

    internal class IntDeclarationNode : DeclarationNode { }

    internal class stringDeclarationNode : DeclarationNode { }

    internal class LocationDeclarationNode : DeclarationNode
    {
        private string varName;
    }

    internal abstract class ExpressionNode : ProgNode
    {
        public ExpressionNode Left { get; set; }
        public ExpressionNode Right { get; set; }
    }

    internal class AdditionNode : ExpressionNode { }

    internal class SubtractionNode : ExpressionNode { }

    internal class MultiplicationNode : ExpressionNode { }

    internal class DivisionNode : ExpressionNode { }

    internal class NumberNode : ExpressionNode
    {
        public int Value { get; set; }
    }
}