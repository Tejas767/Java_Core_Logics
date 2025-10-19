package com.corejava.basics;

import java.util.Scanner;

public class CheckArmstrongNumber {
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int temp = num;
		int result = 0;

		while (num != 0) {
			int rem = num % 10;
			result = result + (rem * rem * rem);
//			result = (int) (result + (Math.pow(rem, 3)));
			num = num / 10;
		}

		if (result == temp) {
			System.out.println(temp + " is a Armstrong Number");
		} else {
			System.out.println(temp + "is not a Armstrong Number");
		}
		sc.close();
	}
}
