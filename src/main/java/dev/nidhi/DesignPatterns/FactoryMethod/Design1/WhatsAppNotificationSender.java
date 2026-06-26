package dev.nidhi.DesignPatterns.FactoryMethod.Design1;

public class WhatsAppNotificationSender implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sending WhatsApp notification");
    }
}
