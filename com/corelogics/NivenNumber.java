package com.corejava.basics;

import java.util.Scanner;

public class NivenNumber {
	public static int sum(int num) {
		int rem = 0;
		int result = 0;

		while (num != 0) {
			rem = num % 10;
			result = result + rem;
			num = num / 10;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println(num % sum(num) == 0 ? "The number is a Niven Number" : "The number is not a niven number");
		sc.close();
	}
}
