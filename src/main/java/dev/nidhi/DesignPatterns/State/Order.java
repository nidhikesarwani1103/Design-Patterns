package dev.nidhi.DesignPatterns.State;

import dev.nidhi.DesignPatterns.State.States.CreatedState;
import dev.nidhi.DesignPatterns.State.States.OrderState;

// Order is passed in the states as we need an object to change the state
public class Order {
    private OrderState state;

    public Order(){
        this.state = new CreatedState();
    }

    public void pay(){
        state.pay(this);
    }

    public void deliver(){
        state.deliver(this);
    }

    public void cancel(){
        state.cancel(this);
    }

    public void setState(OrderState state){
        this.state = state;
    }

}
