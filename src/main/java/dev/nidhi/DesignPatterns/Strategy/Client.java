package dev.nidhi.DesignPatterns.Strategy;


public class Client {
    public static void main(String[] args){
        PaymentService ps = new PaymentService(new UPIPayment());
        ps.makePayment(100.1);

        ps.setPaymentStrategy(new CardPayment());
        ps.makePayment(567.13);

        ps.setPaymentStrategy(new CashPayment());
        ps.makePayment(345.167);

    }
}
