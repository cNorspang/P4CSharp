using System;
using System.Runtime.Serialization;

namespace SWAE.Exceptions
{
    [Serializable]
    public class TypeErrorException : Exception
    {
        public string expected { get; set; }
        public string actual { get; set; }

        public TypeErrorException(string Expected, string Actual)
        {
            expected = Expected;
            actual = Actual;
        }
    }
}