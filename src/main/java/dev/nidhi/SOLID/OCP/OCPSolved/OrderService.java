package dev.nidhi.SOLID.OCP.OCPSolved;


/*
    SRP = Split responsibilities.

    OCP = Make each responsibility extensible.

    We can do the same to database service, we can create an interface DataBaseService and
    implement it by different database services like MySQLService, MongoDBService, etc.
    and inject it into OrderService.

    We can also do the same for invoice service, we can create an interface InvoiceService
     and implement it by different invoice services like PDFInvoiceService, HTMLInvoiceService,
     etc.
 */
class OrderService {

    // It could be a list if we wanted to send multiple kind of notifications
    private NotificationSender notificationSender;

    public OrderService(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void placeOrder() {
        notificationSender.send();
    }
}
