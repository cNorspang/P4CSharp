using System;
using System.Collections.Generic;


namespace POTBAG.ContextualAnalysis
{
    public class Scope
    {

        public int genId;

        public ScopeType type;
        public Scope enclosingScope;
        protected IDictionary<string, Symbol> symbolMap = new Dictionary<string, Symbol>();

        public Scope(ScopeType Type, int GenId, Scope EnclosingScope)
        {
            type = Type;
            genId = GenId;
            enclosingScope = EnclosingScope;
        }


        /** Define a symbol in the current scope */
        public void Define(string name, Type type)
        {
            Symbol symbol = new Symbol(name, type);
            symbol.SetScope(this);
            symbolMap.Add(symbol.GetName(), symbol);
        }

        /**
         * Look up the symbol name in this scope and, if not found, 
         * progressively search the enclosing scopes. 
         * Return null if not found in any applicable scope.
         */
        public Symbol Resolve(string name)
        {
            Symbol symbol;

            if (symbolMap.TryGetValue(name, out symbol)) return symbol;

            if (enclosingScope != null) return enclosingScope.Resolve(name);

            return null; // not found
        }


        /** Where to look next for symbols */
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
            return symbolMap.Keys.Count != 0 ? keys : "symbolMap is empty :(";
        }

        public void PrintAllAccessibleKeys()
        {
            Console.WriteLine("--##--  ALL Keys accessable from scope  --##--");
            PrintKeysRecursively();
        }

        private void PrintKeysRecursively()
        {
            Console.WriteLine("-$ " + ToString());
            if (enclosingScope != null) enclosingScope.PrintKeysRecursively();
        }
    }
}
