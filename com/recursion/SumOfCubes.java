package com.programs.recursion;

public class SumOfCubes {

	public static double sumOfCubes(double num) {
		if (num == 0) {
			return 0;
		} else {
			return Math.pow(num, 3) + sumOfCubes(num - 1);
		}
	}

	public static void main(String[] args) {
		System.out.println(sumOfCubes(3));
	}
}
