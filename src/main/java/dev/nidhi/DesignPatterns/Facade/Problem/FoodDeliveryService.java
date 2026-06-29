package dev.nidhi.DesignPatterns.Facade.Problem;


/*
    FoodDeliveryService is doing everything
 */
class FoodDeliveryService {

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
