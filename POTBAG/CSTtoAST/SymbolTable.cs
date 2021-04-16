using System;
using System.Collections.Generic;
using System.Text;


namespace POTBAG.CSTtoAST
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

        /** 
         * Define a new variable in the current scope 
         * This is the entry point for adding new variables
         */
        public void Define(string name/*, List<string> parameters*/, Type type)
        {
            //string param = string.Join('.', parameters);
            Symbol symbol = new Symbol(/*null,*/ name /*+ param*/, type);
            Define(symbol);
        }

        /** Define a symbol in the current scope */
        private void Define(Symbol symbol)
        {
            symbol.SetScope(this);
            symbolMap.Add(symbol.GetName(), symbol);
        }

        /**
         * Look up the symbol name in this scope and, if not found, 
         * progressively search the enclosing scopes. 
         * Return null if not found in any applicable scope.
         */
        private Symbol Resolve(string name)
        {
            Symbol symbol;
 
            if (symbolMap.TryGetValue(name, out symbol)) return symbol;

            if (enclosingScope != null) return enclosingScope.Resolve(name);

            return null; // not found
        }
        /**
         * Lookup a variable starting in the current scope.
         * This is the entry point for lookups
         */
        public Symbol Resolve(string name, List<string> parameters)
        {
            string param = String.Join('.', parameters);
            return Resolve(name + param);
        }

        /** Where to look next for symbols */
        public Scope EnclosingScope()
        {
            return enclosingScope;
        }

        public string toString()
        {
            string keys = "";
            foreach (var entry in symbolMap)
            {
                keys += entry.Value.toString() + " : "; 
            }
            return symbolMap.Keys.Count != 0 ? keys : "symbolMap is empty :(";
        }

        public void PrintAllAccesssableKeys()
        {
            Console.WriteLine("--##--  ALL Keys accessable from scope  --##--");
            PrintKeysRecursively();
        }

        private void PrintKeysRecursively()
        {
            Console.WriteLine("-$ " + toString());
            if(enclosingScope != null) enclosingScope.PrintKeysRecursively();
        }
    }


    public enum ScopeType
    {
        GLOBAL,
        LOCAL
    }


    public class Symbol
    {

        protected Scope scope; // the owning scope
        //protected BaseDescriptor descriptor;
        protected string name;
        protected Type type;

        public Symbol(/*BaseDescriptor descriptor,*/ string name, Type type)
        {
            //this.descriptor = descriptor;
            this.name = name;
            this.type = type;
        }

        //public BaseDescriptor GetDescriptor()
        //{
        //    return descriptor;
        //}

        public string GetName()
        {
            return name;
        }

        public Type GetTypeScopeType()
        {
            return type;
        }

        public void SetScope(Scope scope)
        {
            this.scope = scope;
        }

        public Scope GetScope()
        {
            return scope;
        }

        public int GenId()
        {
            return scope.genId;
        }

        public string toString()
        {
            if (type != null) return '<' + GetName() + ":" + type.Name + '>';
            return GetName();
        }
    }

   

    public class SymbolTable
    {

        protected Stack<Scope> scopeStack;
        protected List<Scope> allScopes;
        protected int genId;

        public SymbolTable()
        {
            Init();
        }

        protected void Init()
        {
            scopeStack = new Stack<Scope>();
            allScopes = new List<Scope>();
            genId = 0;

            Scope globals = new Scope(ScopeType.GLOBAL, NextGenId(), null);
            scopeStack.Push(globals);
            allScopes.Add(globals);
        }

        public Scope PushScope()
        {
            Scope enclosingScope = scopeStack.Peek();
            Scope scope = new Scope(ScopeType.LOCAL, NextGenId(), enclosingScope);
            scopeStack.Push(scope);
            allScopes.Add(scope);
            return scope;
        }

        public void PopScope()
        {
            scopeStack.Pop();
        }

        public Scope CurrentScope()
        {
            if (scopeStack.Count > 0)
            {
                return scopeStack.Peek();
            }
            Console.WriteLine("Unbalanced scope stack. (way too many more pops than pushes)");
            return allScopes[0];
        }

        public Scope GetScope(int genId)
        {
            foreach (Scope scope in scopeStack)
            {
                if (scope.genId == genId) return scope;
            }
            return null;
        }

        private int NextGenId()
        {
            genId++;
            return genId;
        }

        public string toString()
        {
            StringBuilder sb = new StringBuilder();
            foreach (Scope scope in scopeStack)
            {
                sb.Append(scope.toString());
            }
            return sb.ToString();
        }
    }
}
