using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp2
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //prompt the user to enter the basic salary
            Console.Write("Enter a basic salary");
            double basicSalary;

            //validate user input
            while (!double.TryParse(Console.ReadLine(), out basicSalary) || basicSalary < 0) ;
            {

                Console.WriteLine("Invalid input. Please enter a valid positive numeric value for Basic Salary.");
                Console.Write("Enter Basic Salary: ");
            }

            // Calculate HRA (20% of Basic Salary)
            double hra = 0.2 * basicSalary;

            // Calculate DA (40% of Basic Salary)
            double da = 0.4 * basicSalary;

            // Calculate Gross Salary
            double grossSalary = basicSalary + hra + da;

            // Calculate PF (10% of Gross Salary)
            double pf = 0.1 * grossSalary;

            // Calculate Net Salary
            double netSalary = grossSalary - pf;

            // Display the result
            Console.WriteLine($"Basic Salary: {basicSalary}");
            Console.WriteLine($"HRA: {hra}");
            Console.WriteLine($"DA: {da}");
            Console.WriteLine($"Gross Salary: {grossSalary}");
            Console.WriteLine($"PF: {pf}");
            Console.WriteLine($"Net Salary: {netSalary}");
        }
    }
}



