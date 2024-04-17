package javapackage;

import java.util.Scanner;

public class atoZ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the letter from A to Z:"); 
		//String c = sc.next();
		
		for (char ch = 'A'; ch<='Z'; ch++)
		{
			System.out.println(ch + "");
		}
	}

}
