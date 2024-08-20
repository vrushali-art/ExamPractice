/*
 Write a program to accept an Employee no. And department no. As numeric data and designation code as character data. 
Display the entered data with proper messages as below and refer the below table for entered data – 
 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment12
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Department number: ");
            int dept = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter Designation code: ");
            char code = char.Parse(Console.ReadLine());

            if( dept == 10 && code == 'M')
            {
                Console.WriteLine("Department Name is: Purchase");
                Console.WriteLine("Designation is: Manager");
            }
            else if( dept == 20 && code ==  'S') 
            {
                Console.WriteLine("Department Name is: Sales");
                Console.WriteLine("Designation is: Supervisor");
            }
            else if (dept == 30 && code == 'A')
            {
                Console.WriteLine("Department Name is: Production");
                Console.WriteLine("Designation is: Analyst");
            }
            else if (dept == 40 && code == 's')
            {
                Console.WriteLine("Department Name is: Marketing");
                Console.WriteLine("Designation is: Sales Person");
            }
            else if (dept == 50 && code == 'a')
            {
                Console.WriteLine("Department Name is: Accounts");
                Console.WriteLine("Designation is: Accountant");
            }
            else
            {
                Console.WriteLine("Enter Valid Department Number and Designation Code");
            }
            Console.ReadKey();
        }
    }
}
