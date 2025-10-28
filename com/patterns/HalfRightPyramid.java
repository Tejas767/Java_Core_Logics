package com.programs.patterns;

import java.util.Scanner;

public class HalfRightPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");

		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {
			for (int i = 1; i <= j; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
