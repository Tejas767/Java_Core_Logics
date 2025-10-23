package com.programs.strings;

import java.util.Scanner;

public class FindMaxOccurance {
	public static void main(String[] args) {
		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int arr[] = new int[256];

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			arr[ch]++;
		}

		int max = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] > arr[max]) {
				max = j;
			}
		}

		System.out.print("Character with maximum occurrence: " + (char) max);
		sc.close();
	}
}
