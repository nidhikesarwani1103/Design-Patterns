package dev.nidhi.DesignPatterns.Bridge;

public class EmailNotification implements Notification{

    Priority priority;
    public EmailNotification(Priority priority) {
        this.priority = priority;
    }
    public void send(String message) {

        System.out.println("Sending " + priority.getPriorityLevel() +
                " Email Notification with message: " + message);
    }
 }
