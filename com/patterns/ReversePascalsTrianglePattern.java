package com.programs.patterns;

import java.util.Scanner;

public class ReversePascalsTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.println();

		// top
		for (int i = 1; i <= num; i++) {
			for (int j = i; j < num; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// bottom
		for (int i = num; i > 0; i--) {
			for (int j = i; j <= num; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}
}
