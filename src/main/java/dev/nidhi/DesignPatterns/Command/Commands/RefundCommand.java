package dev.nidhi.DesignPatterns.Command.Commands;

import dev.nidhi.DesignPatterns.Command.FoodDeliveryService;

public class RefundCommand implements Command{
    FoodDeliveryService foodDeliveryService;

    public RefundCommand(FoodDeliveryService foodDeliveryService){
        this.foodDeliveryService = foodDeliveryService;
    }
    public void execute(){
        foodDeliveryService.refund();
    }
}
