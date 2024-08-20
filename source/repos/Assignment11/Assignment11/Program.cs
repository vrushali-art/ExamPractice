/*
 * Write a program to find maximum of 3 numbers using – 
If – else.
Conditional operators.

 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment11
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter 3 numbers: ");
            int num1 = int.Parse(Console.ReadLine());
            int num2 = int.Parse(Console.ReadLine());
            int num3 = int.Parse(Console.ReadLine());

            if (num1 > num2 && num1 > num3)
            {
                Console.WriteLine($"{num1} is Greater");
            }
            else if(num2>num1 && num2>num3)
            {
                Console.WriteLine($"{num2} is Greater");
            }
            else
            {
                Console.WriteLine($"{num3} is Greater");
            }

            Console.ReadKey();
        }
    }
}
