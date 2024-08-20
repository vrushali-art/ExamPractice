/*
 * Write a function to print Fibonacci series for the number of terms entered by the user.
 */
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment20
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a number");
            int num = int.Parse(Console.ReadLine());

            int a = 0, b = 1 ;

            for (int i = 1; i <= num; i++)
            {
                Console.Write($"{a} ");

                int temp = a + b;
                a = b;
                b = temp;
                //Console.Write($"{b} ");
                //Console.Write($"{num} ");
            }
            Console.ReadKey();
        }
    }
}
