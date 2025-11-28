package com.assignment.assignment1;
import java.util.Scanner;  

public class Primecheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // to take input from user

        System.out.print("Enter a number: "); //asking user for input
        int num = sc.nextInt(); 

        boolean isPrime = true; 			//considering as Prime at first

        if (num <= 1) {   					//numbers <=1 are not prime
            isPrime = false; 
        } 
        else {
       
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number.");		//prime output
        } else {
            System.out.println(num + " is not a prime number.");    //not prime output
        }
        sc.close();
    }
}



