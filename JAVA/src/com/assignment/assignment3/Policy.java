package com.assignment.assignment3;

import com.assignment.assignment2.Vehicle.Vehicle;

public class Policy {

	public void displayInsurance(Vehicle v) {
		System.out.println("Vehicle details:"+ v);
		System.out.println("Vehicle Insurance details:"+ v);
		System.out.println(v.calculateInsurance());
	}
}
