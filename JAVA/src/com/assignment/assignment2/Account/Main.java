package com.assignment.assignment2.Account;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Savings Account ---");
        Savings savings = new Savings(101, "Alice", 25000.0);
        savings.displayBalance();
        System.out.println();

       System.out.println("Attempting to withdraw Rs. 5,000...");
        savings.withdraw(5000);
        System.out.println();

        System.out.println("Attempting to withdraw Rs. 12,000...");
        savings.withdraw(12000);
        System.out.println();

       System.out.println("Attempting to deposit Rs. 20,000...");
        savings.deposit(20000); 
        System.out.println();

        System.out.println("Attempting to deposit Rs. 150,000...");
        savings.deposit(150000); 
        System.out.println();

        System.out.println("\n======================================\n");

        System.out.println("--- Testing Current Account ---");
        Current current = new Current(201, "Bob's Business", 100000.0);
        current.displayBalance();
        System.out.println();
        
        System.out.println("Attempting to withdraw Rs. 40,000...");
        current.withdraw(40000); 
        System.out.println();

        System.out.println("Attempting to withdraw Rs. 60,000...");
        current.withdraw(60000); 
        System.out.println();

        System.out.println("Attempting to deposit Rs. 200,000...");
        current.deposit(200000); 
        System.out.println();

        System.out.println("Attempting to deposit Rs. 600,000...");
        current.deposit(600000); 
        System.out.println();
    }
}

