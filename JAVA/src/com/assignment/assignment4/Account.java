package com.assignment.assignment4;

public class Account {
    protected long accountNo;
    protected String name;
    protected double balance;

    //Constructor
    public Account(long accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited Rs. " + amount);
        } else {
            System.out.println("Error: Enter valid amount.");
        }      
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Enter valid amount.");
        } else if (balance-amount>=0) {
            balance -= amount;
            System.out.println("Successfully withdrew Rs. " + amount);
        } else {
            System.out.println("Error: Withdrawal failed. Insufficient balance.");
        }
        
    }
}

