package dev.nidhi.DesignPatterns.FactoryMethod.Design2.services;

public class WhatsAppNotificationSender implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sending WhatsApp notification");
    }
}
