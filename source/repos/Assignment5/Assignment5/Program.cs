using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment5
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                int a = 20;
                int b = 40;
                Console.WriteLine($"Before Swapping: a:{a} b:{b}");
                int c;
                c = a;
                a = b;
                b = c;
                Console.WriteLine($"After Swapping: a:{a} b:{b}");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message); 
            }
            Console.ReadKey();

        }
    }
}
