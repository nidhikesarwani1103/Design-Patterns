package dev.nidhi.DesignPatterns.FactoryMethod.Design2;


import dev.nidhi.DesignPatterns.FactoryMethod.Design2.Factory.EmailFactory;
import dev.nidhi.DesignPatterns.FactoryMethod.Design2.Factory.NotificationFactory;
import dev.nidhi.DesignPatterns.FactoryMethod.Design2.Factory.SMSFactory;

/*
    After an order is placed,
    send a notification.

    Notification can be:
    - Email
    - SMS
    - WhatsApp
 */
public class Client {
    public static void main(String[] args){

        NotificationFactory notificationFactory = new EmailFactory();
        OrderService orderService1 = new OrderService(notificationFactory);
        orderService1.placeOrder();

        notificationFactory = new SMSFactory();
        OrderService orderService2 = new OrderService(notificationFactory);
        orderService2.placeOrder();

    }
}
