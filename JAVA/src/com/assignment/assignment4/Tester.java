package com.assignment.assignment4;


public class Tester {

	public static void main(String[] args) {
		try {
			//code may raise exception
			Account a = new Account(0, "Soham", 0);
			System.out.println("Enter amount to deposit: -1");
			a.deposit(-1);
			System.out.println("Enter amount to withdraw: 50000");
			a.withdraw(500000);
		}
		catch(Exception e) {
			e.getMessage();
			//Print exception message
		}
	}
}
