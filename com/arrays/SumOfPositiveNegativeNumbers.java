package com.programs.arrays;

import java.util.Scanner;

public class SumOfPositiveNegativeNumbers {
	public static void main(String[] args) {
		System.out.print("Enter size of array: ");
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.print("\nEnter positive negative numbers: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int positiveNumbers = 0;
		int negativeNumbers = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 && arr[i] != 0) {
				negativeNumbers = negativeNumbers + arr[i];
			}
			if (arr[i] > 0 && arr[i] != 0) {
				positiveNumbers = positiveNumbers + arr[i];
			}
		}

		System.out.print("\nSum of positive numbers: " + positiveNumbers);
		System.out.print("\nSum of neative numbers: " + negativeNumbers);
		sc.close();
	}
}
