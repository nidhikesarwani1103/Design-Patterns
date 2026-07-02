package dev.nidhi.DesignPatterns.Bridge;

public class SMSNotification implements Notification{
    Priority priority;
    public SMSNotification(Priority priority) {
        this.priority = priority;
    }
    public void send(String message) {
        System.out.println("Sending " + priority.getPriorityLevel()
                + " SMS Notification with message: " + message);
    }
 }
