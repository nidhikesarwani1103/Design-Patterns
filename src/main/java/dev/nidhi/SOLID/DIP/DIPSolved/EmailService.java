package dev.nidhi.SOLID.DIP.DIPSolved;


public class EmailService implements NotificationSender {

    public void send(User user) {
     System.out.println("Sending email to " + user.getName());
    }
}
