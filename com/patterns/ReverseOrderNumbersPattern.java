package com.programs.patterns;

import java.util.Scanner;

public class ReverseOrderNumbersPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
