package dev.nidhi.SOLID.SRP.SRPSolved;

/*
  New Requirement says that only premium Users can get  notifications

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
