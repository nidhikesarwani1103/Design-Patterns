package dev.nidhi.DesignPatterns.Command.Notify;

public class EmailNotification implements Notification {

    public void send(){
        System.out.println("Email sent!");
    }
}
