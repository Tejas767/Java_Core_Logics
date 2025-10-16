package com.corejava.basics;

import java.util.Scanner;

public class FindEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = sc.nextInt();

		if (number % 2 == 0)
			System.out.println("\nGiven number " + number + " is Even.");
		else
			System.out.println("\nGiven number " + number + " is Odd.");

		sc.close();
	}

}
