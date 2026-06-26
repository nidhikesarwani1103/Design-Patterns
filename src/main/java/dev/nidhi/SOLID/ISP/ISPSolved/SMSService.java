package dev.nidhi.SOLID.ISP.ISPSolved;


public class SMSService implements NotificationSender,
   SchedulableNotification,
        CancellableNotification,
        ResendableNotification {

    public void send(User user) {

    }
    public void resend(User user) {

    }
    public void schedule(User user) {

    }
    public void cancel(User user) {

    }
}
