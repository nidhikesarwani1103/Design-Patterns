package dev.nidhi.DesignPatterns.Command;

import dev.nidhi.DesignPatterns.Command.Notify.Notification;
import dev.nidhi.DesignPatterns.Decorator.Order;

public class FoodDeliveryService {
    Notification notification;

    public void setNotification(Notification notification){
        this.notification = notification;
    }
    public void placeOrder(){
        System.out.println("Order Placed!");
    }

    public void cancelOrder(){
        System.out.println("Order Cancelled!");
    }

    public void refund(){
        System.out.println("Refund Processed!");
    }

    public void generateInvoice(){
        System.out.println("Invoice Generated!");
    }

    public void sendEmail(){
        notification.send();
    }

}
