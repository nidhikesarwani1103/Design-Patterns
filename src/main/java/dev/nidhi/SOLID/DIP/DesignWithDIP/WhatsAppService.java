package dev.nidhi.SOLID.DIP.DesignWithDIP;

public class WhatsAppService implements NotificationSender{

    public void send(User user) {
     System.out.println("Sending WhatsApp notification to " + user.getName());
    }

}
