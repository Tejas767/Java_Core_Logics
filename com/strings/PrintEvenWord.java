package com.programs.strings;

import java.util.Scanner;

public class PrintEvenWord {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();

		String words[] = input.split(" ");

		System.out.print("\nWords in string that are even are: ");
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() % 2 == 0) {
				System.out.print(words[i] + " ");
			}
		}
		System.out.println(".");
		sc.close();
	}
}
