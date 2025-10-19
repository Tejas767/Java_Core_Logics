package com.corejava.strings;

import java.util.Scanner;

public class CheckStringPalindrome {
	public static void main(String[] args) {
		System.out.print("Enter a word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String reversedWord = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			reversedWord = reversedWord + word.charAt(i);
		}

		if (reversedWord.equals(word)) {
			System.out.println(word + " is a Palindrome Word");
		} else {
			System.out.println(word + " is not a Palindrome Word");
		}

		sc.close();
	}
}
