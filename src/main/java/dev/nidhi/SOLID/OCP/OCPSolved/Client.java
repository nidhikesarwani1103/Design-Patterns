package dev.nidhi.SOLID.OCP.OCPSolved;

public class Client {
    public static void main(String[] args) {
        NotificationSender emailService = new EmailService();
        OrderService orderService1 = new OrderService(emailService);
        orderService1.placeOrder();

        NotificationSender smsService = new SMSService();
        OrderService orderService2 = new OrderService(smsService);
        orderService2.placeOrder();
    }
}
