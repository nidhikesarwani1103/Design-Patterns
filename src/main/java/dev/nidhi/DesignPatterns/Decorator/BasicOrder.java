package dev.nidhi.DesignPatterns.Decorator;

public class BasicOrder implements Order{

    public int getCost(){
        return 300;
    }

    public String getDescription(){
        return "Food";
    }
}
