package dev.nidhi.DesignPatterns.Bridge;


public class Client {
    public static void main(String[] args) {

        Notification notification = new EmailNotification(new HighPriority());
        OrderService orderService = new OrderService(notification);
        orderService.placeOrder("For Nidhi");
    }
}
