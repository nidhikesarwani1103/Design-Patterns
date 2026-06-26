package dev.nidhi.SOLID.LSP.LSPSolved;

public class Client {
    public static void main(String[] args) {
        User user1 = new User("premium", "Alice");
        User user2 = new User("regular", "Bob");

        EmailService es = new EmailService();
        SMSService ss = new SMSService();
        WhatsAppService ws = new WhatsAppService();
        NotificationManager nm = new NotificationManager(es, ss, ws);

        OrderService os = new OrderService(nm);
        os.placeOrder(user1);
        os.placeOrder(user2);
    }

}
