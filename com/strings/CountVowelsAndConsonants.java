package com.programs.strings;

import java.util.Scanner;

public class CountVowelsAndConsonants {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int countVowels = 0;
		int countConsonents = 0;
		StringBuffer vowelsFound = new StringBuffer();
		StringBuffer consonantsFound = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
						|| ch == 'O' || ch == 'U') {
					countVowels++;
					vowelsFound.append(input.charAt(i));
				} else {
					countConsonents++;
					consonantsFound.append(input.charAt(i));
				}
			}
		}
		System.out.println("\nVowels found in string are: " + vowelsFound + " means " + countVowels);
		System.out.println("\nConsonants in string are: " + consonantsFound + " means " + countConsonents);
		sc.close();
	}
}
