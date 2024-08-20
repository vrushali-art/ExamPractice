using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter Number 1: ");
                int marks1 = int.Parse(Console.ReadLine());
                Console.WriteLine("Enter Number 2:");
                int marks2 = int.Parse(Console.ReadLine());
                Console.WriteLine($"Addition of Two Numbers: {marks1 + marks2}");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadKey();
        }
    }
}
