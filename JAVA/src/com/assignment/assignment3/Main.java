package com.assignment.assignment3;

import com.assignment.assignment2.Vehicle.Bike;
import com.assignment.assignment2.Vehicle.Car;
import com.assignment.assignment2.Vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        Admin admin = new Admin();

        //creating vehicles
        Car car1 = new Car("KA01-HH1234", "Tata", "Nexon", 1100000.00);
        Bike bike1 = new Bike("MH12-BC5678", "Honda", "Shine", 95000.00);
        Car car2 = new Car("DL03-FF9999", "Maruti", "Brezza", 1350000.00);

        System.out.println("\n Printing for a given vehicle");
        admin.printVehicleInsurance(bike1);
     
        //creating vehicle array
        Vehicle[] allVehicles = { car1, bike1, car2 };
        
        System.out.println("\n Generating a report for all vehicles");
        // Generate the report
        admin.generateInsuranceReport(allVehicles);
    }
}
