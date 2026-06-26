package dev.nidhi.SOLID.SRP.DesignWIthSRP;


// One class many responsibilities, SRP violation
// Single Responsibility Principle (SRP) states that
// a class should have only one reason to change. In this example, the OrderService
// class is responsible for multiple tasks: placing an order, saving to the database,
// sending an email, and generating an invoice. Each of these tasks could change for
// different reasons, which violates the SRP.


// Solution: We can refactor the code by creating separate classes for each responsibility.
// For example, we can create an OrderRepository class for database operations, an EmailService
// class for sending emails, and an InvoiceService class for generating invoices.
// This way, each class has a single responsibility and can be modified independently without affecting the others.

public class OrderService {
    public void placeOrder() {
        System.out.println("Order placed");
    }

    public void saveToDatabase() {
        System.out.println("Saved to DB");
    }

    public void sendEmail() {
        System.out.println("Email sent");
    }

    public void generateInvoice() {
        System.out.println("Invoice generated");
    }
}
