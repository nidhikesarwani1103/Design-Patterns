package dev.nidhi.DesignPatterns.FactoryMethod.Design2.Factory;

import dev.nidhi.DesignPatterns.FactoryMethod.Design2.services.SMSNotificationSender;
import dev.nidhi.DesignPatterns.FactoryMethod.Design2.services.NotificationSender;

public class SMSFactory implements NotificationFactory {

    public NotificationSender create() {
        return new SMSNotificationSender();
    }
}
