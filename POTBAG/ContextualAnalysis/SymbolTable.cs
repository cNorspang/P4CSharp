using POTBAG.CSTtoAST;
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
        protected Dictionary<string, List<variableNode>> locations = new Dictionary<string, List<variableNode>>();

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
            int j = 6;
            Console.WriteLine($"\n{Clr(1)}$$$_SCOPES_$$${Clr()}");
            allScopes.ForEach(i => Console.WriteLine($"{Clr(j++)}-$"+i.type+"$ "+i.ToString()));
            Console.Write(Clr());
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

         public bool DefineNewTravelSource(LocationMappingNode node)
        {
            locations.Add(node.Source.variableName, node.Destinations);

            return true;
        }

        /*
         * Gets the current location and validates the travel with 
         * the allowed destinations.
         */
        public void ResolveTravel(TravelStatementNode node, Scope currentScope)
        {
            Symbol sym = currentScope.GetLocation();
            List<variableNode> gotoList = locations[sym.GetName()];

            bool i = false;
            foreach (variableNode gotoLocation in gotoList)
            {
                if (gotoLocation.variableName == node.Destination.variableName)
                    i = true;
            }

            if (!i) { throw new NotImplementedException($"Travel statement does not resolve. Locations do not connect: {sym.GetName()} -> {node.Destination.variableName}"); }

        }

        public void ValidateTravelArrangement()
        {
            Console.WriteLine($"{Clr(1)}$$$_LOCATION_MAPS_$$${Clr()}");
            int clrNum = 6;
            foreach (var i in locations)
            {
                Console.Write($"{Clr(clrNum++)}LocationMap: "+i.Key+" -> ");
                i.Value.ForEach(l => Console.Write(l.variableName+", "));
                Console.WriteLine(Clr());
            }

            List<string> a = new List<string>();
            List<string> b = new List<string>();

            foreach (var loc in locations)
            {
                a.Add(loc.Key);
                foreach (var col in loc.Value)
                {
                    b.Add(col.variableName);
                }
            }

            foreach (var lc in b)
            {
                if (!a.Contains(lc))
                    throw new NotImplementedException($"Travel arrangement not valid: {lc} is a dead-end");
            }

        }

        public string Clr(int num = 0)
        {
            string mNum = num == 0 ? "0" : "38;5;"+(num % 7 + 196).ToString();
            return $"\u001b[{mNum}m";
        }
    }

    public enum ScopeType
    {
        GLOBAL,
        LOCAL
    }
}
