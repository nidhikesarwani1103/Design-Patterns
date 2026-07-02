package dev.nidhi.DesignPatterns.Command;

import dev.nidhi.DesignPatterns.Command.Commands.CancelOrderCommand;
import dev.nidhi.DesignPatterns.Command.Commands.Command;
import dev.nidhi.DesignPatterns.Command.Commands.PlaceOrderCommand;
import dev.nidhi.DesignPatterns.Command.Commands.SendEmailCommand;

public class Client {
    public static void main(String[] args) {
        FoodDeliveryService foodDeliveryService = new FoodDeliveryService();
        Command placeOrderCommand = new PlaceOrderCommand(foodDeliveryService);
        Command cancelOrderCommand = new CancelOrderCommand(foodDeliveryService);
        Command sendEmailCommand = new SendEmailCommand(foodDeliveryService);
        Button placeOrderButton = new Button(placeOrderCommand);
        Button cancelOrderButton = new Button(cancelOrderCommand);
        Button sendEmailButton = new Button(sendEmailCommand);

        placeOrderButton.click();
        cancelOrderButton.click();
        sendEmailButton.click();
    }
}
