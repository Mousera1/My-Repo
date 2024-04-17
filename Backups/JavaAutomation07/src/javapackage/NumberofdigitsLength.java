package javapackage;

import java.util.Scanner;

public class NumberofdigitsLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        // Convert the integer to a string
        String numberStr = Integer.toString(number); // Convert to string and handle negative numbers

        // Count the number of digits in the string
        int digitCount = numberStr.length();

        // Display the result
        System.out.println("Number of digits in " + number + " is: " + digitCount);


	}

}
