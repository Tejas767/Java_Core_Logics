package com.corejava.strings;

import java.util.Scanner;

public class WordCounter {
	public static void main(String[] args) {
		System.out.print("Enter a String: ");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		int count = 0;

		for (int i = 0; i < inputString.length(); i++) {
			if (Character.isWhitespace(inputString.charAt(i))) {
				count++;
			}
		}
		System.out.print("The String has " + (count + 1) + " words.");
		System.out.print("\nThe String has " + (inputString.split(" ").length) + " words.");
		sc.close();
	}
}
