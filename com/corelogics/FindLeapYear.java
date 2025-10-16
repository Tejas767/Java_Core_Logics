package com.corejava.basics;

import java.util.Scanner;

public class FindLeapYear {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Year: ");
			int givenYear = sc.nextInt();

			if (givenYear % 100 == 0 && givenYear % 400 == 0) {
				System.out.println("Yes it is a Leap Year.");
			} else if (givenYear % 4 == 0 && givenYear % 100 != 0) {
				System.out.println("Yes it is a Leap Year.");
			} else {
				System.out.println("Given Year is not a Leap Year.");
			}

		}

	}
}
