using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.Write("Enter Your Name: ");
            String name = Console.ReadLine();
            Console.Write("Enter Your Age: ");
            int age = int.Parse(Console.ReadLine());
            Console.WriteLine($"My Name is: {name} and age is: {age}");
            Console.ReadKey();
        }
    }
}
