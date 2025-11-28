package com.assignment.assignment2.Account;


public class Savings extends Account {

    // A constant to hold the minimum balance required for a savings account.
    private static double MIN_BALANCE = 10000.0;
    private static double MAX_DEPOSIT_LIMIT = 100000.0; // 1 Lakh

    public Savings(long accountNo, String name, double balance) {
        super(accountNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0 && amount <= MAX_DEPOSIT_LIMIT) {
            // If valid, call the parent class's deposit method
            super.deposit(amount);
        } else if (amount > MAX_DEPOSIT_LIMIT) {
            System.out.println("Deposit failed. Maximum deposit limit is Rs. " + MAX_DEPOSIT_LIMIT);
            displayBalance();
        } else {
            // Handles the case where amount is not positive
            super.deposit(amount);
        }
    }


    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            displayBalance();
            return;
        }

        // Check if the balance after withdrawal would be less than the minimum required.
        if ((balance - amount) >= MIN_BALANCE) {
            // If the transaction is valid, call the original withdraw method from the Account class.
            super.withdraw(amount);
        } else {
            System.out.println("Withdrawal failed. Minimum balance of Rs. " + MIN_BALANCE + " must be maintained.");
            displayBalance();
        }
    }
}
