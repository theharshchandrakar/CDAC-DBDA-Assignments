package com.assignment.assignment1;


public class Departmentmain {

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 88.0);
        Student s2 = new Student("Harsh", 91.5);
        Student s3 = new Student("Grace", 76.0);
        Student s4 = new Student("Aman", 95.5);

        // array of students
        Student[] computerScienceStudents = {s1, s2, s3, s4};

        Department csDepartment = new Department("Computer Science", computerScienceStudents);

        csDepartment.displayAllStudents();

        double averageMarks = csDepartment.calculateAverageMarks();
        System.out.println("\nAverage marks for the department: " + String.format("%.2f", averageMarks));

        double averagePercentage = csDepartment.calculateAveragePercentage(100.0);
        System.out.println("Average percentage for the department: " + String.format("%.2f", averagePercentage) + "%");
    }
}
