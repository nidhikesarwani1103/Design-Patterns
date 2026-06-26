package dev.nidhi.SOLID.LSP.LSPSolved;

public class EmailService implements NotificationSender {
    @Override
    public void send(User user) {
        System.out.println("Sent email to " + user.getName());
    }

}
