package javapackage;

import java.util.Scanner;

public class SeniorCitizen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the person is a senior citizen based on age
        if (age >= 60) {
            System.out.println("You are a senior citizen.");
        } else {
            System.out.println("You are not a senior citizen.");
        }

	}

}
