package javapackage;

import java.util.Scanner;

public class PrintmultipleTimes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of times to print ");
        int numRepetitions = scanner.nextInt();

        
        String message = "Welcome to Guvi";

        int count = 0;

        // Repeat the message based on user input using a while loop
        while (count < numRepetitions) {
            System.out.println(message);
            count++; // Increment the counter
        }
	}
}