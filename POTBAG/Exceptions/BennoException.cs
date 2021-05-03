using System;
using System.Runtime.Serialization;

namespace SWAE.Exceptions
{
    [Serializable]
    internal class BennoException : Exception
    {
        public BennoException()
        {
        }

        public BennoException(string message) : base(message)
        {
        }

        public BennoException(string message, Exception innerException) : base(message, innerException)
        {
        }

        public BennoException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }

    }
}