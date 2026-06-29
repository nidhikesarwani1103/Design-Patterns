package dev.nidhi.DesignPatterns.Observer.SecondIteration.Services;

import dev.nidhi.DesignPatterns.Observer.SecondIteration.OrderObserver;

public class RecommendationService implements OrderObserver {

    public void update(){

        System.out.println("Recommendation updated!");
    }
}
