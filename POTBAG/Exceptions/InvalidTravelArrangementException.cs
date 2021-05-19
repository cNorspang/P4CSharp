using System;
using System.Runtime.Serialization;

namespace SWAE.Exceptions
{
    [Serializable]
    public class InvalidTravelArrangementException : Exception
    {
        public InvalidTravelArrangementException()
        {
        }

        public InvalidTravelArrangementException(string message) : base(message)
        {
        }

        public InvalidTravelArrangementException(string message, Exception innerException) : base(message, innerException)
        {
        }

        public InvalidTravelArrangementException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }

    }
}