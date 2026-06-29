package dev.nidhi.DesignPatterns.Observer.SecondIteration;

import dev.nidhi.DesignPatterns.Observer.SecondIteration.Services.*;

public class Client {
    public static void main(String[] args) {
        OrderPublisher publisher = new OrderPublisher();
        publisher.register(new NotificationService());
        publisher.register(new InventoryService());
        publisher.register(new InvoiceService());
        publisher.register(new LoyaltyService());
        publisher.register(new RecommendationService());

        OrderService orderService = new OrderService(publisher);
        orderService.placeOrder();
    }
}
