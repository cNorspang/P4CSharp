using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using POTBAG.ContextualAnalysis;
using POTBAG.CSTtoAST;
using System;
using POTBAG.Exceptions;
using static POTBAG.DebugPrinter;
using POTBAG.CodeGen;
using System.Collections.Generic;

namespace POTBAG
{
    class Program
    {
        static void Main(string[] args)
        {
            const bool debug = true; 
            string stream = FileHandler.readFromInputStream("UpdatedPseudoDrageCodeGenTest.txt");

            ICharStream input = CharStreams.fromString(stream);
            ITokenSource lexer = new SWAELexer(input);
            ITokenStream tokenStream = new CommonTokenStream(lexer);
            SWAEParser parser = new SWAEParser(tokenStream);
            SymbolTable symbolTable = new SymbolTable();


            POTBAGErrorListener.conTroller = debug;
            DebugPrinter.isDebug = debug;
            //set start node
            try
            {
                SWAEParser.ProgContext cst = parser.prog();
                if (parser.NumberOfSyntaxErrors != 0) { Environment.Exit(1); }

                ProgNode ast = new BetterAdvGmASTVisitor().VisitProg(cst);

                var contextualAnalysis = new ASTContextualAnalysis(symbolTable).Visit(ast);
                POTBAGErrorListener.ErrorCheck();

                ASTCodeGen codeGenerator = new ASTCodeGen(symbolTable);
                codeGenerator.Visit(ast);
                List<string> code = codeGenerator.GetResult();

                FileHandler.PrintCCodeDebug(code);
                FileHandler.WriteToFile(code);
            }
            //IMPORTANT TODO: Der er blevet ændret, husk når merge
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
                    case VariableNotDeclaredException _:
                    case UsedWithoutValueException _:
                    case NotImplementedException _: //sry
                        POTBAGErrorListener.Report((dynamic)e, null);
                        break;
                    case BennoException _:
                    case Exception _:
                        throw;
                }
            }
            finally
            {
                Ccwipe();
                Environment.Exit(debug ? 112 : 0);
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
