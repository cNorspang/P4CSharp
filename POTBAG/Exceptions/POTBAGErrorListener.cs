using System;
using Antlr4.Runtime;

namespace POTBAG.Exceptions
{
    public class POTBAGErrorListener
    {
        public void Report(Exception e)
        {
            switch (e)
            {
                case LocationSetupErrorException _:
                    Console.WriteLine("There was an error is Location Setup");
                    break;
                default:
                    Console.WriteLine("Undisclosed error");
                    break;
            }
        }
    }
}