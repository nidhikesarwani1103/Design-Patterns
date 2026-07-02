package dev.nidhi.DesignPatterns.State;

public class Client {
    public static void main(String[] args) {
        Order order = new Order();
        order.pay();
        order.deliver();
//        order.cancel(); // Throws exception
    }
}
