package dev.nidhi.SOLID.ISP.DesignWithISP;

import dev.nidhi.SOLID.LSP.LSPSolved.NotificationSender;
import dev.nidhi.SOLID.LSP.LSPSolved.User;

public class EmailService implements NotificationSender {
    public void send(User user) {}

    public void schedule(User user) {}

    public void cancel(String notificationId) {}

    public String trackStatus(String notificationId) {
        return "Delivered";
    }
}
