package dev.nidhi.SOLID.OCP.OCPSolved;

public class EmailService implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sent email");
    }

}
