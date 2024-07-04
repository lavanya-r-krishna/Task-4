package com.task4;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        //  enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Print the original values
        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap the values using an additional variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Print the swapped values
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Close the scanner
        scanner.close();
    }
}

//output
//Enter the second number: 43
//Before swapping:
//First number: 23
//Second number: 43
//After swapping:
//First number: 43
//Second number: 23