package dev.nidhi.SOLID.DIP.DIPSolved;

public class User {
    private String type;
    private String name;
    public User(String type, String name) {
        this.type = type;
        this.name = name;
    }
    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
