package com.task4;
import java.util.Scanner;

public class SeniorCitizen {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the person is a senior citizen
        if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }

        // Close the scanner
        scanner.close();
    }
}


//output
//Enter your age: 56
//You are not a senior citizen.

//output2
//Enter your age: 65
//You are a senior citizen.
