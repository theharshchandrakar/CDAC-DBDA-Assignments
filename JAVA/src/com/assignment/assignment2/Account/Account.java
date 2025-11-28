package com.assignment.assignment2.Account;

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
            System.out.println("Deposit amount must be positive.");
        }
        displayBalance();
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (balance >= amount) {
            balance -= amount;
            System.out.println("Successfully withdrew Rs. " + amount);
        } else {
            System.out.println("Withdrawal failed. Insufficient balance.");
        }
        displayBalance();
    }

    public void displayBalance() {
        System.out.println("Account No: " + accountNo + " | Current Balance: Rs. " + String.format("%,.2f", balance));
    }

    // --- Getter methods ---
    public long getAccountNo() {
        return accountNo;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
}
