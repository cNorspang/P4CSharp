using System;
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
        private String Source;
        private List<String> Destinations;

        public String getSource()
        {
            return Source;
        }

        public void setSource(String source)
        {
            Source = source;
        }

        public List<String> getDestinations()
        {
            return Destinations;
        }

        public void setDestinations(List<String> destinations)
        {
            Destinations = destinations;
        }
    };

    //Statement Nodes
    internal abstract class StatementNode : ProgNode { };

    internal class TextStatementNode : StatementNode

    {
        public List<String> getText()
        {
            return Text;
        }

        public void setText(List<String> text)
        {
            Text = text;
        }

        private List<String> Text;
    };

    internal class InputStatementNode : StatementNode

    {
        public List<String> getText()
        {
            return Text;
        }

        public void setText(List<String> text)
        {
            Text = text;
        }

        private List<String> Text;
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
        private String Destination;

        public String getDestination()
        {
            return Destination;
        }

        public void setDestination(String destination)
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
        public String getText()
        {
            return Text;
        }

        public void setText(String text)
        {
            Text = text;
        }

        private String Text;

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
        public String getLeft()
        {
            return Left;
        }

        public void setLeft(String left)
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

        private String Left;
        private ExpressionNode Right;
    };

    internal class StringAssignNode : AssignNode

    {
        public String getLeft()
        {
            return Left;
        }

        public void setLeft(String left)
        {
            Left = left;
        }

        private String Left;

        public String getRight()
        {
            return Right;
        }

        public void setRight(String right)
        {
            Right = right;
        }

        private String Right;
    }

    internal class InputAssignNode : AssignNode

    {
        private String Left;
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
        private String VarName;

        public String getVarName()
        {
            return VarName;
        }

        public void setVarName(String varName)
        {
            VarName = varName;
        }
    }

    internal class IntDeclarationNode : DeclarationNode { }

    internal class StringDeclarationNode : DeclarationNode { }

    internal class LocationDeclarationNode : DeclarationNode

    {
        private String varName;
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