// See https://aka.ms/new-console-template for more information
using System;

class Program
{
    static void Main()
    {
        Console.WriteLine("Welcome to infoway");
        //Declare array to store marks
        double[] marks = new double[5];

        //prompt the user to enter marks
        for(int i=0;i<marks.Length;i++)
        {
            Console.Write($"Enter marks(i+1):");
        

        //validate user input
        while(!double.TryParse(Console.ReadLine(),out marks[i]))
        {
            Console.WriteLine("Invalid input. Please enter a valid numeric value.");
            Console.Write($"Enter mark {i + 1}: ");
        }
    }

        // Prompt the user to enter a character
        Console.Write("Enter a character: ");
        char inputChar;
        while (!char.TryParse(Console.ReadLine(), out inputChar))
        {
            Console.WriteLine("Invalid input. Please enter a single character.");
            Console.Write("Enter a character: ");
        }

        // Get the ASCII value of the character
        int asciiValue = (int)inputChar;

        // Display the ASCII value
        Console.WriteLine($"The ASCII value of '{inputChar}' is: {asciiValue}");
        // Declare and initialize two variables
        int a = 5;
        int b = 10;

        // Display the values before swapping
        Console.WriteLine($"Before swapping: a = {a}, b = {b}");

        // Swap the values using a third variable
        int temp = a;
        a = b;
        b = temp;

        // Display the values after swapping
        Console.WriteLine($"After swapping: a = {a}, b = {b}");
        // Hardcoded numbers
        int number1 = 5;
        int number2 = 7;

        // Calculate the sum11
        int sum11 = number1 + number2;

        // Display the result
        Console.WriteLine($"The sum of {number1} and {number2} is: {sum11}");
        //calculate the sum
        double sum1 = 0;
        foreach (double mark in marks)
        {
            sum1 += mark;
        }

        // Display the result
        Console.WriteLine($"The sum of the 5 marks is: {sum1}");

        // Calculate the average
        double sum = 0;
        foreach (double mark in marks)
        {
            sum += mark;
        }

double average = sum / marks.Length;

// Display the result
Console.WriteLine($"The average of the 5 marks is: {average}");
    }
    }
