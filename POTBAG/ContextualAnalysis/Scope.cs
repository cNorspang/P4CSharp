using POTBAG.CSTtoAST;
using System;
using System.Collections.Generic;


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
        public void Define(string name, Type type)
        {
            Symbol symbol = new Symbol(name, type);
            symbol.SetScope(this);
            symbolMap.Add(symbol.GetName(), symbol);
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
                if (symbol.GetSymbolType() != type && type != typeof(TypeAccessException)) { throw new NotImplementedException(); }
                return symbol;
            }
            if (enclosingScope != null) return enclosingScope.Resolve(name, type);

            return null; // not found
        }

        public Symbol GetLocation()
        {
            foreach (var item in symbolMap)
            {
                if (item.Value.GetSymbolType().Name == typeof(LocationDeclarationNode).Name)
                    return item.Value;
            }
            if (enclosingScope != null) return enclosingScope.GetLocation();
            /* TODO this feels weird, !kosher
             * location not found, travel is called from no place
             */
            throw new NotImplementedException();  

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
