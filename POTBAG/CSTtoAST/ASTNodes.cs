using System.Collections.Generic;

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
        private string Source { get; set; }
        private List<string> Destinations { get; set; }

    }

    //Statement Nodes
    public abstract class StatementNode : ProgNode { }

    public class TextStatementNode : StatementNode
    {
        private List<string> Text { get; set; }
    }


    public class InputStatementNode : StatementNode
    {
        private List<string> Text { get; set; }
    }

    public class IfStatementNode : StatementNode
    {
        private ifNode ifNode;
        private List<ElseIfStatementNode> elseIfChain;
        private elseNode elseNode;
    }

    public class ifChainStatementNode : StatementNode
    {
        private predicateNode predicate;
        private ProgNode body;
    }

    public class ifNode : ifChainStatementNode { }

    public class ElseIfStatementNode : ifChainStatementNode { }

    public class elseNode : ifChainStatementNode { }

    public class predicateNode
    {
        //TODO: NIGGERIAMAMAMIA ITALIANO SPAGET
    }

    public class TravelStatementNode : StatementNode
    {
        private string Destination { get; set; }
    }


    public class ChoiceStatementNode : StatementNode
    {
        private List<OptionStatementNode> Options { get; set; }
    }

    public class OptionStatementNode
    {
        private string Text { get; set; }
        private ProgNode InnerNode { get; set; }
    }

    //AssignNodes
    public abstract class AssignNode : ProgNode { }


    public class IntAssignNode : AssignNode
    {
        private string Left { get; set; }
        private ExpressionNode Right { get; set; }
    }

    public class stringAssignNode : AssignNode
    {
        private string Left { get; set; }
        private string Right { get; set; }
    }

    public class InputAssignNode : AssignNode
    {
        private string Left;
        private InputStatementNode Right;
    }

    public class LocationAssignNode : AssignNode
    {
        private LocationDeclarationNode Left;
        private List<BetterAdvGmParser.StatementContext> RightStatement;
        private List<BetterAdvGmParser.AssignContext> RightAssign;
        private List<BetterAdvGmParser.DeclarationContext> RightDeclaration;
        private List<BetterAdvGmParser.ExpressionContext> RightExpression;
    }

    //Declaration Nodes
    public abstract class DeclarationNode : ProgNode
    {
        private string VarName { get; set; }
    }

    public class IntDeclarationNode : DeclarationNode { }

    public class stringDeclarationNode : DeclarationNode { }

    public class LocationDeclarationNode : DeclarationNode
    {
        private string varName;
    }

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