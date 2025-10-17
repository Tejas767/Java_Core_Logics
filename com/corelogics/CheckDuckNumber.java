package com.corejava.basics;

import java.util.Scanner;

public class CheckDuckNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int rem;
		Boolean isDuckNumber = false;

		while (num != 0) {
			rem = num % 10;
			if (rem == 0) {
				isDuckNumber = true;
				break;
			}
			num = num / 10;
		}
		if (isDuckNumber) {
			System.out.println("Number is Duck Number.");
		} else {
			System.out.println("Not a Duck Number.");
		}

		sc.close();
	}
}
