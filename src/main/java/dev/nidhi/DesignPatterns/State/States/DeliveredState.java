package dev.nidhi.DesignPatterns.State.States;

import dev.nidhi.DesignPatterns.State.Order;

public class DeliveredState implements OrderState{

    @Override
    public void pay(Order order) {
        throw new IllegalStateException("Order already delivered");
    }

    @Override
    public void deliver(Order order) {
        throw new IllegalStateException("Order already delivered");
    }

    @Override
    public void cancel(Order order) {
        throw new IllegalStateException(
                "Delivered order cannot be cancelled");
    }
}
