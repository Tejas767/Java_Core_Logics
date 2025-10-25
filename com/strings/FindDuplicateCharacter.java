package com.programs.strings;

import java.util.Scanner;

public class FindDuplicateCharacter {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		Boolean found = false;

		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == (input.charAt(i + 1))) {
				found = true;
				break;
			}
		}
		System.out.println(found);
		sc.close();
	}
}
