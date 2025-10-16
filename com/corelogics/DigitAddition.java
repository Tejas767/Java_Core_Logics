package com.corejava.basics;

import java.util.Scanner;

public class DigitAddition {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a digit: ");
		int userInput = sc.nextInt();

		if (userInput <= 0) {
			System.out.println("Wrong input!! try again..");
		}

		int sum = 0;
		while (userInput > 0) {
			int rem = userInput % 10;
			sum += rem;
			userInput /= 10;
		}
		System.out.println("Sum of digit is " + sum);
		sc.close();
	}
}
