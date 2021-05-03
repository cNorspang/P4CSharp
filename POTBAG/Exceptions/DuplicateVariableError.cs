using System;
using System.Runtime.Serialization;

namespace SWAE.Exceptions
{
    [Serializable]
    public class DuplicateVariableError : Exception
    {
        public DuplicateVariableError()
        {
        }

        public DuplicateVariableError(string message) : base(message)
        {
        }

        public DuplicateVariableError(string message, Exception innerException) : base(message, innerException)
        {
        }

        public DuplicateVariableError(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }

    }
}