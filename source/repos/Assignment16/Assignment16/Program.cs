using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment16
{
    internal class Program
    {
        static void Main(string[] args)
        {
             Console.WriteLine("Enter a number");
             int num = int.Parse(Console.ReadLine());
             int cnt=0;
             for(int i = 2;i<=num/2;i++)
             {
                 if(num%i == 0)
                 {
                     cnt++;
                     break;
                 }
             }
             if (cnt == 0)
             {
                 Console.WriteLine($"Prime number");
             }
             else
                 Console.WriteLine("Not Prime number");
             Console.ReadKey();


            //for loop
            /*for (int num = 2; num <= 25; num++)
            {
                int flag = 0;

                for (int i = 2; i <= Math.Sqrt(num); i++)
                {
                    if (num % i == 0 && num != i)
                    {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0)
                {
                    Console.WriteLine(num);
                }
            }

            Console.ReadKey();
            */


            //do - while Loop
            /*
            int num = 2;

            do
            {
                int flag = 0;

                for (int i = 2; i <= Math.Sqrt(num); i++)
                {
                    if (num % i == 0 && num != i)
                    {
                        flag = 1;
                        break;
                    }
                }

                if (flag == 0)
                {
                    Console.WriteLine(num);
                }

                num++;
            }
            while (num <= 25);

            Console.ReadKey();
            */

        }
    }
}
