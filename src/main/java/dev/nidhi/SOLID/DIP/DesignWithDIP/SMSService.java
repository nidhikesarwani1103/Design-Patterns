package dev.nidhi.SOLID.DIP.DesignWithDIP;


public class SMSService implements NotificationSender{

    public void send(User user) {
        System.out.println("Sending SMS to " + user.getName());
    }
}
