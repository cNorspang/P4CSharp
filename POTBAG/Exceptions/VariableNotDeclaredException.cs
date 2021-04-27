using System;
using System.Runtime.Serialization;

namespace POTBAG.Exceptions
{
    [Serializable]
    public class VariableNotDeclaredException : Exception
    {
        public string Name;
        public VariableNotDeclaredException()
        {
        }

        public VariableNotDeclaredException(string name) : base(name)
        {
            Name = name;
        }

        public VariableNotDeclaredException(string message, Exception innerException) : base(message, innerException)
        {
        }

        public VariableNotDeclaredException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }

    }
}