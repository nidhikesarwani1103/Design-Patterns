package dev.nidhi.SOLID.OCP.DesignWithOCP;


// What happens when we want to add new services like SMSService, PushNotificationService,
// etc. We will have to modify the OrderService class which violates the OCP principle.
// OCP says: Open for extension, closed for modification.
// Adding new functionality should not require changing already tested code.

// Solution:
/*
   Create an abstraction
   NotificationService  interface with a send() method.
   Implement this interface in different classes like EmailService, SMSService,
   PushNotificationService, etc

 */

public class OrderService {
    RepositoryService repositoryService;
    EmailService emailService;
    InvoiceService invoiceService;

    public OrderService(RepositoryService repositoryService,
                        EmailService emailService,
                        InvoiceService invoiceService) {
        this.repositoryService = repositoryService;
        this.emailService = emailService;
        this.invoiceService = invoiceService;
    }

    public void placeOrder() {
        System.out.println("Order placed");
        repositoryService.saveToDatabase();
        emailService.sendEmail();
        invoiceService.generateInvoice();
    }
}
