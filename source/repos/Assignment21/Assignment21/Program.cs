using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment21
{
    internal class Program
    {
        static void Main(string[] args)
        {
            int ch;
            Program obj = new Program();
            do
            {
                Console.WriteLine("1.Square");
                Console.WriteLine("2.Circle");
                Console.WriteLine("3.Rectangle");

                Console.WriteLine("Enter your Choice..");
                ch = int.Parse(Console.ReadLine());
                switch (ch)
                {
                    case 1:
                        obj.SqAreaAndPeri();
                        break;
                    case 2:
                        obj.CirAreaAndCircum();
                        break;
                    case 3:
                        obj.RecAreaAndPeri();
                        break;
                    default:
                        Console.WriteLine("Enter Valid Choice");
                        break;
                }
            }
            while (ch != 4);
            Console.ReadKey();
        }
        
        public void SqAreaAndPeri()
        {
            Console.WriteLine("Enter Side");
            int s = int.Parse(Console.ReadLine());
            int area = s * s;
            int perimeter = 4 * s;
            Console.WriteLine($"Area of Square: {area}");
            Console.WriteLine($"Perimeter of Square: {perimeter}");
        }

        public void CirAreaAndCircum()
        {
            Console.WriteLine("Enter Radius");
            int r = int.Parse(Console.ReadLine());
            double area = 3.142 * r * r ;
            double circumference = 2 * 3.142 * r;
            Console.WriteLine($"Area of Circle: {area}");
            Console.WriteLine($"Circumference of Circle: {circumference}");
        }

        public void RecAreaAndPeri()
        {
            Console.WriteLine("Enter length");
            Console.WriteLine("Enter breadth");
            int l = int.Parse(Console.ReadLine());
            int b = int.Parse(Console.ReadLine());
            int area = l * b;
            int perimeter = 2*(l+b);
            Console.WriteLine($"Area of Circle: {area}");
            Console.WriteLine($"Perimeter of Square: {perimeter}");
        }
    }
}
