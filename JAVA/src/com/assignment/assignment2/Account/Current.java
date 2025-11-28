package com.assignment.assignment2.Account;


public class Current extends Account {

    private static final double MAX_WITHDRAWAL_LIMIT = 50000.0;
    private static final double MAX_DEPOSIT_LIMIT = 500000.0; 

    public Current(long accountNo, String name, double balance) {
        super(accountNo, name, balance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0 && amount <= MAX_DEPOSIT_LIMIT) {
            super.deposit(amount);
        } else if (amount > MAX_DEPOSIT_LIMIT) {
            System.out.println("Deposit failed. Maximum deposit limit is Rs. " + MAX_DEPOSIT_LIMIT);
            displayBalance();
        } else {
            super.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= MAX_WITHDRAWAL_LIMIT) {
            super.withdraw(amount);
        } else if (amount > MAX_WITHDRAWAL_LIMIT) {
            System.out.println("Withdrawal failed. Maximum withdrawal per transaction is Rs. " + MAX_WITHDRAWAL_LIMIT);
            displayBalance();
        } else {
            super.withdraw(amount);
        }
    }
}
