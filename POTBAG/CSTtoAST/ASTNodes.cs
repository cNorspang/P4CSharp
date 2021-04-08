using System.Collections.Generic;

namespace POTBAG.CSTtoAST
{
    //Setup Node, consisting of all locations, and where they go
    public abstract class ProgNode
    { };

    public class SetupNode : ProgNode

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

    public class LocationsSetupNode
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

    public class LocationMappingNode : ProgNode
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
    public abstract class StatementNode : ProgNode { };

    public class TextStatementNode : StatementNode

    {
        public List<string> GetText()
        {
            return Text;
        }

        public void setText(List<string> text)
        {
            Text = text;
        }

        private List<string> Text;
    };

    public class InputStatementNode : StatementNode

    {
        public List<string> GetText()
        {
            return Text;
        }

        public void setText(List<string> text)
        {
            Text = text;
        }

        private List<string> Text;
    };

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

    public class ifNode : ifChainStatementNode { };

    public class ElseIfStatementNode : ifChainStatementNode { };

    public class elseNode : ifChainStatementNode { };

    public class predicateNode
    {
        //TODO: NIGGERIAMAMAMIA ITALIANO SPAGET
    }

    public class TravelStatementNode : StatementNode

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

    public class ChoiceStatementNode : StatementNode

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

    public class OptionStatementNode
    {
        public string GetText()
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
    public abstract class AssignNode : ProgNode { };

    public class IntAssignNode : AssignNode

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

    public class stringAssignNode : AssignNode

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

    public class IntDeclarationNode : DeclarationNode { }

    public class stringDeclarationNode : DeclarationNode { }

    public class LocationDeclarationNode : DeclarationNode

    {
        private string varName;
    }

    public abstract class ExpressionNode : ProgNode

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

    public class AdditionNode : ExpressionNode { }

    public class SubtractionNode : ExpressionNode { }

    public class MultiplicationNode : ExpressionNode { }

    public class DivisionNode : ExpressionNode { }

    public class NumberNode : ExpressionNode

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