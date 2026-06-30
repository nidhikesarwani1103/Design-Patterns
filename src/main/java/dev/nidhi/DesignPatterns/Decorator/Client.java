package dev.nidhi.DesignPatterns.Decorator;

public class Client {
    public static void main(String[] args) {
        Order order = new BasicOrder();
        order = new GiftWrapDecorator(order);
        order = new ExpressDecorator(order);
        order = new InsuranceDecorator(order);

        System.out.println(order.getCost());
        System.out.println(order.getDescription());
    }
}
