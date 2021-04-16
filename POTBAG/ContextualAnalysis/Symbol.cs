using System;


namespace POTBAG.ContextualAnalysis
{
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

        public override string ToString()
        {
            if (type != null) return '<' + GetName() + ":" + type.Name + '>';
            return GetName();
        }
    }
}
