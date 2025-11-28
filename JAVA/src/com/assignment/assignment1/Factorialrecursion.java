package com.assignment.assignment1;

import java.util.*;

public class Factorialrecursion {

    public static int factorial(int n) {
    if (n == 0) {
            return 1;
        } else {
           return n * factorial(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get factorial: ");
        int num = sc.nextInt();
        int result = factorial(num); 										// call the recursive method
        System.out.println("Factorial of " + num + " is: " + result);
        
    	sc.close();															//closing sc
	}
}