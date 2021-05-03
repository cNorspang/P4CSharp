using System;
using System.Runtime.Serialization;

namespace SWAE.Exceptions
{
    [Serializable]
    public class TravelOutsideLocationException : Exception
    {
        public TravelOutsideLocationException()
        {
        }

        public TravelOutsideLocationException(string message) : base(message)
        {
        }

        public TravelOutsideLocationException(string message, Exception innerException) : base(message, innerException)
        {
        }

        public TravelOutsideLocationException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }

    }
}