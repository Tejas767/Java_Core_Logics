package com.corejava.basics;

import java.util.Scanner;

public class CheckSpecialNumber {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int digitOne = num % 10;
		int digitTwo = num / 10;

		int result = (digitOne + digitTwo) + (digitOne * digitTwo);

		System.out.print(result == num ? "Special number." : "Not a Special number.");

		sc.close();
	}
}
