package dev.nidhi.SOLID.LSP.DesignWIthLSP;

public class SMSService implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sent SMS");
    }

}
