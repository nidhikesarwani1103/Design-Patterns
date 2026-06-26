package dev.nidhi.SOLID.LSP.LSPSolved;

public class WhatsAppService implements NotificationSender {
    @Override
    public void send(User user) {
        System.out.println("Sent whatsApp message to " + user.getName());
    }

}
