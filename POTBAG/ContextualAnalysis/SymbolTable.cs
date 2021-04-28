using POTBAG.CSTtoAST;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using POTBAG.Exceptions;
using static POTBAG.DebugPrinter;


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
            Ccwl("\n$$$_SCOPES_$$$");
            allScopes.ForEach(i => Ccwl("-$"+i.type+"$ "+i.ToString()));          
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
            try
            {
                locations.Add(node.Source.variableName, node.Destinations);
            }
            catch (ArgumentException)
            {
                throw new LocationSetupErrorException($"Duplicate mapping of location \"{node.Source.variableName}\"");
            }


            return true;
        }

        /*
         * Gets the current location and validates the travel with 
         * the allowed destinations.
         */
        public void ResolveTravel(TravelStatementNode node, Scope currentScope)
        {

            if (!locations.ContainsKey(node.Destination.variableName) && currentScope.Resolve(node.Destination.variableName).GetName() != null)
            {
                throw new TypeErrorException("Location", GetTypeOf(node.Destination.variableName));
            }
            
            Symbol sym = currentScope.GetLocation();
            List<variableNode> gotoList = locations[sym.GetName()];

            bool i = false;
            i = gotoList.Exists(i => i.variableName == node.Destination.variableName);

            if (!i) { throw new IllegalTravelException($"Illegal Travel: Cannot go from {sym.GetName()} to {node.Destination.variableName}"); }

        }

        /* This method validates:
         * - All mapped and declared locations correspond 1 to 1.
         * - Minimum of 1 end point exists.
         * - A location can only be mapped to itself if it contains only that map. 
         * - ...it also makes big O go brrrrrr ◑﹏◐.
         */

        string GetTypeOf(string varname)
        {
            Symbol retType = null;
            foreach (Scope scope in allScopes.Where(scope => retType == null))
            {
                scope.symbolMap.TryGetValue(varname, out retType);
            }

            if (retType != null)
            {
                return retType.GetSymbolType().Name == "Int32" ? "Int" : retType.GetSymbolType().Name;
            }
            
            throw new BennoException($"Symbol with name {varname} not found");
        }
        
        public void ValidateTravelArrangement()
        {
            IEnumerable<string> DeclaredNotMapped;
            IEnumerable<string> MappedNotDeclared;
            Ccwl("$$$_LOCATION_MAPS_$$$");
            foreach (var i in locations)
            {
                Ccw($"LocationMap: "+i.Key+" -> ");
                i.Value.ForEach(l => Ccw(l.variableName+", "));
                Ccwl("");
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
                        Ccwl("End point registered: " + key);
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
                IEnumerable<string> declaredNotMapped = DeclaredNotMapped.ToList();
                if (declaredNotMapped.Count() != 0 && mappedNotDeclared.Count() != 0)
                {
                    throw new InvalidTravelArrangementException($"The Following Locations are mapped, but not declared [{string.Join(',', mappedNotDeclared.ToList())}]\n" +
                                                                $"The Following Locations are declared, but not mapped [{string.Join(',',declaredNotMapped.ToList())}]");
                } 
                if (declaredNotMapped.Count() != 0)
                {
                    throw new InvalidTravelArrangementException($"The Following Locations are declared, but not mapped [{string.Join(',',declaredNotMapped.ToList())}]");
                }

                if (mappedNotDeclared.Count() != 0)
                {
                    throw new InvalidTravelArrangementException($"The Following Locations are mapped, but not declared [{string.Join(',', mappedNotDeclared.ToList())}]");
                }

                if (declaredLocations.Count() != declaredLocations.Distinct().Count())
                {
                    List<string> temp = new List<string>();

                    foreach (string i in declaredLocations)
                    {
                        if (temp.Contains(i))
                            throw new InvalidTravelArrangementException($"Duplicate declarations of location: \"{i}\"");
                        
                        temp.Add(i);
                    }
                }

                throw new InvalidTravelArrangementException(
                    $"Travel arrangement not valid: Declared Locations and Mapped Locations are not equal 1=1.[{declaredLocations.Count} != {keys.Count}]");
            }
        }

    }

    public enum ScopeType
    {
        GLOBAL,
        LOCAL
    }
}
