package com.programs.arrays;

import java.util.Scanner;

public class ArrayFromUserInput {
	public static void main(String[] args) {
		System.out.print("Enter a size of array: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter elements to add in array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Here is your array: ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		sc.close();
	}
}
