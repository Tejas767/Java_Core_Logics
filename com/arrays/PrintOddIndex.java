package com.programs.arrays;

import java.util.Scanner;

public class PrintOddIndex {
	public static void main(String[] args) {
		System.out.print("Enter array size: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.print("\nEnter elements in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int sumOfOddIndexElements = 0;
		for (int j = 0; j < arr.length; j++) {
			if (j % 2 != 0) {
				System.out.println("odd index " + j + " have value: " + arr[j]);
				sumOfOddIndexElements = sumOfOddIndexElements + arr[j];
			}
		}
		System.out.println("\nSum of odd index elements is: " + sumOfOddIndexElements);

		sc.close();
	}
}
