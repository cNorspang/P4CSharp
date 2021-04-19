using System;
using System.Collections.Generic;
using System.Text;


namespace POTBAG.ContextualAnalysis
{

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

        public void PrintAllKeysInSymbolTable()
        {
            allScopes.ForEach(i => Console.WriteLine("-$"+i.type+"$ "+i.ToString()));
        }

        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            foreach (Scope scope in scopeStack)
            {
                sb.Append(scope.ToString());
            }
            return sb.ToString();
        }
    }

    public enum ScopeType
    {
        GLOBAL,
        LOCAL
    }
}
