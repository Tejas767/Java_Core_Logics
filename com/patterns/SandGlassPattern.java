package com.programs.patterns;

import java.util.Scanner;

public class SandGlassPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		System.out.println();

		// top
		for (int i = 0; i <= num - 1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= num - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		// bottom
		for (int i = num - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= num - 1; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}
