using System;
using System.Runtime.Serialization;

namespace SWAE.Exceptions
{
    [Serializable]
    internal class inBlockErrorException : Exception
    {
        public inBlockErrorException()
        {
        }

        public inBlockErrorException(string message) : base(message)
        {
        }

        public inBlockErrorException(string message, Exception innerException) : base(message, innerException)
        {
        }

        protected inBlockErrorException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }
    }
}