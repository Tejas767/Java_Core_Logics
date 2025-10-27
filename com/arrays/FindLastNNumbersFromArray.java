package com.programs.arrays;

import java.util.Scanner;

public class FindLastNNumbersFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int size = sc.nextInt();

		int arr[] = new int[size];

		System.out.println("Enter array elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter how many last numbers to display: ");
		int num = sc.nextInt();

		if (num > size || num <= 0) {
			System.out.println("Invalid number. Enter between 1 and " + size);
		} else {
			System.out.print("Last " + num + " numbers are: ");
			for (int j = size - num; j < arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
		}

		sc.close();
	}
}
