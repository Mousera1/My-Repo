package javapackage;

import java.util.Scanner;

public class SumoftwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		System.out.println("Enter the value of c:");
		int c = sc.nextInt();
		System.out.println("Enter the value of d:");
		int d = sc.nextInt();
		
		int sum1= a+b;
		int sum2=c+d;
		if(sum1>sum2)
		

		{
			System.out.println("a plus b is greater than c plus d");
		}
		
		
	}
}

