package com.programs.arrays;

import java.util.Scanner;

public class SumOfTwoMatrix {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows in matrix: ");
		int rows = sc.nextInt();
		System.out.print("\nEnter number of columns in matrix: ");
		int columns = sc.nextInt();

		int matrixOne[][] = new int[rows][columns];
		int matrixTwo[][] = new int[rows][columns];

		// matrix three
		System.out.print("\nEnter elements in matrix one: ");
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < columns; j++) {
				matrixOne[i][j] = sc.nextInt();
			}
		}

		// matrix two
		System.out.print("\nEnter elements in matrix two: ");
		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < columns; j++) {
				matrixTwo[i][j] = sc.nextInt();
			}
		}

		// sum matrix
		int sum[][] = new int[rows][columns];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				sum[i][j] = matrixOne[i][j] + matrixTwo[i][j];
			}
		}

		// print sum
		System.out.println("\nYour sum matrix: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
