package dev.nidhi.SOLID.LSP.LSPSolved;

public class SMSService implements NotificationSender {
    @Override
    public void send(User user) {
        System.out.println("Sent SMS to " + user.getName());
    }

}
