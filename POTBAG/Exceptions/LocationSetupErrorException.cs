using System;
using System.Runtime.Serialization;

namespace POTBAG.Exceptions
{
    [Serializable]
    internal class LocationSetupErrorException : Exception
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