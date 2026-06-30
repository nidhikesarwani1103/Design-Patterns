package dev.nidhi.DesignPatterns.Decorator;

public class ExpressDecorator extends OrderDecorator{

    public ExpressDecorator(Order order){
        super(order);
    }

    public int getCost(){
        return order.getCost() + 100;
    }

    public String getDescription() {
        return order.getDescription() + ", Express Delivery";
    }

}
