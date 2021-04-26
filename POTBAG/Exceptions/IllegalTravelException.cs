using System;
using System.Runtime.Serialization;

namespace POTBAG.Exceptions
{
    [Serializable]
    public class IllegalTravelException : Exception
    {
        public IllegalTravelException()
        {
        }

        public IllegalTravelException(string message) : base(message)
        {
        }

        public IllegalTravelException(string message, Exception innerException) : base(message, innerException)
        {
        }

        public IllegalTravelException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }

    }
}