package com.corejava.basics;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userInput = sc.nextInt();

		if (userInput <= 0) {
			System.out.println("Wrong input");
			return;
		}

		int reverse = 0;
		int temp = userInput;
		while (userInput > 0) {
			int rem = userInput % 10;
			reverse = reverse * 10 + rem;
			userInput /= 10;
		}
		System.out.println(reverse);
		if (reverse == temp)
			System.out.println(temp + " is palindrome");
		else
			System.out.println(temp + " not palindrome");

		sc.close();
	}
}
