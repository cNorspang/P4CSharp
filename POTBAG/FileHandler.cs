using System;
using System.Collections.Generic;
using System.IO;

namespace POTBAG.CSTtoAST
{
    public static class FileHandler
    {
        private static List<string> list = new List<string>();

        //Read file content into the string with - Files.lines(Path path, Charset cs)

        public static string readFromInputStream(string filePath)
        {
            string fileAsString = File.ReadAllText(filePath);

            return fileAsString;
        }

        public static void WriteToFile()
        {
            try
            {
                File.CreateText("..\\..\\..\\..\\" + "a.c").Dispose();

                File.WriteAllLines("..\\..\\..\\..\\" + "a.c", list);

                Console.WriteLine("Successfully wrote to the file. ");
            }
            catch (IOException e)
            {
                Console.WriteLine("An error occurred.");
                Console.WriteLine(e.Message);
            }
        }

        public static void write(string data)
        {
            list.Add(data);
        }

        //for debugging
        public static void PrintCCodeDebug()
        {
            foreach (string str in list)
            {
                Console.WriteLine(str);
            }
        }
    }
}