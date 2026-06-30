package dev.nidhi.DesignPatterns.Decorator;

/*
Even without this the code works, every decorator just implements the order interface
and does:
    private Order order;

    public ExpressDecorator(Order order) {
        this.order = order;
    }

    We are just extracting this code and writing it in OrderDecorator class
 */
public abstract class OrderDecorator implements Order{
    protected Order order;

    public OrderDecorator(Order order){
        this.order = order;
    }
}
