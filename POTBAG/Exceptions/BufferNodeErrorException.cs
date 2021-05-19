using System;
using System.Runtime.Serialization;

namespace SWAE.Exceptions
{
    [Serializable]
    internal class BufferNodeErrorException : Exception
    {
        public BufferNodeErrorException()
        {
        }

        public BufferNodeErrorException(string message) : base(message)
        {
        }

        public BufferNodeErrorException(string message, Exception innerException) : base(message, innerException)
        {
        }

        public BufferNodeErrorException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }

    }
}