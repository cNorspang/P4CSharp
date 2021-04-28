using System;
using Antlr4.Runtime;
using POTBAG.ContextualAnalysis;
using static POTBAG.DebugPrinter;

namespace POTBAG.Exceptions
{
    public class POTBAGErrorListener
    {
        private bool conTroller = true;
        SymbolTable table = new SymbolTable();

        public POTBAGErrorListener(bool debug)
        {
            conTroller = debug;
        } 

        public void Report(Exception e)
        {
            CcwlError("======= ERROR =======");
            if (conTroller)
            {
                switch (e)
                {
                    case LocationSetupErrorException ex:
                        CcwlError(ex.Message);
                        break;
                    case InvalidOperationException _ :
                        CcwlError("Er du dum eller hva?");
                        break;
                    case TravelOutsideLocationException ex:
                        CcwlError("Svar mig lige, hvordan fuck jeg skal tjekke om jeg kan komme et sted hen, hvis jeg ikke allerede er et sted??");
                        break;
                    case TypeErrorException ex:
                        CcwlError($"jaa, det var så en: \"{ex.expected}\" ikk: \"{ex.actual}\",vel??");
                        break;
                    case IllegalTravelException ex:
                        CcwlError($"{ex.Message}");
                        break;
                    case VariableNotDeclaredException ex:
                        CcwlError($"Ehh, undskyld mig, men hvad fuck er \"{ex.Name}\"?????");
                        break;
                    case DuplicateVariableError ex:
                        CcwlError($"Nu siger du der er to variabler der hedder \"{ex.Message}\", hvilken en skal jeg bruge, nosse??");
                        break;
                    case InvalidTravelArrangementException ex:
                        CcwlError($"{ex.Message}");
                        break;
                    case UsedWithoutValueException ex:
                        CcwlError($"Bruh... Jeg skal bruge vaerdien af \"{ex.Name}\" men du har ikke fucking givet mig en.... ");
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

            if (!conTroller)
            {
                switch (e)
                {
                    case LocationSetupErrorException ex:
                        CcwlError(ex.Message);
                        break;
                    case InvalidOperationException _:
                        CcwlError("Wrong Operator");
                        break;
                    case TravelOutsideLocationException ex:
                        CcwlError("Cannot Travel from global scope, all Travel statements must be from within a location");
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
                    case UsedWithoutValueException ex:
                        CcwlError($"The variable \"{ex.Name}\" has been used, but it holds no value");
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
}