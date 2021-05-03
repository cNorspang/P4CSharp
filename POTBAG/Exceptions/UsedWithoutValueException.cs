using System;
using System.Runtime.Serialization;

namespace SWAE.Exceptions
{
    [Serializable]
    public class UsedWithoutValueException : Exception
    {
        public string Name;
        public UsedWithoutValueException()
        {
        }

        public UsedWithoutValueException(string name) : base(name)
        {
            Name = name;
        }

        public UsedWithoutValueException(string message, Exception innerException) : base(message, innerException)
        {
        }

        public UsedWithoutValueException(SerializationInfo info, StreamingContext context) : base(info, context)
        {
        }

    }
}