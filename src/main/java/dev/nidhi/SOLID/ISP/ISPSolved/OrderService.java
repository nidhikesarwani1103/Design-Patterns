package dev.nidhi.SOLID.ISP.ISPSolved;

/*
  All the notification services now implement only necessary interfaces
  and OrderService is not dependent on any unnecessary methods.

    SRP:
    Split responsibilities into different classes.

    OCP:
    Create abstractions.

    LSP:
    Ensure implementations honor the abstraction.

    ISP:
    Keep abstractions small and focused so implementations
    don't get forced into behavior they don't support.
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
