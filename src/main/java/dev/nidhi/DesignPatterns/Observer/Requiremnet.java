package dev.nidhi.DesignPatterns.Observer;

public class Requiremnet {

}
/*

    Requirement is that when an order is placed, multiple things should happen:

    Send notification
    Update inventory
    Generate invoice
    Award loyalty points
    Update analytics
    Send data to recommendation engine

        placeOrder() {

        saveOrder();

        notificationService.send();

        inventoryService.update();

        invoiceService.generate();

        loyaltyService.addPoints();

        analyticsService.track();

        recommendationService.update();
    }

    What's wrong?

       1. OrderService knows about every service. Depends on concrete implementation,
           SRP and DIP violation
       2. Every new requirement means modifying OrderService.
       3. It violates SRP, OCP, and DIP.
*/
