﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Assignment18
{
    internal class Program
    {
        static void Main(string[] args)
        {
            for(int i = 1;i<=3;i++) 
            {
                for(int j = 1;j<=3;j++)
                {
                    for(int k = 1;k<=3;k++)
                    {
                        Console.WriteLine($"{i} {j} {k}");
                    }
                }
            }
            Console.ReadKey();
        }
    }
}
