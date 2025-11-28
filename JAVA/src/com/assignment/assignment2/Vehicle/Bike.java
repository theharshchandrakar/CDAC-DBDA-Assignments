package com.assignment.assignment2.Vehicle;

import com.assignment.assignment3.Rentable;

// Bike classimplements the Rentable interface
public class Bike extends Vehicle implements Rentable {
	
    public Bike(String registrationNo, String make, String model, double price) {
        super(registrationNo, make, model, price);
    }

    @Override
    public double calculateInsurance() {
        // 5% of the price
        return price * 0.05;
    }

    @Override
    public double rent(int hrs) {
        double totalRent;
        int baseRentPerHour = 300;
        int lateFeePerHour = 100;
        int maxRegularHours = 3;

        if (hrs <= maxRegularHours) {
            // If rented for 3 hours or less, calculate normal rent.
            totalRent = hrs * baseRentPerHour;
        } else {
            // If rented for more than 3 hours, add late fees.
            double regularRent = maxRegularHours * baseRentPerHour;
            int extraHours = hrs - maxRegularHours;
            double lateFee = extraHours * lateFeePerHour;
            totalRent = regularRent + lateFee;
        }
        return totalRent;
    }
}
