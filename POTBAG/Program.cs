using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using POTBAG.CSTtoAST;
using System;

namespace POTBAG
{
    class Program
    {
        static void Main(string[] args)
        {
            string stream = FileHandler.readFromInputStream("UpdatedPseudoDrageTestFragment.txt");

            ICharStream input = CharStreams.fromString(stream);
            ITokenSource lexer = new BetterAdvGmLexer(input);
            ITokenStream tokenStream = new CommonTokenStream(lexer);
            BetterAdvGmParser parser = new BetterAdvGmParser(tokenStream);

            //set start node
            var cst = parser.prog(); ;

            //var ast = new BetterAdvGmASTVisitor().visitProg(cst);


            //var tree = Trees.ToStringTree(cst,parser);
            //Console.WriteLine(tree);

            //System.out.println(ast);
            //ParseTreeWalker walker = new ParseTreeWalker();
            //walker.walk(visitor, parseTree);

            //System.out.println(parseTree.toStringTree());
            //System.out.println(visitor.numbers.get(parseTree));



            //lexer - parser - visitor - walker
            //run.LexParsWalk(Stream);
            //fileWriter.WriteToFile();
            //fileWriter.PrintCCodeDebug();
        }
    }
    }
