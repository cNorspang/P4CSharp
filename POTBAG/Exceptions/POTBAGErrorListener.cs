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
                case LocationSetupErrorException ex:
                    CcwlError(ex.Message);
                    break;
                case InvalidOperationException _ :
                    CcwlError("Wrong Operator");
                    break;
                case TravelOutsideLocationException ex:
                    CcwlError(ex.Message);
                    break;
                case TypeErrorException ex:
                    CcwlError($"Type Error - Expected Type: {ex.expected} | Got Type: {ex.actual}");
                    break;
                case IllegalTravelException ex:
                    CcwlError($"{ex.Message}");
                    break;
                case VariableNotDeclaredException ex:
                    CcwlError($"The variable \"{ex.Name}\" is used, but never delared");
                    break;
                case DuplicateVariableError ex:
                    CcwlError($"Duplicate declaration of variable \"{ex.Message}\"");
                    break;
                case InvalidTravelArrangementException ex:
                    CcwlError($"{ex.Message}");
                    break;
                case BennoException ex: //sry norspang
                    CcwlError($"BENNO EXCEPTION BITCHES::!: {e.Message}");
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