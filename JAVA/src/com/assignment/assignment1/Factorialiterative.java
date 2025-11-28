package com.assignment.assignment1;

import java.util.Scanner;

public class Factorialiterative {
	// Method to return factorial
    public static int factorial(int n) {
        int fact = 1; 
        for (int i = 1; i <= n; i++) { 			//iterative for loop
            fact = fact * i; 
        }
        return fact; 							// return the result
    }
    
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to get factorial: ");
        int num = sc.nextInt();

        int result = factorial(num); 			// call the method

        System.out.println("Factorial of " + num + " is: " + result);

        sc.close();
    }

    
}

