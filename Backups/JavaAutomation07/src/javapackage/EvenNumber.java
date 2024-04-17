package javapackage;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");  // 10%2=5
		int a = sc.nextInt();

		if (a%2==0)
		{
		System.out.println("a is an even number");
		}
		else
		{
		System.out.println("a is not an even number");
		}


	}

}
