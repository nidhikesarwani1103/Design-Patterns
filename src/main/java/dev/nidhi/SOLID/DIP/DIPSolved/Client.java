package dev.nidhi.SOLID.DIP.DIPSolved;

public class Client {
    public static void main(String[] args) {
        User user1 = new User("premium", "Alice");
        User user2 = new User("regular", "Bob");

        NotificationSender email = new EmailService();
        NotificationSender sms = new SMSService();
        NotificationSender whatsapp = new WhatsAppService();

        NotificationManager manager = new NotificationManager(
                                          email, sms, whatsapp);
        OrderService orderService = new OrderService(manager);

        orderService.placeOrder(user1);
        orderService.placeOrder(user2);
    }
}
