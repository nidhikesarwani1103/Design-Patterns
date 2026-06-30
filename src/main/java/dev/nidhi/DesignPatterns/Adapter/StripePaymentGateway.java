package dev.nidhi.DesignPatterns.Adapter;

public class StripePaymentGateway implements PaymentGateway{

    public void pay(int amount) {
        System.out.println("Paid ₹" + amount + " using Stripe");
    }
}
