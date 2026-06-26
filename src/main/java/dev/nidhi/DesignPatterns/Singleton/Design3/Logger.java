package dev.nidhi.DesignPatterns.Singleton.Design3;

public class Logger {
    private static Logger instance;

    private Logger(){

    }

    // not thread safe, if multiple threads call getInstance()
    // at the same time, multiple instances will be created
    public static Logger getInstance(){
        if(instance==null){
            instance = new Logger();
        }
        return instance;
    }
}
