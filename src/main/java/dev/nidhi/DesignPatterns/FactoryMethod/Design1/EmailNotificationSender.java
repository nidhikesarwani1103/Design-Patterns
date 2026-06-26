package dev.nidhi.DesignPatterns.FactoryMethod.Design1;

public class EmailNotificationSender implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sending email notification");
    }
}
