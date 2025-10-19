package com.corejava.strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		System.out.println("Enter a word: ");
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String output = "";

		for (int i = word.length() - 1; i >= 0; i--) {
			output = output + word.charAt(i);
		}
		System.out.println(output);
		// with inbuilt
		System.out.println(new StringBuilder(word).reverse());
		sc.close();
	}
}
