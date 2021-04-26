using System;
using Antlr4.Runtime;
using POTBAG.ContextualAnalysis;

namespace POTBAG.Exceptions
{
    public class POTBAGErrorListener
    {
        SymbolTable table = new SymbolTable();
        public void Report(LocationSetupErrorException e)
        {
            Console.WriteLine("There was an error is Location Setup");
        }

        public void Report(TypeErrorException e)
        {
            Console.WriteLine($"Type Error - Excpeted Type: {e.expected} | Got Type: {e.actual}");
        }
        
        public void Report(IllegalTravelException e)
        {
            Console.WriteLine($"{e.Message}");
        }

        public void Report(InvalidTravelArrangementException e)
        {
            Console.WriteLine(table.Clr(1));
            Console.WriteLine($"----- ERROR ----- \n{e.Message}");
        }

        public void Report(Exception exception)
        {
            Console.WriteLine($"You don' really fucked up now, boyo: {exception}");
        }
    }
}