using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using POTBAG.ContextualAnalysis;
using POTBAG.CSTtoAST;
using System;
using POTBAG.Exceptions;

namespace POTBAG
{
    class Program
    {
        static void Main(string[] args)
        {
            string stream = FileHandler.readFromInputStream("UpdatedPseudoDrageTestFragmentFragment.txt");

            ICharStream input = CharStreams.fromString(stream);
            ITokenSource lexer = new BetterAdvGmLexer(input);
            ITokenStream tokenStream = new CommonTokenStream(lexer);
            BetterAdvGmParser parser = new BetterAdvGmParser(tokenStream);
            SymbolTable symbolTable = new SymbolTable();

            
            POTBAGErrorListener errorListener = new POTBAGErrorListener();

            //set start node
            try
            {
                BetterAdvGmParser.ProgContext cst = parser.prog();

                if (parser.NumberOfSyntaxErrors != 0) { Environment.Exit(1); }

                ProgNode ast = new BetterAdvGmASTVisitor().VisitProg(cst);

                var contextualAnalysis = new ASTContextualAnalysis(symbolTable).Visit(ast);


                FileHandler.write("#include <stdio.h>\nint main(int argc, char const *argv[]){");

                //var Test = new TestEvaluation().Visit(ast);
                FileHandler.write("return 0;}");
                //var tree = Trees.ToStringTree(cst, parser);
                //Console.WriteLine(tree);

                //Console.WriteLine("### FILE WRITE ###");
                //FileHandler.WriteToFile();
                //FileHandler.PrintCCodeDebug();
            }
            catch (Exception e)
            {
                switch (e)
                {
                    case LocationSetupErrorException _:
                    case InvalidTravelArrangementException _:
                    case IllegalTravelException _:
                    case TravelOutsideLocationException _:
                    case InvalidOperationException _:
                    case DuplicateVariableError _:    
                    case TypeErrorException _:
                        errorListener.Report((dynamic)e);
                        break;
                }
            }
            finally
            {
                Console.WriteLine(symbolTable.Clr());
                Environment.Exit(52);
            }

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
