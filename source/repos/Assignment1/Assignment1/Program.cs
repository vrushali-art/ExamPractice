using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try
            {
                Console.WriteLine("WEL-COME INFOWAY");
            }
            catch (Exception e)
            {
                Console.WriteLine($"{e.Message}");
            }
            Console.ReadKey();
        }
    }
}
