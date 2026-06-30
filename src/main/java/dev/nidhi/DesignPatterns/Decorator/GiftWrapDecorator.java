package dev.nidhi.DesignPatterns.Decorator;

public class GiftWrapDecorator extends OrderDecorator{

    public GiftWrapDecorator(Order order){
        super(order);
    }

    public int getCost(){
        return order.getCost() + 50;
    }

    public String getDescription() {
        return order.getDescription() + ", Gift Wrap";
    }

}
