package dev.nidhi.DesignPatterns.FactoryMethod.Design1;

public class OrderService {
    public void placeOrder(String type){
        System.out.println("Placing order!");
        NotificationSender notificationSender;
        if(type.equals("EMAIL"))
        {
            notificationSender = new EmailNotificationSender();
        }
        else if(type.equals("SMS"))
        {
            notificationSender = new SMSNotificationSender();
        }
        else
        {
            notificationSender = new WhatsAppNotificationSender();
        }
        notificationSender.send();
    }
}

/*
Violates SRP: takes decision with placing order and sending notification
Violates OCP: If we add a new type of notification, we have to modify this class
Tight coupling: OrderService is tightly coupled with EmailNotificationSender,
                SMSNotificationSender and WhatsAppNotificationSender
 */
