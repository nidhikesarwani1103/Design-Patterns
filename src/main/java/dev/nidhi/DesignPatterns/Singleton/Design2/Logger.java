package dev.nidhi.DesignPatterns.Singleton.Design2;

public class Logger {
    private static Logger instance = new Logger();

    private Logger(){

    }

    public static Logger getInstance(){
        return instance;
    }
}
