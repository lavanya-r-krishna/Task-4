package com.task4;
import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // The user to enter an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Initialize count variable
        int count = 0;

        // Handle the case when the number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Count the digits
            int temp = Math.abs(number); // Take absolute value to handle negative numbers
            while (temp != 0) {
                temp /= 10; // Remove the last digit
                count++;
            }
        }

        // Print the result
        System.out.println("The number of digits in " + number + " is: " + count);

        // Close the scanner
        scanner.close();
    }
}


//output
//Enter an integer: 988734557
//The number of digits in 988734557 is: 9
