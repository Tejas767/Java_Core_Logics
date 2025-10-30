package com.programs.patterns;

import java.util.Scanner;

public class InvertedMirrorTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				if (j < i) {
					System.out.print(" ");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}

		sc.close();
	}
}
