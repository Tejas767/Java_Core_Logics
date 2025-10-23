package com.programs.strings;

import java.util.Scanner;

public class CheckStringEndsWithMethod {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String s1 = sc.next();

		System.out.print("Enter second string: ");
		String s2 = sc.next();

		if (s1.endsWith(s2)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}

}
