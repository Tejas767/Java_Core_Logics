package com.corejava.basics;

import java.util.Scanner;

public class IntegerToBinary {
	public static void main(String[] args) {
		System.out.print("Enter a digit: ");
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int binaryNumber[] = new int[10];

		int i = 0;
		while (num != 0) {
			binaryNumber[i] = num % 2;
			i++;
			num = num / 2;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binaryNumber[j]);
		}
	}
}
