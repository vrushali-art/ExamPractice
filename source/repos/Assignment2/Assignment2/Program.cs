using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter Marks:");
                float marks1 = float.Parse(Console.ReadLine());
                float marks2 = float.Parse(Console.ReadLine());
                float marks3 = float.Parse(Console.ReadLine());
                float marks4 = float.Parse(Console.ReadLine());
                float marks5 = float.Parse(Console.ReadLine());

                float sum = marks1 + marks2 + marks3 + marks4 + marks5;
                Console.WriteLine($"Sum is: {sum}");
                Console.WriteLine($"Average is: {sum / 5}");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadKey();
        }
    }
}
