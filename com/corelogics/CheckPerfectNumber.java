package com.corejava.basics;

import java.util.Scanner;

public class CheckPerfectNumber {

	public static boolean PerfectNumber(int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		return sum == num;
	}

	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.print(PerfectNumber(num));
		sc.close();
	}
}
