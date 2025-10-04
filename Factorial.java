package com.corelogics;

import java.util.Scanner;

public class Factorial {
    public static int factorial(int n) {
        if (n < 0) {
            System.out.println("Negative numbers do not have a factorial.");
        }
        if (n==0){
            return 1;
        }

        int sum = 1;

        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        return sum;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = sc.nextInt();

        System.out.println("Factorial of " + number + " is: " + factorial(number));
        sc.close();


    }
}
