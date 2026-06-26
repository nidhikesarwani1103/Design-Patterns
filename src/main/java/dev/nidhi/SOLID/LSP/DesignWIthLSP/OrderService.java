package dev.nidhi.SOLID.LSP.DesignWIthLSP;


/*
  Client has new requirement that only premium users get whatsApp message
  So we change the code of whatsApp to either throw an exception:
       --Application crashes
     Or we do nothing in whatsApp service
       --User doesn't get notified

   In both the cases, user gets surprised, It is not done what is advertised in notification
   service.

   LSP Says
   Parent p = new Child();
   Can I replace Parent with Child everywhere without changing behavior?

   If yes, we satisfy LSP, if we don't, LSP is violated.

   Here, whatsApp is child but it doesn't send notification, so the LSP is violated.

 */
class OrderService {

    // It could be a list if we wanted to send multiple kind of notifications
    private NotificationSender notificationService;

    public OrderService(NotificationSender notificationService) {
        this.notificationService = notificationService;
    }

    public void placeOrder() {
        notificationService.send();
    }
}
