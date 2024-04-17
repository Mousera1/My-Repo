package javapackage;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				System.out.print("Enter a positive integer: ");
				int number = sc.nextInt();
				if (isPrime(number)) {
				            System.out.println(number + " is a prime number.");
				        } else {
				            System.out.println(number + " is not a prime number.");
				        }


	}

	private static boolean isPrime(int number) {
		// TODO Auto-generated method stub
		return false;
	}

}
