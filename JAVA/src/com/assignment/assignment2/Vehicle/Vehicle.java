package com.assignment.assignment2.Vehicle;

//abstract class
public abstract class Vehicle {

    protected String registrationNo;
    protected String make;
    protected String model;
    protected double price;

    //Constructor
    public Vehicle(String registrationNo, String make, String model, double price) {
        this.registrationNo = registrationNo;
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public double getPrice() {
        return price;
    }

//abstract method
    public abstract double calculateInsurance();

    public void displayDetails() {
        System.out.println("Registration No: " + registrationNo);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Price: Rs. " + String.format("%,.2f", price));
    }
}
