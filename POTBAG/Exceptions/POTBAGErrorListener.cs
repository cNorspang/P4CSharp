using System;
using Antlr4.Runtime;
using POTBAG.ContextualAnalysis;
using static POTBAG.DebugPrinter;

namespace POTBAG.Exceptions
{
    public class POTBAGErrorListener
    {
        SymbolTable table = new SymbolTable();


        public void Report(Exception e)
        {
            CcwError("");
            Console.WriteLine("======= ERROR =======");
            switch (e)
            {
                case LocationSetupErrorException _:
                    Console.WriteLine("There was an error is Location Setup");
                    break;
                case InvalidOperationException _ :
                    Console.WriteLine("Wrong Operator");
                    break;
                case TravelOutsideLocationException ex:
                    Console.WriteLine(ex.Message);
                    break;
                case TypeErrorException ex:
                    Console.WriteLine($"Type Error - Excpeted Type: {ex.expected} | Got Type: {ex.actual}");
                    break;
                case IllegalTravelException ex:
                    Console.WriteLine($"{ex.Message}");
                    break;
                case DuplicateVariableError ex:
                    Console.WriteLine($"Duplicate declaration of variable \"{ex.Message}\"");
                    break;
                case InvalidTravelArrangementException ex:
                    Console.WriteLine($"{e.Message}");
                    break;
                case NotImplementedException ex: //sry norspang
                    Console.WriteLine($"{e.Message}");
                    break;
                default:
                    Console.WriteLine($"Hey, du fucker med vores grundvand! Fuck dig Karsten: {e}");
                    break;
            }
        }
    }
}