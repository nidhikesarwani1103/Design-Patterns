package dev.nidhi.SOLID.OCP.OCPSolved;

public class WhatsAppService implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sent whatsApp message");
    }

}
