package dev.nidhi.DesignPatterns.Adapter;

public class Client {
    public static void main(String[] args) {
       PaymentGateway paymentGateway1 = new RayzorPaymentAdapter(new RayzorPaymentSDK());
       OrderService orderService = new OrderService(paymentGateway1);
       orderService.placeOrder();

       PaymentGateway paymentGateway2 = new StripePaymentGateway();
       OrderService orderService1 = new OrderService(paymentGateway2);
       orderService1.placeOrder();

    }
}
