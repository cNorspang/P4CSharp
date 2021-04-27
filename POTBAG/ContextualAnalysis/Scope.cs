using POTBAG.CSTtoAST;
using System;
using System.Collections.Generic;
using POTBAG.Exceptions;
using static POTBAG.DebugPrinter;


namespace POTBAG.ContextualAnalysis
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
                throw new DuplicateVariableError(name);
            }
        }

        /*
         * Look up the symbol name in this scope and, if not found, 
         * progressively search the enclosing scopes. 
         * Return null if not found in any applicable scope.
         */
        public Symbol Resolve(string name)
        {
            return Resolve(name, typeof(TypeAccessException));
        }

        public Symbol Resolve(string name, Type type)
        {
            Symbol symbol;

            if (symbolMap.ContainsKey(name))
            {
                symbol = symbolMap[name];
                if (symbol.GetContentStatus() == Symbol.AssignedStatus.empty) throw new NotImplementedException($"WHY U NO ASSIGN! {symbol.GetName()} is empty u donkey");
                if (symbol.GetSymbolType() != type && type != typeof(TypeAccessException)) { throw new TypeErrorException(symbol.GetSymbolType().ToString(), type.ToString()); }
                return symbol;
            }
            if (enclosingScope != null) return enclosingScope.Resolve(name, type);

            throw new VariableNotDeclaredException(name); // not found
        }

        public Symbol GetLocation()
        {
            foreach (KeyValuePair<string, Symbol> item in symbolMap)
            {
                if (item.Value.GetSymbolType().Name == typeof(LocationDeclarationNode).Name)
                    return item.Value;
            }
            if (enclosingScope != null) return enclosingScope.GetLocation();

            throw new TravelOutsideLocationException("Cannot Travel from global scope, all Travel statements must be from within a location");
        }

        /* Where to look next for symbols */
        public Scope EnclosingScope()
        {
            return enclosingScope;
        }

        public override string ToString()
        {
            string keys = "";
            foreach (var entry in symbolMap)
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
