package com.programs.arrays;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter total subjects: ");

		int size = sc.nextInt();
		int marks[] = new int[size];

		System.out.print("Enter each subject marks: ");
		for (int i = 0; i < marks.length; i++) {
			marks[i] = sc.nextInt();
		}

		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		double avg = sum / marks.length;
		System.out.println("\nTotal Student Average: " + avg);
	}
}
