package dev.nidhi.DesignPatterns.Singleton.Design6;

public enum Logger{
    INSTANCE("Logger_Original", 1);

    private String id;
    private int age;

    Logger(String id, int age){
        this.id = id;
        this.age = age;
    }

    public void log(String message){
        System.out.println("Log message: " + message);
    }

}
