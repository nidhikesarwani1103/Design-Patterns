package dev.nidhi.DesignPatterns.FactoryMethod.Design2.Factory;

import dev.nidhi.DesignPatterns.FactoryMethod.Design2.services.WhatsAppNotificationSender;
import dev.nidhi.DesignPatterns.FactoryMethod.Design2.services.NotificationSender;

public class WhatsappFactory implements NotificationFactory {

    public NotificationSender create() {
        return new WhatsAppNotificationSender();
    }
}
