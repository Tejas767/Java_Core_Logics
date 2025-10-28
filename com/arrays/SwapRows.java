package com.programs.arrays;

import java.util.Scanner;

public class SwapRows {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter rows of matrix: ");
		int rows = sc.nextInt();
		System.out.print("\nEnter columns of matrix: ");
		int columns = sc.nextInt();

		int arr[][] = new int[rows][columns];

		System.out.print("\nEnter elements in matrix: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// print matrix
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		System.out.print("\nEnter swap row: ");
		int swapRow = sc.nextInt();

		System.out.print("\nEnter swap row with: ");
		int swapRowWith = sc.nextInt();

		// swap rows
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp = arr[swapRow - 1][i];
			arr[swapRow - 1][i] = arr[swapRowWith - 1][i];
			arr[swapRowWith - 1][i] = temp;
		}

		System.out.println("\nAfter swap matrix: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		sc.close();
	}
}
