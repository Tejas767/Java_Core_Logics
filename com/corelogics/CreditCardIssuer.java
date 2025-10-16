package com.corejava.basics;

import java.util.Scanner;

public class CreditCardIssuer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Credit Card Score: ");
		int score = sc.nextInt();

		if (score < 400 || score > 850) {
			System.out.print("Invalid Card Score.");
		} else if (score >= 400 && score < 600) {
			System.out.println("Silver Card");
		} else if (score >= 600 && score < 800) {
			System.out.println("Gold Card");
		} else {
			System.out.println("Platinum Card");
		}
		sc.close();
	}
}
