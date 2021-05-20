using SWAE.CSTtoAST;
using System;
using System.Collections.Generic;
using SWAE.Exceptions;
using static SWAE.DebugPrinter;


namespace SWAE.ContextualAnalysis
{
    public class Scope
    {

        public int genId;

        public ScopeType type;
        public Scope enclosingScope;
        public IDictionary<string, Symbol> symbolMap = new Dictionary<string, Symbol>();

        public Scope(ScopeType Type, int GenId, Scope EnclosingScope)
        {
            type = Type;
            genId = GenId;
            enclosingScope = EnclosingScope;
        }


        /* Define a symbol in the current scope */
        public Symbol Define(string name, Type type)
        {
            try
            {
                Symbol symbol = new Symbol(name, type);
                symbol.SetScope(this);
                symbolMap.Add(symbol.GetName(), symbol);
                return symbol;
            }
            catch (Exception e)
            {
                SWAEErrorListener.Report(new DuplicateVariableError(name), this);
            }
            
            return null;
        }

        /*
         * Look up the symbol name in this scope and, if not found, 
         * progressively search the enclosing scopes. 
         * Return null if not found in any applicable scope.
         */
        public Symbol Resolve(string name)
        {
            return Resolve(name, typeof(TypeAccessException), false);
        }

        public Symbol Resolve(string name, bool needsToBeAssigned)
        {
            return Resolve(name, typeof(TypeAccessException), needsToBeAssigned);
        }


        public Symbol Resolve(string name, Type type, bool needsToBeAssigned)
        {
            Symbol symbol = new Symbol("Unassigned", typeof(Exception));

            if (symbolMap.ContainsKey(name))
            {
                symbol = symbolMap[name];
                if (needsToBeAssigned && symbol.GetContentStatus() == Symbol.AssignedStatus.empty) SWAEErrorListener.Report(new UsedWithoutValueException(symbol.GetName()),this);
                if (symbol.GetSymbolType() != type && type != typeof(TypeAccessException)) { SWAEErrorListener.Report(new TypeErrorException(symbol.GetSymbolType().ToString(), type.ToString()), this); }
                return symbol;
            }
            if (enclosingScope != null) return enclosingScope.Resolve(name, type, needsToBeAssigned);

            SWAEErrorListener.Report(new VariableNotDeclaredException(name), this); // not found
            return symbol;
        }

        public Symbol GetLocation()
        {
            foreach (KeyValuePair<string, Symbol> item in symbolMap)
            {
                if (item.Value.GetSymbolType().Name == typeof(LocationDeclarationNode).Name)
                    return item.Value;
            }
            if (enclosingScope != null) return enclosingScope.GetLocation();

            SWAEErrorListener.Report(new TravelOutsideLocationException(), this);
            return null;
        }

        /* Where to look next for symbols */
        public Scope EnclosingScope()
        {
            return enclosingScope;
        }

        public override string ToString()
        {
            string keys = "";
            foreach (KeyValuePair<string, Symbol> entry in symbolMap)
            {
                keys += entry.Value.ToString() + " : ";
            }
            return symbolMap.Keys.Count != 0 ? keys : "~~";
        }

        public void PrintAllAccessibleKeys()
        {
            Console.WriteLine("--##--  ALL Keys accessable from scope  --##--");
            PrintKeysRecursively();
        }

        private void PrintKeysRecursively()
        {
            Console.WriteLine("-$"+type+"$ " + ToString());
            if (enclosingScope != null) enclosingScope.PrintKeysRecursively();
        }
    }
}
