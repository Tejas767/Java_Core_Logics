package com.programs.strings;

import java.util.Scanner;

public class RemoveVowelsFromString {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				continue;
			} else {
				sb.append(input.charAt(i));
			}
		}
		System.out.print("Removed vowels string: " + sb);

		sc.close();
	}
}
