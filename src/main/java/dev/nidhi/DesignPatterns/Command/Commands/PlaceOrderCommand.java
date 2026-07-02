package dev.nidhi.DesignPatterns.Command.Commands;

import dev.nidhi.DesignPatterns.Command.FoodDeliveryService;

public class PlaceOrderCommand implements Command{
    FoodDeliveryService foodDeliveryService;

    public PlaceOrderCommand(FoodDeliveryService foodDeliveryService){
        this.foodDeliveryService = foodDeliveryService;
    }
    public void execute(){
        foodDeliveryService.placeOrder();
    }
}
