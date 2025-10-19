package com.corejava.basics;

import java.util.Scanner;

public class RangePrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a start from: ");
		int start = sc.nextInt();

		System.out.println("Enter a end from: ");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			int count = 0;
			if (i > 1) {
				for (int j = 2; j < i; j++) {
					if (i % j == 0) {
						count++;
						break;
					}
				}
			}
			if (count == 0) {
				System.out.println(i);
			}
		}
	}
}
