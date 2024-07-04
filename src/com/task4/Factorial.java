package com.task4;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the factorial of the number
        long factorial = 1;  // Use long to handle large results
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        // Print the factorial
        System.out.println("The factorial of " + number + " is " + factorial);

        // Close the scanner
        scanner.close();
    }
}



//output
//Enter a number: 5
//The factorial of 5 is 120	




