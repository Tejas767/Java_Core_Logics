package com.corejava.basics;

import java.util.Scanner;

public class RepeatedDigits {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.print("Enter the digit to find: ");
		int findDigit = sc.nextInt();

		int count = 0;
		int n = num;

		while (n != 0) {
			if (n % 10 == findDigit) {
				count++;
			}
			n = n / 10;
		}

		if (count > 0) {
			System.out.println(findDigit + " appears " + count + " times in " + num + ".");
		} else {
			System.out.println(findDigit + " does not appear in " + num + ".");
		}

		sc.close();
	}
}
