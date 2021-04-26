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
            CcwlError("======= ERROR =======");
            switch (e)
            {
                case LocationSetupErrorException _:
                    CcwlError("There was an error is Location Setup");
                    break;
                case InvalidOperationException _ :
                    CcwlError("Wrong Operator");
                    break;
                case TravelOutsideLocationException ex:
                    CcwlError(ex.Message);
                    break;
                case TypeErrorException ex:
                    CcwlError($"Type Error - Excpeted Type: {ex.expected} | Got Type: {ex.actual}");
                    break;
                case IllegalTravelException ex:
                    CcwlError($"{ex.Message}");
                    break;
                case DuplicateVariableError ex:
                    CcwlError($"Duplicate declaration of variable \"{ex.Message}\"");
                    break;
                case InvalidTravelArrangementException ex:
                    CcwlError($"{e.Message}");
                    break;
                case NotImplementedException ex: //sry norspang
                    CcwlError($"{e.Message}");
                    break;
                default:
                    CcwlError($"Hey, du fucker med vores grundvand! Fuck dig Karsten: {e}");
                    break;
            }
        }
    }
}