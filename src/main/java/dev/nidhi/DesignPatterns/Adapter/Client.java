package dev.nidhi.DesignPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
       RayzorPaymentAdapter rayzorPaymentAdapter =
               new RayzorPaymentAdapter(new RayzorPaymentSDK());
       OrderService orderService = new OrderService(rayzorPaymentAdapter);
       orderService.placeOrder();

       OrderService orderService1 = new OrderService(new StripePaymentGateway());
       orderService1.placeOrder();

    }
}
