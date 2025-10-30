package com.programs.patterns;

import java.util.Scanner;

public class PascalsTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.println();

		// top
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// bottom
		for (int i = num - 1; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
