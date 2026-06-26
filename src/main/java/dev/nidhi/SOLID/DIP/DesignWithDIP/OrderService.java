package dev.nidhi.SOLID.DIP.DesignWithDIP;

/*
  NotificationManager depends on:

    EmailNotificationService
    SmsNotificationService
    WhatsappNotificationService

    If the SMS gets replaced later, this is tight coupling and we will have to
     change the NotificationManager class as well.

     DIP:
     High-level modules should not depend on low-level modules. Both should depend
     on abstractions.

     Depend on interfaces, not implementations.

      So NotificationManager should depend on an abstraction (interface) of
      Notification Services and not the concrete implementations.
      This Interface is NotificationSender

 */
class OrderService {

    // It could be a list if we wanted to send multiple kind of notifications
    private NotificationManager notificationManager;

    public OrderService(NotificationManager notificationManager) {
        this.notificationManager = notificationManager;
    }

    // SRP satisfied as the decision of which notification to
    // send is done in NotificationManager and not here
    public void placeOrder(User user) {
        notificationManager.notify(user);
    }
}
