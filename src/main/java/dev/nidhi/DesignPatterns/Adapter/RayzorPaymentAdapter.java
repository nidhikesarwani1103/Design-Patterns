package dev.nidhi.DesignPatterns.Adapter;

public class RayzorPaymentAdapter implements PaymentGateway{
    private RayzorPaymentSDK rayzorPaymentSDK;

    public RayzorPaymentAdapter(RayzorPaymentSDK rayzorPaymentSDK){
        this.rayzorPaymentSDK = rayzorPaymentSDK;
    }

    public void pay(int amount){
        rayzorPaymentSDK.makePayment((double) amount);
    }
}
