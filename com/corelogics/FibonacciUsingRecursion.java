package com.corejava.basics;

import java.util.Scanner;

public class FibonacciUsingRecursion {

	public static int fibonacii(int n) {
		if (n == 0 || n == 1) {
			return n;
		} else {
			return fibonacii(n - 1) + fibonacii(n - 2);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			System.out.print(fibonacii(i) + ", ");
		}
		sc.close();
	}
}
