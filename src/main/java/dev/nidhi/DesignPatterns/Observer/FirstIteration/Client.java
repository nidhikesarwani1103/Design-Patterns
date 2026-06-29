package dev.nidhi.DesignPatterns.Observer.FirstIteration;


import dev.nidhi.DesignPatterns.Observer.FirstIteration.Services.*;

public class Client {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        orderService.register(new NotificationService());
        orderService.register(new InventoryService());
        orderService.register(new InvoiceService());
        orderService.register(new LoyaltyService());
        orderService.register(new RecommendationService());
        orderService.placeOrder();

    }
}
