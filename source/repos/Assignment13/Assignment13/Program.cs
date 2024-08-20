using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment13
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Date in dd/mm/yy format");
            string date = Console.ReadLine();
            string[] parts = date.Split('/');
            int month = int.Parse(parts[1]);
            int year = int.Parse(parts[2]);

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            {
                Console.WriteLine("There are 31 days in this month");
            }
            else if (month == 2)
            {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                {
                    Console.WriteLine("There are 29 days in this month");
                }
                else
                {
                    Console.WriteLine("There are 28 days in this month");
                }
            }
            else
            {
                Console.WriteLine("There are 30 days in this month");
            }
            Console.ReadKey();
        }
    }
}
