package com.programs.arrays;

import java.util.Scanner;

public class CheckSparseMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows: ");
		int rows = sc.nextInt();

		System.out.print("\nEnter number of columns: ");
		int columns = sc.nextInt();

		int arr[][] = new int[rows][columns];

		System.out.print("\nEnter elements in matrix: ");

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("\nYour matrix :");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}

		int count = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				if (arr[i][j] == 0) {
					count++;
				}
			}
		}

		if (count > rows * columns / 2) {
			System.out.println("Yes its sparse matrix.");
		} else {
			System.out.println("No its not a sparse matrix.");
		}

		sc.close();
	}
}
