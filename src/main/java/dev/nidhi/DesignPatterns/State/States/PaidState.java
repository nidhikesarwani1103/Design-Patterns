package dev.nidhi.DesignPatterns.State.States;

import dev.nidhi.DesignPatterns.State.Order;

public class PaidState implements OrderState{

    @Override
    public void pay(Order order) {
        throw new IllegalStateException("Oredr already paid!");
    }

    @Override
    public void deliver(Order order) {
        System.out.println("Order Delivered!");
        order.setState(new DeliveredState());
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order Cancelled and Refund initiated!");
    }
}
