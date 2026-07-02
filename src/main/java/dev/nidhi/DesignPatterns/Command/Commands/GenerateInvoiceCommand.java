package dev.nidhi.DesignPatterns.Command.Commands;

import dev.nidhi.DesignPatterns.Command.FoodDeliveryService;

public class GenerateInvoiceCommand implements Command{
    FoodDeliveryService foodDeliveryService;

    public GenerateInvoiceCommand(FoodDeliveryService foodDeliveryService){
        this.foodDeliveryService = foodDeliveryService;
    }
    public void execute(){
        foodDeliveryService.generateInvoice();
    }
}
