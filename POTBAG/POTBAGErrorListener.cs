using System;
using System.Collections.Generic;
using Antlr4.Runtime;
using POTBAG.ContextualAnalysis;
using static POTBAG.DebugPrinter;

namespace POTBAG.Exceptions
{
    public static class POTBAGErrorListener
    {
        public static bool conTroller = true;
        static SymbolTable table = new SymbolTable();
        static Queue<string> ErrorQueue = new Queue<string>();
        
        public static void ErrorCheck()
        {
            if (ErrorQueue.Count != 0)
            {
                CcwlError("======= ERROR =======");
                foreach (string error in ErrorQueue)
                {
                    CcwlError(error);
                }

                Environment.Exit(conTroller ? 420 : 80085);
            }
        }
        
        public static void Report(Exception e, object sender)
        {
            if (conTroller)
            {
                switch (e)
                {
                    case LocationSetupErrorException ex:
                        ErrorQueue.Enqueue(ex.Message);
                        break;
                    case InvalidOperationException _ :
                        ErrorQueue.Enqueue("Er du dum eller hva?");
                        break;
                    case TravelOutsideLocationException ex:
                        ErrorQueue.Enqueue("Svar mig lige, hvordan fuck jeg skal tjekke om jeg kan komme et sted hen, hvis jeg ikke allerede er et sted??");
                        break;
                    case TypeErrorException ex:
                        ErrorQueue.Enqueue($"Hallooo, jeg skal bruge: \"{ex.expected}\" ikk: \"{ex.actual}\",vel??");
                        break;
                    case IllegalTravelException ex:
                        ErrorQueue.Enqueue($"{ex.Message}");
                        break;
                    case VariableNotDeclaredException ex:
                        ErrorQueue.Enqueue($"Ehh, undskyld mig, men hvad fuck er \"{ex.Name}\"?????");
                        break;
                    case DuplicateVariableError ex:
                        ErrorQueue.Enqueue($"Nu siger du der er to variabler der hedder \"{ex.Message}\", hvilken en skal jeg bruge, nosse??");
                        break;
                    case InvalidTravelArrangementException ex:
                        ErrorQueue.Enqueue($"{ex.Message}");
                        break;
                    case UsedWithoutValueException ex:
                        ErrorQueue.Enqueue($"Bruh... Jeg skal bruge vaerdien af \"{ex.Name}\" men du har ikke fucking givet mig en.... ");
                        break;
                    case BennoException ex: //sry norspang
                        ErrorQueue.Enqueue($"BENNO EXCEPTION BITCHES::!: {e.Message}");
                        break;
                    case NotImplementedException ex: //sry norspang
                        ErrorQueue.Enqueue($"{e.Message}");
                        break;
                    default:
                        ErrorQueue.Enqueue($"Hey, du fucker med vores grundvand! Fuck dig Karsten: {e}");
                        break;
                }
            }

            if (!conTroller)
            {
                switch (e)
                {
                    case LocationSetupErrorException ex:
                        ErrorQueue.Enqueue(ex.Message);
                        break;
                    case InvalidOperationException _:
                        ErrorQueue.Enqueue("Wrong Operator");
                        break;
                    case TravelOutsideLocationException ex:
                        ErrorQueue.Enqueue("Cannot Travel from global scope, all Travel statements must be from within a location");
                        break;
                    case TypeErrorException ex:
                        ErrorQueue.Enqueue($"Type Error - Expected Type: {ex.expected} | Got Type: {ex.actual}");
                        break;
                    case IllegalTravelException ex:
                        ErrorQueue.Enqueue($"{ex.Message}");
                        break;
                    case VariableNotDeclaredException ex:
                        ErrorQueue.Enqueue($"The variable \"{ex.Name}\" is used, but never delared");
                        break;
                    case DuplicateVariableError ex:
                        ErrorQueue.Enqueue($"Duplicate declaration of variable \"{ex.Message}\"");
                        break;
                    case InvalidTravelArrangementException ex:
                        ErrorQueue.Enqueue($"{ex.Message}");
                        break;
                    case UsedWithoutValueException ex:
                        ErrorQueue.Enqueue($"The variable \"{ex.Name}\" has been used, but it holds no value");
                        break;
                    case BennoException ex: //sry norspang
                        ErrorQueue.Enqueue($"BENNO EXCEPTION BITCHES::!: {e.Message}");
                        break;
                    case NotImplementedException ex: //sry norspang
                        ErrorQueue.Enqueue($"{e.Message}");
                        break;
                    default:
                        ErrorQueue.Enqueue($"Hey, du fucker med vores grundvand! Fuck dig Karsten: {e}");
                        break;
                }
            }
        }
    }
}