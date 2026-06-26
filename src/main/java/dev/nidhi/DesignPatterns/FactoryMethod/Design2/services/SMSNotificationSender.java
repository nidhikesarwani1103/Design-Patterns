package dev.nidhi.DesignPatterns.FactoryMethod.Design2.services;

public class SMSNotificationSender implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sending SMS notification");
    }
}
