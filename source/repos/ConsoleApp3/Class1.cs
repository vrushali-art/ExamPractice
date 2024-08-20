using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp3
{
   class Class1
    {
       
        
            // Prompt the user to enter a year
            Console.Write("Enter a year: ");
            int year;

            // Validate user input
            while (!int.TryParse(Console.ReadLine(), out year) || year <= 0)
            {
                Console.WriteLine("Invalid input. Please enter a valid positive numeric value for the year.");
                Console.Write("Enter a year: ");
            }

            // Check if it's a leap year using If-Else and logical operators
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            {
                Console.WriteLine($"{year} is a leap year.");
            }
            else
            {
                Console.WriteLine($"{year} is not a leap year.");
            }
        }
    }

