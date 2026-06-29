package dev.nidhi.DesignPatterns.Facade.Solution;

/*
 Everything moved to facade and code here is clean
 */
class FoodDeliveryService {
    FoodDeliveryFacade foodDeliveryFacade = new FoodDeliveryFacade();
    public void placeOrder() {
      foodDeliveryFacade.placeOrder();
    }
}
