package dev.nidhi.SOLID.ISP.DesignWithISP;

import dev.nidhi.SOLID.LSP.LSPSolved.NotificationSender;
import dev.nidhi.SOLID.LSP.LSPSolved.User;

public class WhatsAppService implements NotificationSender {

    public void send(User user) {}

    public void schedule(User user) {
        throw new UnsupportedOperationException();
    }

    public void cancel(String notificationId) {
        throw new UnsupportedOperationException();
    }

    public String trackStatus(String notificationId) {
        return "Delivered";
    }

    public void resend(String notificationId) {}
}
