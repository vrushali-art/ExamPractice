using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment15
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("ASCII values between 0 to 255 are:");
            for(int i = 0; i <=255; i++) 
            {
                Console.WriteLine($"{i}: {(char)i}");
                if(i%10==9)
                {
                    Console.WriteLine();
                    Console.ReadKey();
                }
               
            }
            
        }
    }
}
