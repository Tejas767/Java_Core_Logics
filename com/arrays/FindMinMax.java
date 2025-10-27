package com.programs.arrays;

import java.util.Scanner;

public class FindMinMax {
	public static void main(String[] args) {
		System.out.println("Enter a size of array: ");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[] = new int[size];

		System.out.println("Enter numbers to add in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int max = arr[0];
		int min = arr[0];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > max) {
				max = arr[j];
			} else if (arr[j] < min) {
				min = arr[j];
			}
		}
		System.out.println("\nMax from array: " + max);
		System.out.println("\nMin from array: " + min);
		sc.close();
	}
}
