package com.assignment.assignment3;

import com.assignment.assignment2.Vehicle.Bike;
import com.assignment.assignment2.Vehicle.Car;

import java.util.Scanner;

public class RentalMain {

    public static void main(String[] args) {
        // Create objects of different vehicles
        Car rentalCar = new Car("MH04-RT1234", "Honda", "City", 1500000.00);
        Bike rentalBike = new Bike("MH12-PQ5678", "Yamaha", "R15", 180000.00);

        // Use Scanner to get user input from the console
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- VEHICLE RENTAL SYSTEM ---");

        //Rent the Car
        System.out.print("\nEnter the number of hours to rent the Car (" + rentalCar.getMake() + " " + rentalCar.getModel() + "): ");
        int carHours = scanner.nextInt();
        double carRent = rentalCar.rent(carHours);
        System.out.println("-> Total rent for the Car for " + carHours + " hours is: Rs. " + String.format("%,.2f", carRent));
        System.out.println("\n");

        //Rent the Bike
        System.out.print("\nEnter the number of hours to rent the Bike (" + rentalBike.getMake() + " " + rentalBike.getModel() + "): ");
        int bikeHours = scanner.nextInt();
        double bikeRent = rentalBike.rent(bikeHours);
        System.out.println("-> Total rent for the Bike for " + bikeHours + " hours is: Rs. " + String.format("%,.2f", bikeRent));
        System.out.println("\n");

        scanner.close();
    }
}
