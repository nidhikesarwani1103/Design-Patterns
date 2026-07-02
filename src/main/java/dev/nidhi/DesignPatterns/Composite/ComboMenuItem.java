package dev.nidhi.DesignPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class ComboMenuItem implements MenuItem{

    List<MenuItem> list = new ArrayList<>();

    void add(MenuItem item){
        list.add(item);
    }

    public int getPrice(){
        int price=0;
        for(MenuItem menuItem : list){
            price+=menuItem.getPrice();
        }

        return price;
    }
}
