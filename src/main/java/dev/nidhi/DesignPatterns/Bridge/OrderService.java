package dev.nidhi.DesignPatterns.Bridge;

public class OrderService {
    Notification notification;

    public OrderService(Notification notification) {
        this.notification = notification;
    }

    public void placeOrder(String message) {
        // Some order processing logic
        System.out.println("Order placed: " + message);
        notification.send(message);
    }
}
