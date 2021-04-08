using System.Collections.Generic;

namespace POTBAG.CSTtoAST
{
    //Setup Node, consisting of all locations, and where they go
    internal abstract class ProgNode
    { };

    internal class SetupNode : ProgNode

    {
        public LocationsSetupNode getLocations()
        {
            return Locations;
        }

        public void setLocations(LocationsSetupNode locations)
        {
            Locations = locations;
        }

        public LocationsSetupNode Locations;
    }

    internal class LocationsSetupNode
    {
        public List<LocationMappingNode> Children;

        public List<LocationMappingNode> getChildren()
        {
            return Children;
        }

        public void setChildren(List<LocationMappingNode> children)
        {
            Children = children;
        }
    }

    internal class LocationMappingNode : ProgNode
    {
        private string Source;
        private List<string> Destinations;

        public string getSource()
        {
            return Source;
        }

        public void setSource(string source)
        {
            Source = source;
        }

        public List<string> getDestinations()
        {
            return Destinations;
        }

        public void setDestinations(List<string> destinations)
        {
            Destinations = destinations;
        }
    };

    //Statement Nodes
    internal abstract class StatementNode : ProgNode { };

    internal class TextStatementNode : StatementNode

    {
        public List<string> getText()
        {
            return Text;
        }

        public void setText(List<string> text)
        {
            Text = text;
        }

        private List<string> Text;
    };

    internal class InputStatementNode : StatementNode

    {
        public List<string> getText()
        {
            return Text;
        }

        public void setText(List<string> text)
        {
            Text = text;
        }

        private List<string> Text;
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
        private string Destination;

        public string getDestination()
        {
            return Destination;
        }

        public void setDestination(string destination)
        {
            Destination = destination;
        }
    }

    internal class ChoiceStatementNode : StatementNode

    {
        public List<OptionStatementNode> getOptions()
        {
            return Options;
        }

        public void setOptions(List<OptionStatementNode> options)
        {
            Options = options;
        }

        private List<OptionStatementNode> Options;
    }

    internal class OptionStatementNode
    {
        public string getText()
        {
            return Text;
        }

        public void setText(string text)
        {
            Text = text;
        }

        private string Text;

        public ProgNode getInnerNode()
        {
            return InnerNode;
        }

        public void setInnerNode(ProgNode innerNode)
        {
            InnerNode = innerNode;
        }

        private ProgNode InnerNode;
    }

    //AssignNodes
    internal abstract class AssignNode : ProgNode { };

    internal class IntAssignNode : AssignNode

    {
        public string getLeft()
        {
            return Left;
        }

        public void setLeft(string left)
        {
            Left = left;
        }

        public ExpressionNode getRight()
        {
            return Right;
        }

        public void setRight(ExpressionNode right)
        {
            Right = right;
        }

        private string Left;
        private ExpressionNode Right;
    };

    internal class stringAssignNode : AssignNode

    {
        public string getLeft()
        {
            return Left;
        }

        public void setLeft(string left)
        {
            Left = left;
        }

        private string Left;

        public string getRight()
        {
            return Right;
        }

        public void setRight(string right)
        {
            Right = right;
        }

        private string Right;
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
        private string VarName;

        public string getVarName()
        {
            return VarName;
        }

        public void setVarName(string varName)
        {
            VarName = varName;
        }
    }

    internal class IntDeclarationNode : DeclarationNode { }

    internal class stringDeclarationNode : DeclarationNode { }

    internal class LocationDeclarationNode : DeclarationNode

    {
        private string varName;
    }

    internal abstract class ExpressionNode : ProgNode

    {
        public ExpressionNode Left;
        public ExpressionNode Right;

        public ExpressionNode getRight()
        {
            return Right;
        }

        public void setRight(ExpressionNode right)
        {
            Right = right;
        }

        public ExpressionNode getLeft()
        {
            return Left;
        }

        public void setLeft(ExpressionNode left)
        {
            Left = left;
        }
    }

    internal class AdditionNode : ExpressionNode { }

    internal class SubtractionNode : ExpressionNode { }

    internal class MultiplicationNode : ExpressionNode { }

    internal class DivisionNode : ExpressionNode { }

    internal class NumberNode : ExpressionNode

    {
        public int Value;

        public double getValue()
        {
            return Value;
        }

        public void setValue(int value)
        {
            Value = value;
        }
    }
}