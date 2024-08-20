using System;

class Program
{
    static void Main()
    {
        // Prompt the user to enter a year
        Console.Write("Enter a year: ");
        int year;

        // Validate user input
        while (!int.TryParse(Console.ReadLine(), out year) || year <= 0)
        {
            Console.WriteLine("Invalid input. Please enter a valid positive numeric value for the year.");
            Console.Write("Enter a year: ");
        }

        // Check if it's a leap year using the conditional operator
        string result = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? "Leap year" : "Not a leap year";
        Console.WriteLine($"{year} is {result}.");
    }
}