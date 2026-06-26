package dev.nidhi.OOPS.Abstract;

public class Client {
    public static void main(String[] args) {

        // CTE: Cannot instantiate the abstract class 'Employee'
        // Employee e = new Employee(1, "John");

        // Create instances of Developer and HR classes
        Employee developer = new Developer(1, "Alice");
        Employee hr = new HR(2, "Bob");

        // Display information and work for each employee
        System.out.println("Developer Information:");
        developer.display();
        developer.work();

        System.out.println("\nHR Information:");
        hr.display();
        hr.work();
    }
}
