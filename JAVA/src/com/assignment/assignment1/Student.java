package com.assignment.assignment1;

public class Student {

    private static int studentCount = 0;

    private int rollNo;
    private String name;
    private double totalMarks;

    //Default Constructor
    public Student() {
        studentCount++; 
        this.rollNo = studentCount; 
        this.name = "Unknown";
        this.totalMarks = 0.0;
    }

    //Parameterized Constructor
    public Student(String name, double totalMarks) {
        studentCount++; 
        this.rollNo = studentCount; 
        this.name = name;
        this.totalMarks = totalMarks;
    }

    // Getter and Setter Methods
    public int getRollNo() {
        return rollNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTotalMarks() {
        return totalMarks;
    }
    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }
 
    public static void displayStudentCount() {
        System.out.println("Total number of students: " + studentCount);
    }

    @Override
    public String toString() {
        return "Student [Roll No: " + rollNo + ", Name: " + name + ", Total Marks: " + totalMarks + "]";
    }
}
