using POTBAG.CSTtoAST;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using POTBAG.Exceptions;


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
            i = gotoList.Exists(i => i.variableName == node.Destination.variableName);
            // foreach (variableNode gotoLocation in gotoList)
            // {
            //     if (gotoLocation.variableName == node.Destination.variableName)
            //         i = true;
            // }

            if (!i) { throw new IllegalTravelException($"Illegal Travel: Cannot go from {sym.GetName()} to {node.Destination.variableName}"); }

        }

        /* This method validates:
         * - All mapped and declared locations correspond 1 to 1.
         * - Minimum of 1 end point exists.
         * - A location can only be mapped to itself if it contains only that map. 
         * - ...it also makes big O go brrrrrr ◑﹏◐.
         */
        public void ValidateTravelArrangement()
        {
            IEnumerable<string> DeclaredNotMapped;
            IEnumerable<string> MappedNotDeclared;
            Console.WriteLine($"{Clr(1)}$$$_LOCATION_MAPS_$$${Clr()}");
            int clrNum = 6;
            foreach (var i in locations)
            {
                Console.Write($"{Clr(clrNum++)}LocationMap: "+i.Key+" -> ");
                i.Value.ForEach(l => Console.Write(l.variableName+", "));
                Console.WriteLine(Clr());
            }
            
            List<string> keys = new List<string>();
            bool canEnd = false;

            List<string> declaredLocations = (from scp in allScopes from dic in scp.symbolMap 
                where dic.Value.GetSymbolType().Name == nameof(LocationDeclarationNode) select dic.Key).ToList();


            foreach (KeyValuePair<string, List<variableNode>> loc in locations)
            {
                string key = loc.Key;
                keys.Add(key);

                foreach (variableNode col in loc.Value)
                {
                    if (key == col.variableName && loc.Value.Count == 1)
                    {
                        //register end
                        canEnd = true;
                        Console.WriteLine(Clr(1) + "End point registered: " + key);
                    }
                    else if (key == col.variableName)
                        throw new InvalidTravelArrangementException($"Travel arrangement not valid: {key} cannot goto {col.variableName} and not be an End point.");
                }
            }

            declaredLocations.Sort();
            keys.Sort();

            if (!canEnd) 
                throw new InvalidTravelArrangementException($"Travel arrangement not valid: An End point is required.");
            if (!declaredLocations.SequenceEqual(keys))
            {
                DeclaredNotMapped = declaredLocations.Except(keys);
                MappedNotDeclared = keys.Except(declaredLocations);
                IEnumerable<string> mappedNotDeclared = MappedNotDeclared as string[] ?? MappedNotDeclared.ToArray();
                if (DeclaredNotMapped.Count() != 0 && mappedNotDeclared.Count() != 0)
                {
                    throw new InvalidTravelArrangementException($"The Following Locations are mapped, but not declared [{string.Join(',', mappedNotDeclared.ToList())}]\n" +
                                                                $"The Following Locations are declared, but not mapped [{string.Join(',',DeclaredNotMapped.ToList())}]");
                } 
                if (DeclaredNotMapped.Count() != 0)
                {
                    throw new InvalidTravelArrangementException($"The Following Locations are declared, but not mapped [{string.Join(',',DeclaredNotMapped.ToList())}]");
                }

                if (mappedNotDeclared.Count() != 0)
                {
                    throw new InvalidTravelArrangementException($"The Following Locations are mapped, but not declared [{string.Join(',', mappedNotDeclared.ToList())}]");
                }
                
                throw new InvalidTravelArrangementException(
                    $"Travel arrangement not valid: Declared Locations and Mapped Locations are not equal 1=1.[{declaredLocations.Count} != {keys.Count}]");
            }
        }

        public string Clr(int num = 0)
        {
            int theme = 9; //OG: 23
            string mNum = num == 0 ? "0" : $"38;5;{(num % 7 + 22 + 6 * theme) % 231}";
            return $"\u001b[{mNum}m";
        }
    }

    public enum ScopeType
    {
        GLOBAL,
        LOCAL
    }
}
