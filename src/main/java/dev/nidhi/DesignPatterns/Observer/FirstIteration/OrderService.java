package dev.nidhi.DesignPatterns.Observer.FirstIteration;

import java.util.ArrayList;
import java.util.List;

/*
SRP is solved to some extent, but the orderService class is still handling three jobs
1. Registering an observer
2. Notifying an Observer
3. Placing an order

The first two tasks should be handled by some other class.
 */
public class OrderService {
    List<OrderObserver> orderObservers = new ArrayList<>();

    public void register(OrderObserver orderObserver){
        orderObservers.add(orderObserver);
    }

    public void notifyObservers(){
        for(OrderObserver ob : orderObservers){
            ob.update();
        }
    }
    void placeOrder(){
        System.out.println("Order placed");
        notifyObservers();
    }
}
