package com.programs.strings;

import java.util.Scanner;

public class AddDuplicate {
	public static void main(String[] args) {
//		System.out.print("Enter a string: ");
//		Scanner sc = new Scanner(System.in);
//		String input = sc.next();
//		StringBuffer addDuplicate = new StringBuffer();
//
//		for (int i = 0; i < input.length(); i++) {
//			addDuplicate.append(input.charAt(i));
//			addDuplicate.append(input.charAt(i));
//			addDuplicate.append(input.charAt(i));
//		}
//		System.out.println(addDuplicate);
//		sc.close();

		System.out.print("Enter a string: ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		StringBuilder addDuplicate = new StringBuilder();

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			
			for (int j = 0; j <= i; j++) {
				addDuplicate.append(ch);
			}
			addDuplicate.append(" ");
		}

		System.out.println(addDuplicate);
		sc.close();
	}
}
