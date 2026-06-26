package dev.nidhi.DesignPatterns.FactoryMethod.Design2;

import dev.nidhi.DesignPatterns.FactoryMethod.Design2.Factory.NotificationFactory;
import dev.nidhi.DesignPatterns.FactoryMethod.Design2.services.NotificationSender;

public class OrderService {
    NotificationFactory notificationFactory;

    public OrderService(NotificationFactory notificationFactory) {
        this.notificationFactory = notificationFactory;
    }

    public void placeOrder(){
        System.out.println("Placing order!");
        NotificationSender notificationSender = notificationFactory.create();
        notificationSender.send();
    }
}
