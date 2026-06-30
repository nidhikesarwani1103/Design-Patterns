package dev.nidhi.DesignPatterns.Decorator;

public class InsuranceDecorator extends OrderDecorator{

    public InsuranceDecorator(Order order){
        super(order);
    }

    public int getCost(){
        return order.getCost() + 30;
    }

    public String getDescription() {
        return order.getDescription() + ", Insurance";
    }

}
