package javapackage;

import java.util.Scanner;

public class FactorialProgram {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a non-negative integer to calculate its factorial: ");
        int number = scanner.nextInt();
        
       int fact = 1;

        // Loop to calculate factorial
        for (int i = 1; i <= number; i++) {
            fact = fact * i; // Multiply 'fact' by 'i' in each iteration
        }

        // Print the factorial of the number
        System.out.println("Factorial of " + number + " is: " + fact);
    }

	}


