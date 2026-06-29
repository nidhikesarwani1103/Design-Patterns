package dev.nidhi.DesignPatterns.Observer.SecondIteration;

public class OrderService {

    OrderPublisher orderPublisher;

    public OrderService(OrderPublisher orderPublisher){
        this.orderPublisher = orderPublisher;
    }

    void placeOrder(){
        System.out.println("Order placed");
        orderPublisher.notifyObservers();
    }
}
