package dev.nidhi.DesignPatterns.FactoryMethod.Design2.Factory;

import dev.nidhi.DesignPatterns.FactoryMethod.Design2.services.NotificationSender;

public interface NotificationFactory {
    NotificationSender create();

}
