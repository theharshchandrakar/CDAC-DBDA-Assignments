package com.assignment.assignment1;

public class Studentmain {

    public static void main(String[] args) {
          Student.displayStudentCount();

        // using default constructor
        Student student1 = new Student();
        student1.setName("Alice");
        student1.setTotalMarks(85.5);

        // using the parameterized constructor
        Student student2 = new Student("Bob", 92.0);
        Student student3 = new Student("Charlie", 78.5);

        System.out.println("\n--- Student Details ---");
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());

        System.out.println("\n--- Final Student Count ---");
        Student.displayStudentCount();
    }
}
