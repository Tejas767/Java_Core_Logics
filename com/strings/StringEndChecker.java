package com.programs.strings;

import java.util.Scanner;

public class StringEndChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a first word: ");
		String firstWord = sc.next();

		System.out.print("Enter a second word: ");
		String secondWord = sc.next();

		int count = 0;
		for (int i = firstWord.length() - 1, j = secondWord.length() - 1; j >= 0; i--, j--) {
			if (firstWord.charAt(i) == secondWord.charAt(j)) {
				count++;
			}
		}
		if (count == secondWord.length()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}
