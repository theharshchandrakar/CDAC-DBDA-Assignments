package com.assignment.assignment1;

public class Department {

    private String departmentName;
    private Student[] students; 

    public Department(String departmentName, Student[] students) {
        this.departmentName = departmentName;
        this.students = students;
    }

    public double calculateAverageMarks() {
        double totalSum = 0;
        for (Student student : students) {
            totalSum += student.getTotalMarks();
        }

        return totalSum / students.length;
    }

    public double calculateAveragePercentage(double maxMarksPerStudent) {
        if (students == null || students.length == 0 || maxMarksPerStudent <= 0) {
            return 0.0;
        }

        double totalMarksObtained = 0;
        for (Student student : students) {
            totalMarksObtained += student.getTotalMarks();
        }

        double totalMaxMarks = students.length * maxMarksPerStudent;
        
        return (totalMarksObtained / totalMaxMarks) * 100;
    }

    public void displayAllStudents() {
        System.out.println("--- Students in the " + departmentName + " Department ---");
        if (students == null || students.length == 0) {
            System.out.println("No students in this department.");
            return;
        }
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}

