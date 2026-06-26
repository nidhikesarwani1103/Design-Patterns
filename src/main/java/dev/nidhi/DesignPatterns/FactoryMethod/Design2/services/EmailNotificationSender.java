package dev.nidhi.DesignPatterns.FactoryMethod.Design2.services;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sending email notification");
    }
}
