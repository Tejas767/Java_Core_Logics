package com.programs.arrays;

import java.util.Scanner;

public class PrintEvenNumbers {
	public static void main(String[] args) {

		System.out.print("Enter a size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.print("\nEnter numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sumOfEven = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 == 0) {
				sumOfEven += arr[j];
			}
		}

		System.out.println("\nSum of even numbers is: " + sumOfEven);
		sc.close();
	}
}
