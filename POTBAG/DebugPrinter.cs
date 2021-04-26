using System;
using System.Collections.Generic;
using System.Text;

namespace POTBAG
{
    public static class DebugPrinter
    {
        private static int CIndex = 1;

        public static void Ccw(string msg)
        {
            Console.WriteLine(ColorChange(CIndex++)+msg+ColorChange());
        }

        public static void Ccwnl(string msg)
        {
            Console.Write(ColorChange(CIndex++) + msg + ColorChange());
        }

        public static void CcwError(string msg)
        {
            //make red
            Console.WriteLine(ColorChange(1) + msg + ColorChange());
        }
        public static void Ccwipe()
        {
            Console.Write(ColorChange());
        }

        public static string ColorChange(int num = 0)
        {
            int theme = 23; //OG: 23
            string mNum = num == 0 ? "0" : $"38;5;{(num % 7 + 22 + 6 * theme) % 231}";
            return $"\u001b[{mNum}m";
        }

    }
}
