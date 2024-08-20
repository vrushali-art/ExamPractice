/*
 * Write a program to accept a number from user and find its absolute value. Absolute always returns a positive value.
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment14
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter a number");
            int num = int.Parse(Console.ReadLine());
            Console.WriteLine($"Absolute number is: {Math.Abs(num)}");
            Console.ReadKey();
        }
    }
}
