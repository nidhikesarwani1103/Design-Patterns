package dev.nidhi.SOLID.DIP.DIPSolved;

public class TwilioService implements NotificationSender {

    public void send(User user) {

        System.out.println("Sending Twilio SMS to " + user.getName());
    }
}
