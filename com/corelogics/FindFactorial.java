package com.corejava.basics;

import java.util.Scanner;

public class FindFactorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter factorial number you want: ");
		int userInput = sc.nextInt();

		int factorial = 1;
		for (int i = userInput; i >= 1; i--) {
			factorial *= i;
		}
		System.out.println("Factorial of " + userInput + " is " + factorial + ".");

		sc.close();
	}
}
