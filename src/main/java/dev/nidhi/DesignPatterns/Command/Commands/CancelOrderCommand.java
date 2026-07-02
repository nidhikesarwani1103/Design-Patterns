package dev.nidhi.DesignPatterns.Command.Commands;

import dev.nidhi.DesignPatterns.Command.FoodDeliveryService;

public class CancelOrderCommand implements Command{
    FoodDeliveryService foodDeliveryService;

    public CancelOrderCommand(FoodDeliveryService foodDeliveryService){
        this.foodDeliveryService = foodDeliveryService;
    }
    public void execute(){
        foodDeliveryService.cancelOrder();
    }
}
