/*
 * Write a function Prime() which checks the user entered number passed to it is a prime number or not. In this 
 * function call another function called Check() which returns the status of the number whether it is positive or 
 * negative and pass it to main function. If the number is negative, ask user to re-enter the number or else print 
 * the positive number.

 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment19
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Program obj = new Program();
            obj.Check();
            Console.ReadKey();
        }

        public void Prime(int num)
        {
            int flag = 0;
            for (int i = 2; i * i <= num; i++)
            {
                if (num % i == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if (num <= 1)
            {
                Console.WriteLine("Not a Prime Number");
                return;
            }
            if (flag == 0)
            {
                Console.WriteLine("Prime Number");
            }
            else
            {
                Console.WriteLine("Not a Prime Number");
            }
        }
        public void Check()
        {

            Console.WriteLine("Enter a number");
            int num = int.Parse(Console.ReadLine());
            if(num<0)
            {
                Console.WriteLine("Re-enter the value");
            }
            else 
            {
                Prime(num);
            }

        }
    }
}
