package dev.nidhi.DesignPatterns.State.States;

import dev.nidhi.DesignPatterns.State.Order;

public class CreatedState implements OrderState{

    @Override
    public void pay(Order order) {
        System.out.println("Payment Done!");
        order.setState(new PaidState());
    }

    @Override
    public void deliver(Order order) {
          throw new IllegalStateException("Cannot deliver before payment!");
    }

    @Override
    public void cancel(Order order) {
        System.out.println("Order Cancelled!");
    }
}
