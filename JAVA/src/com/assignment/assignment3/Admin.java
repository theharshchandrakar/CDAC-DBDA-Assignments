package com.assignment.assignment3;

import com.assignment.assignment2.Vehicle.Vehicle;

public class Admin {

 public void printVehicleInsurance(Vehicle vehicle) {
     System.out.println("--- Insurance Details for Registration No: " + vehicle.getRegistrationNo() + " ---");
     
     vehicle.displayDetails();

     double insuranceAmount = vehicle.calculateInsurance();
     System.out.println("Calculated Annual Insurance: Rs. " + String.format("%,.2f", insuranceAmount));
 }

 public void generateInsuranceReport(Vehicle[] vehicles) {
  
     for (Vehicle currentVehicle : vehicles) {
    	 printVehicleInsurance(currentVehicle);
               
     }  
 }
}

