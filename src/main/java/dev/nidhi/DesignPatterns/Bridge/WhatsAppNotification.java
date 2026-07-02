package dev.nidhi.DesignPatterns.Bridge;

public class WhatsAppNotification implements Notification{

    Priority priority;
    public WhatsAppNotification(Priority priority) {        this.priority = priority;
        this.priority = priority;
    }

    public void send(String message) {
        System.out.println("Sending " + priority.getPriorityLevel() +
                " WhatsApp Notification with message: " + message);
    }
 }
