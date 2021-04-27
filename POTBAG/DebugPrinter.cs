using System;
using System.Collections.Generic;
using System.Text;

namespace POTBAG
{
    public static class DebugPrinter
    {
        private static int CIndex = 1;
        internal static bool isDebug;

        public static void Ccwl(string msg)
        {
            Console.WriteLine(ColorChange(CIndex++)+msg+ColorChange());
        }

        public static void Ccw(string msg)
        {
            Console.Write(ColorChange(CIndex) + msg + ColorChange());
        }

        public static void CcwlError(string msg)
        {
            //make red
            Console.WriteLine($"\u001b[38;5;{1}m" + msg + ColorChange());
        }
        public static void Ccwipe()
        {
            Console.Write(ColorChange());
        }

        public static string ColorChange(int num = 0)
        {
            if (isDebug) { 
            int theme = 23; //OG: 23
            //string mNum = num == 0 ? "0" : $"38;5;{(num % 7 + 22 + 6 * theme) % 231}";

            int[] rainbow = { 124, 197, 198, //red 
                              202, 208, 214, //orange
                              220, 221, 222, //yellow
                              114, 112, 106, //green
                               31,  32,  33, //blue
                              201, 200, 127};//purple
            //string mNum = num == 0 ? "0" : $"38;5;{rainbow[num % 18]}";

            int[] NorspangsTheme = { 214, 202, 172, 166, 94, 173};
            string mNum = num == 0 ? "0" : $"38;5;{NorspangsTheme[num % 6]}";

            return $"\u001b[{mNum}m";
            }
            else
            {
                int[] NorspangsTheme = { 214, 202, 172, 166, 94, 173 };
                string mNum = num == 0 ? "0" : $"38;5;{NorspangsTheme[num % 6]}";
                return $"\u001b[{mNum}m";
            }
        }

    }
}
