//Write a program to calculate Net Salary of an employee using Basic Salary based on following parameters – 
//HRA is 20% of basic salary.
//DA is 40% of basic salary.
//PF is 10% of Gross salary.
//Gross Salary is Basic Salary + HRA + DA.
//Net salary is Gross Salary – PF.


using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment7
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("Enter a Basic Salary");
                double bsalary = double.Parse(Console.ReadLine());

                double hra = 0.2 * bsalary;
                double da = 0.4 * bsalary;
                double grossSal = bsalary + hra + da;
                double pf = 0.2 * grossSal;
                double netSal = grossSal - pf;

                Console.WriteLine($"Net Salary is: {netSal}");
            }
            catch (Exception e)
            {
                Console.WriteLine(e.Message);
            }
            Console.ReadKey();
        }
    }
}
