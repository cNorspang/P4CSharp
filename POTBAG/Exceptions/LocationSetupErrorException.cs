using System;
using System.Runtime.Serialization;

namespace SWAE.Exceptions
{
    [Serializable]
    public class LocationSetupErrorException : Exception
    {
        public LocationSetupErrorException()
        {
        }

        public LocationSetupErrorException(string message) : base(message)
        {
        }

        public LocationSetupErrorException(string message, Exception innerException) : base(message, innerException)
        {
        }

        public LocationSetupErrorException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }

    }
}