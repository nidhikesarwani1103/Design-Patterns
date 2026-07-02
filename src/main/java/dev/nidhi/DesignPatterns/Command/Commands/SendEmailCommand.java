package dev.nidhi.DesignPatterns.Command.Commands;

import dev.nidhi.DesignPatterns.Command.FoodDeliveryService;
import dev.nidhi.DesignPatterns.Command.Notify.EmailNotification;
import dev.nidhi.DesignPatterns.Command.Notify.Notification;

public class SendEmailCommand implements Command{
    FoodDeliveryService foodDeliveryService;
    Notification notification = new EmailNotification();

    public SendEmailCommand(FoodDeliveryService foodDeliveryService){
        this.foodDeliveryService = foodDeliveryService;
    }
    public void execute(){
        foodDeliveryService.setNotification(notification);
        foodDeliveryService.sendEmail();
    }
}
