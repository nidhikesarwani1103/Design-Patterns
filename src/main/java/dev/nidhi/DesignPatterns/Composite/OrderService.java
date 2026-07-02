package dev.nidhi.DesignPatterns.Composite;

public class OrderService {
    MenuItem menuItem;
    public OrderService(MenuItem item){
        this.menuItem = item;
    }

    public void placeOrder(){
        System.out.println("The total bill is: "+menuItem.getPrice());
    }
}
