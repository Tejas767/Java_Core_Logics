package com.programs.strings;

import java.util.Scanner;

public class ShiftToNextCharacter {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			output = output + (char) (input.charAt(i) + 1);
		}
		System.out.print(output);
		sc.close();
	}
}
