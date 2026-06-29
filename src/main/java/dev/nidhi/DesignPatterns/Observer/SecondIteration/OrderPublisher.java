package dev.nidhi.DesignPatterns.Observer.SecondIteration;

import java.util.ArrayList;
import java.util.List;

public class OrderPublisher {
    List<OrderObserver> orderObservers = new ArrayList<>();

    public void register(OrderObserver orderObserver){
        orderObservers.add(orderObserver);
    }

    public void notifyObservers(){
        for(OrderObserver ob : orderObservers){
            ob.update();
        }
    }
}
