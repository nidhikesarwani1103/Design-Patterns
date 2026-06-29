package dev.nidhi.DesignPatterns.Facade.Solution;

/*
Violates SRP and OCP but it is accepted for this pattern
 */
class FoodDeliveryFacade {

    private InventoryService inventoryService =
            new InventoryService();

    private PaymentService paymentService =
            new PaymentService();

    private RestaurantService restaurantService =
            new RestaurantService();

    private DeliveryService deliveryService =
            new DeliveryService();

    private NotificationService notificationService =
            new NotificationService();

    public void placeOrder() {

        inventoryService.checkStock();

        paymentService.makePayment();

        restaurantService.prepareFood();

        deliveryService.assignPartner();

        notificationService.sendConfirmation();
    }
}
