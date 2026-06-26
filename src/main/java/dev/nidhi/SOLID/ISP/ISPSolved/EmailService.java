package dev.nidhi.SOLID.ISP.ISPSolved;


public class EmailService implements NotificationSender,
        SchedulableNotification,
        CancellableNotification,
        TrackableNotification {

    public void send(User user) {

    }
    public void cancel(User user) {

    }
    public void schedule(User user) {

    }
    public void track(User user) {

    }
}
