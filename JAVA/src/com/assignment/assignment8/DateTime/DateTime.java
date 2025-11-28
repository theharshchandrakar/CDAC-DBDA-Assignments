package com.assignment.assignment8.DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DateTime {

    public static void main(String[] args) {
        System.out.println("--- 1. Age Calculator ---");
        calculateAge();
        System.out.println("\n");

        System.out.println("--- 2. Programmer's Day (256th day of the year) ---");
        int currentYear = Year.now().getValue();
        computeProgrammersDay(currentYear);
        System.out.println("\n");
        
        System.out.println("--- 3. Finding all 'Friday the 13ths' in " + currentYear + " ---");
        findFridayThe13ths(currentYear);
        System.out.println("\n");
    }

    public static void calculateAge() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your birth year (YYYY): ");
            int year = scanner.nextInt();

            System.out.print("Enter your birth month (1-12): ");
            int month = scanner.nextInt();

            System.out.print("Enter your birth day (1-31): ");
            int day = scanner.nextInt();

            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();

            Period age = Period.between(birthDate, currentDate);

            System.out.printf("You are %d years, %d months, and %d days old.%n",
                age.getYears(), age.getMonths(), age.getDays());

        } catch (InputMismatchException e) {
            System.err.println("Invalid input. Please enter numbers only.");
        } catch (java.time.DateTimeException e) {
            System.err.println("Invalid date. Please enter a correct date (e.g., month between 1-12).");
        } 
    }

    public static void computeProgrammersDay(int year) {
        LocalDate programmersDay = LocalDate.ofYearDay(year, 256);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        System.out.printf("Programmer's Day in %d is on: %s%n", year, programmersDay.format(formatter));
    }

    public static void findFridayThe13ths(int year) {
        System.out.println("Searching for unlucky Fridays...");
        int count = 0; 
        
        for (Month month : Month.values()) {
            LocalDate date = LocalDate.of(year, month, 13);
            
            if (date.getDayOfWeek() == DayOfWeek.FRIDAY) {
                System.out.println("  -> " + date.format(DateTimeFormatter.ofPattern("MMMM d, yyyy")));
                count++; 
            }
        }
        
        if (count == 0) {
            System.out.println("No 'Friday the 13ths' found in " + year + ".");
        } else {
            System.out.println("Found " + count + " instance(s).");
        }
    }
}


