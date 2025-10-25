package com.programs.strings;

import java.util.Scanner;

public class MiddleCharFinder {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		int length = input.length();

		if (length % 2 == 0) {
			// If the string length is even then it prints the two middle characters
			System.out.println(input.substring(length / 2 - 1, length / 2 + 1));
		} else {
			// If the string length is odd then it prints the single middle character
			System.out.println(input.substring(length / 2, length / 2 + 1));
		}
		sc.close();
	}
}
