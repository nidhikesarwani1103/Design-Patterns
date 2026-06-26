package dev.nidhi.SOLID.ISP.DesignWithISP;

interface NotificationService {

    void send(User user);

    void schedule(User user);

    void cancel(String notificationId);

    String trackStatus(String notificationId);

    void resend(String notificationId);
}
