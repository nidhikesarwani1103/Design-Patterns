package dev.nidhi.DesignPatterns.FactoryMethod.Design1;

public class SMSNotificationSender implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sending SMS notification");
    }
}
