package dev.nidhi.DesignPatterns.Observer.FirstIteration.Services;

import dev.nidhi.DesignPatterns.Observer.FirstIteration.OrderObserver;

public class InvoiceService implements OrderObserver {

    public void update(){
        System.out.println("Invoice generated!");
    }
}
