using System;


namespace POTBAG.ContextualAnalysis
{
    public class Symbol
    {

        protected Scope scope; // the owning scope
        protected AssignedStatus ContentStatus;
        protected string name;
        protected Type type;

        public Symbol(string name, Type type)
        {
            this.name = name;
            ContentStatus = AssignedStatus.empty;
            this.type = type;
        }

        public void SetContentStatus(AssignedStatus newStatus)
        {
             ContentStatus = newStatus;
        }

        public AssignedStatus GetContentStatus()
        {
            return ContentStatus;
        }

        public string GetName()
        {
            return name;
        }

        public Type GetSymbolType()
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

        public override string ToString()
        {
            if (type != null) return '<' + GetName() + ":" + type.Name + '>';
            return GetName();
        }

        public enum AssignedStatus
        {
            empty,
            full
        }
    }
}
