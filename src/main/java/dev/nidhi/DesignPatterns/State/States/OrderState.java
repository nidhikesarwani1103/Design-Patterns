package dev.nidhi.DesignPatterns.State.States;

import dev.nidhi.DesignPatterns.State.Order;

public interface OrderState {
    void pay(Order order);
    void deliver(Order order);
    void cancel(Order order);
}
