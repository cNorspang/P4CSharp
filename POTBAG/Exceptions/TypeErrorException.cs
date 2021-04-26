using System;
using System.Runtime.Serialization;

namespace POTBAG.Exceptions
{
    [Serializable]
    public class TypeErrorException : Exception
    {
        public Type expected { get; set; }
        public Type actual { get; set; }

        public TypeErrorException(Type Expected, Type Actual)
        {
            expected = Expected;
            actual = Actual;
        }
    }
}