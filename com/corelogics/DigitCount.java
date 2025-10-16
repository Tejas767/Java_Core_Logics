package com.corejava.basics;

import java.util.Scanner;

public class DigitCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int userInput = sc.nextInt();

		int cnt = 0;
		while (userInput > 0) {
			userInput = userInput / 10;
			cnt++;
		}
		System.out.println("Total " + cnt + " digits are in number.");
		sc.close();
	}
}
