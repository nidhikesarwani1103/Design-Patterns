package dev.nidhi.DesignPatterns.Singleton.Design4;

public class Logger {
    private static Logger instance;

    private Logger(){

    }

    //Synchronized method to make it thread safe, but it will reduce performance
    // as the whole block is synchronized, even if the instance is already created
    public static synchronized Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
}
