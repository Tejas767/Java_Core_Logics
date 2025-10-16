package com.corejava.basics;

import java.util.Scanner;

public class ReverseDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userInput = sc.nextInt();

		System.out.print("Reversed number: ");
		while (userInput > 0) {
			int rem = userInput % 10;
			userInput = userInput / 10;
			System.out.print(rem);
		}

		sc.close();
	}
}
