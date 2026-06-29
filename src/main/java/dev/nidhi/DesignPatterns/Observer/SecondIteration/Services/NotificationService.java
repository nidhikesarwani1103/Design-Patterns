package dev.nidhi.DesignPatterns.Observer.SecondIteration.Services;

import dev.nidhi.DesignPatterns.Observer.SecondIteration.OrderObserver;

public class NotificationService implements OrderObserver {

    public void update(){
        System.out.println("Notification Sent");
    }

}
