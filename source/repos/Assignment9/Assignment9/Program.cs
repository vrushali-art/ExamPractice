using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;

namespace Assignment9
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Basic Salary: ");
            double sal = double.Parse(Console.ReadLine());

            Console.WriteLine("Enter Total Sales: ");
            double totSal = double.Parse(Console.ReadLine());

            double commission;
            double netSal;
            if (totSal >= 5000 && totSal <=7500)
            {
                commission = totSal * 0.03;
                netSal = sal + commission;

                Console.WriteLine($"Commission is: {commission} Net Salary is: {netSal}");
            }
            else if(totSal >= 7501 && totSal <= 10500)
            {
                commission = totSal * 0.08;
                netSal = sal + commission;

                Console.WriteLine($"Commission is: {commission} Net Salary is: {netSal}");
            }
            else if(totSal >= 10501 && totSal <= 15000)
            {
                commission = totSal * 0.11;
                netSal = sal + commission;

                Console.WriteLine($"Commission is: {commission} Net Salary is: {netSal}");
            }
            else 
            {
                commission = totSal * 0.15;
                netSal = sal + commission;

                Console.WriteLine($"Commission is: {commission} Net Salary is: {netSal}");
            }

            Console.ReadKey();  
        }
        
    }
}
