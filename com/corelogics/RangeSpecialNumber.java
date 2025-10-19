package com.corejava.basics;

import java.util.Scanner;

public class RangeSpecialNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start from: ");
		int start = sc.nextInt();

		System.out.println("Enter a end from: ");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			int digitOne = i % 10;
			int digitTwo = i / 10;

			int result = (digitOne + digitTwo) + (digitOne * digitTwo);

			System.out.println(result == i ? i + " Special number." : i + " Not a Special number.");
		}
		sc.close();
	}
}
