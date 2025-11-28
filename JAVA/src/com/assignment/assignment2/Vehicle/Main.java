package com.assignment.assignment2.Vehicle;

public class Main {

    public static void main(String[] args) {
        // Create an instance of a TwoWheeler
        Bike bike = new Bike("MH12-AB1234", "Honda", "Activa 7G", 120000.00);

        System.out.println("--- Two Wheeler Details ---");
        bike.displayDetails();
        double bikeInsurance = bike.calculateInsurance();
        System.out.println("Annual Insurance Premium: Rs. " + bikeInsurance);

        System.out.println("\n");

        // Create an instance of a FourWheeler
        Car car = new Car("CG04-CD5678", "Maruti", "Swift", 1250000.00);

        System.out.println("--- Four Wheeler Details ---");
        car.displayDetails();
        double carInsurance = car.calculateInsurance();
        System.out.println("Annual Insurance Premium: Rs. " + carInsurance);
    }
}
