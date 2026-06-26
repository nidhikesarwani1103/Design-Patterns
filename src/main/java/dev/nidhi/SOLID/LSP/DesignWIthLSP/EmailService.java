package dev.nidhi.SOLID.LSP.DesignWIthLSP;

public class EmailService implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sent email");
    }

}
