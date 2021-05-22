using System;
using System.Collections.Generic;
using System.IO;
using static SWAE.DebugPrinter;

namespace SWAE.CSTtoAST
{
    public static class FileHandler
    {
        private static List<string> list = new List<string>();
        public static string pathPrefix = Environment.CurrentDirectory + "\\";

        //Read file content into the string with - Files.lines(Path path, Charset cs)

        public static string readFromInputStream(string filePath)
        {
            string fileAsString = File.ReadAllText(pathPrefix + filePath);

            return fileAsString;
        }

        public static void WriteToFile(List<string> code, string fileName)
        {
            try
            {
                File.CreateText(pathPrefix + fileName + ".c").Dispose();

                File.WriteAllLines(pathPrefix + fileName + ".c", code);
               
                Console.WriteLine($"Successfully compiled \nPath: {pathPrefix}{fileName}");
            }
            catch (IOException e)
            {
                Console.WriteLine("An error occurred.");
                Console.WriteLine(e.Message);
            }
        }

        //for debugging
        public static void PrintCCodeDebug(List<string> code)
        {
            #region CBanner
            Ccwl("   ______          __        ______                           __            ");
            Ccwl("  / ____/___  ____/ /__     / ____/__  ____  ___  _________ _/ /_____  _____");
            Ccwl(" / /   / __ \\/ __  / _ \\   / / __/ _ \\/ __ \\/ _ \\/ ___/ __ `/ __/ __ \\/ ___/");
            Ccwl("/ /___/ /_/ / /_/ /  __/  / /_/ /  __/ / / /  __/ /  / /_/ / /_/ /_/ / /    ");
            Ccwl("\\____/\\____/\\__,_/\\___/   \\____/\\___/_/ /_/\\___/_/   \\__,_/\\__/\\____/_/     \n");
            #endregion

            foreach (string str in code)
            {
                Ccwl(str);
            }
        }

    }
}