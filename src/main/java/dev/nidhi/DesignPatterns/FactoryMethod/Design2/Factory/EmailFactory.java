package dev.nidhi.DesignPatterns.FactoryMethod.Design2.Factory;

import dev.nidhi.DesignPatterns.FactoryMethod.Design2.services.EmailNotificationSender;
import dev.nidhi.DesignPatterns.FactoryMethod.Design2.services.NotificationSender;

public class EmailFactory implements NotificationFactory {

    public NotificationSender create() {
        return new EmailNotificationSender();
    }
}
