package dev.nidhi.DesignPatterns.Command.Notify;

public class SMSNotification implements Notification {

    public void send(){
        System.out.println("Email sent!");
    }
}
