package dev.nidhi.DesignPatterns.Adapter;

public class OrderService {
    PaymentGateway paymentGateway;

    public OrderService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public void placeOrder(){
        System.out.println("Order Placed");
        paymentGateway.pay(500);
        System.out.println("Confirmation sent");
    }
}
