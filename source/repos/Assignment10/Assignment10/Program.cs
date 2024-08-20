using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment10
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter number 1: ");
            int num1 = int.Parse(Console.ReadLine());
            Console.WriteLine("Enter number 2: ");
            int num2 = int.Parse(Console.ReadLine());
            int ch;
            do
            {
                Console.WriteLine("1.Additon");
                Console.WriteLine("2.Subtraction");
                Console.WriteLine("3.Multiplication");
                Console.WriteLine("4.Division");
                Console.WriteLine("5.Exit");

                Console.WriteLine("Enter Your Choice....");
                ch = int.Parse(Console.ReadLine());
                switch (ch)
                {
                    case 1:
                        Console.WriteLine($"Addition: {num1 + num2}");
                        break;
                    case 2:
                        Console.WriteLine($"Subtraction: {num1 - num2}");
                        break;
                    case 3:
                        Console.WriteLine($"Multiplication: {num1 * num2}");
                        break;
                    case 4:
                        Console.WriteLine($"Division: {num1 / num2}");
                        break;
                    case 5:
                        Console.WriteLine("Exit...");
                        break;
                }
            }
            while (ch != 5) ;
            Console.ReadKey();

        }
    }
}
