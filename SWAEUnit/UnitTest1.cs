using System;
using Xunit;
using SWAE.ContextualAnalysis;
using SWAE.CSTtoAST;
using SWAE.Exceptions;
using SWAE.CodeGen;

namespace SWAEUnit
{
    public class UnitTest1
    {

        [Fact]
        public void ErrorListenerTest1()
        {
            //ensure consistent error output
            SWAEErrorListener.conTroller = false;

            //validate the queue is empty
            Assert.True(SWAEErrorListener.ErrorQueue.Count == 0);

            //Add item to error queue
            SWAEErrorListener.Report(new TravelOutsideLocationException(), this);

            string expected = "Cannot Travel from global scope, all Travel statements must be from within a location"; 

            Assert.True(SWAEErrorListener.ErrorQueue.Contains(expected));
        }

        [Fact]
        public void CodeGenTest1()
        {
            SymbolTable st = new SymbolTable();
            ASTCodeGen cg = new ASTCodeGen(st);

            //double quotes because that is how the lexer saves a string.
            string input = "\"This is a test, hello peter!\"";

            //creating input
            TextStatementNode node = new TextStatementNode();
            node.Text.Add(new stringNode() { strVal = input });

            //utilizes the AST visitor
            string actual = cg.Visit(node);
            string expected = "\n    COMPILER_TOOL_PRINT_TUI();\n    printf(\"%s\", \"This is a test, hello peter!\");\n    COMPILER_TOOL_WAIT_FOR_INPUT();";
            
            Assert.Equal(expected, actual);

        }
    }
}
