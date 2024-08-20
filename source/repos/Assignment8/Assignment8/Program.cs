/*
Write a program to find LEAP year by using – 
If – Else and logical operators.
Conditional operator.
Note – A Leap year is divisible by 4 and is not divisible by 100 but it could be divisible by 400.

 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment8
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter a year");
                int year = int.Parse(Console.ReadLine());
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                {
                    Console.WriteLine("Leap Year");
                }
                else
                {
                    Console.WriteLine("Not a Leap Year");
                }

                /*String year =  ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? $"{year} is Leap Year" : "Not a Leap Year";
                Console.WriteLine(year);*/
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadKey();

        }
    }
}
