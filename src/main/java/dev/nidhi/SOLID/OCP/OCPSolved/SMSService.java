package dev.nidhi.SOLID.OCP.OCPSolved;

public class SMSService implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sent SMS");
    }

}
