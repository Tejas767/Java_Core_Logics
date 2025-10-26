package com.programs.arrays;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		System.out.print("Enter a size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];
		int reversedArr[] = new int[arr.length];

		System.out.print("\nEnter a numbers to add in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0, j = arr.length; i < arr.length; i++, j--) {
			reversedArr[j - 1] = arr[i];
		}

		System.out.print("\nReversed array: ");
		for (int k = 0; k < reversedArr.length; k++) {
			System.out.print(reversedArr[k] + " ");
		}
		sc.close();
	}
}
