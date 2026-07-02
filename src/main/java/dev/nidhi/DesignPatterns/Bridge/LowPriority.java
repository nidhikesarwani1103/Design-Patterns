package dev.nidhi.DesignPatterns.Bridge;

public class LowPriority implements Priority{

    public String getPriorityLevel() {
        return "Low Priority";
    }
}
