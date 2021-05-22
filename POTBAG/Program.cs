using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using SWAE.ContextualAnalysis;
using SWAE.CSTtoAST;
using System;
using SWAE.Exceptions;
using static SWAE.DebugPrinter;
using SWAE.CodeGen;
using System.Collections.Generic;
using System.Linq;
using System.Diagnostics;

namespace SWAE
{
    class Program
    {
        static void Main(string[] args)
        {
            //debugging hell.
            bool debug = false;
            bool showAnalysis = false;

            string postfix = ".txt";
            string stream = string.Empty;
            string fileName = string.Empty;

            bool CheckArgs(IEnumerable<string> args, string flag) => args.Contains(flag);


            if (args.Length == 0)
            {
                //fileName = "UpdatedPseudoDrageCodeGenTest.txt";
                //fileName = "SWAEBetaTest.txt";
                //fileName = "Errors4Days.txt";
                fileName = "THEDRAGONOFSMAGORUN";

                Console.WriteLine($"Try compile \'{fileName}{postfix}\'? (Y/N)\n");
                if (Console.ReadKey().Key == ConsoleKey.Y)
                {
                    Console.WriteLine("\nUse debug pathing? (Y/N)");
                    if (Console.ReadKey().Key == ConsoleKey.Y)
                        FileHandler.pathPrefix = "..\\..\\..\\..\\";

                    stream = FileHandler.readFromInputStream(fileName + postfix);                 
                }
                else
                {
                    return;
                }

            }
            else if (args[0] == "-h")
            {
                //leave empty
            }
            else
            {
                try
                {
                    postfix = args[0].Split('.')[1];

                    if (postfix != "txt" && postfix != "swae")
                    {
                        Console.WriteLine("\nFile type not supported. Use \'.txt\' or \'.swae\'");
                        return;
                    }
                    stream = FileHandler.readFromInputStream(args[0]);
                    fileName = args[0].Split('.')[0];
                }
                catch (Exception)
                {
                    Console.WriteLine($"\nFilename needs to be first argument. Got first argument as \'{args[0]}\'\n");
                    return;
                }
            }
            
            if (CheckArgs(args, "-d"))
            {
                debug = true;
                DebugPrinter.themePick = true;
            }
            if (CheckArgs(args, "-dr"))
            {
                debug = true;
                DebugPrinter.themePick = false;
            }
            if (CheckArgs(args, "-a"))
            {
                showAnalysis = true;
            }
            if(CheckArgs(args, "-h") || CheckArgs(args, "help"))
            {
                Console.WriteLine("\n ~ SWAE ~ Simple Written Adventure Engine\n\n -a    Displays contextual analysis.\n -d    Enable dev tools.");
                return;
            }
            


            ICharStream input = CharStreams.fromString(stream);
            ITokenSource lexer = new SWAELexer(input);
            ITokenStream tokenStream = new CommonTokenStream(lexer);
            SWAEParser parser = new SWAEParser(tokenStream);
            SymbolTable symbolTable = new SymbolTable();


            SWAEErrorListener.conTroller = debug;
            DebugPrinter.isDebug = debug;
            DebugPrinter.ShowAnalysis = showAnalysis;
            //set start node
            try
            {
                SWAEParser.ProgContext cst = parser.prog();
                if (parser.NumberOfSyntaxErrors != 0) { Environment.Exit(1); }

                ProgNode ast = new BetterAdvGmASTVisitor().VisitProg(cst);

                var contextualAnalysis = new ASTContextualAnalysis(symbolTable).Visit(ast);
                SWAEErrorListener.ErrorCheck();

                ASTCodeGen codeGenerator = new ASTCodeGen(symbolTable);
                codeGenerator.Visit(ast);
                List<string> code = codeGenerator.GetResult();

                //FileHandler.PrintCCodeDebug(code);
                FileHandler.WriteToFile(code, fileName);
              
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
                        SWAEErrorListener.Report((dynamic)e, null);
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
