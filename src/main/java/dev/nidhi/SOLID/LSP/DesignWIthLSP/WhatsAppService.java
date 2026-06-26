package dev.nidhi.SOLID.LSP.DesignWIthLSP;

public class WhatsAppService implements NotificationSender {
    @Override
    public void send() {
        System.out.println("Sent whatsApp message");
    }

}
