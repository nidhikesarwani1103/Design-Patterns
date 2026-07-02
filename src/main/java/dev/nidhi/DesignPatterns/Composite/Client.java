package dev.nidhi.DesignPatterns.Composite;

public class Client {
    public static void main(String[] args) {
       BurgerMenuItem burgerMenuItem = new BurgerMenuItem();
       CokeMenuItem cokeMenuItem = new CokeMenuItem();
       PizzaMenuItem pizzaMenuItem = new PizzaMenuItem();

       ComboMenuItem lunchCombo = new ComboMenuItem();
       lunchCombo.add(burgerMenuItem);
       lunchCombo.add(cokeMenuItem);

       ComboMenuItem festivalCombo = new ComboMenuItem();
       festivalCombo.add(lunchCombo);
       festivalCombo.add(pizzaMenuItem);

       OrderService orderService = new OrderService(festivalCombo);
        System.out.println("Placing order for festival combo");
        orderService.placeOrder();
    }
}
