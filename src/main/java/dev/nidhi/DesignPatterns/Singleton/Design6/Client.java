package dev.nidhi.DesignPatterns.Singleton.Design6;

public class Client {
    public static void main(String[] args){
        Logger logger1 = Logger.INSTANCE;
        Logger logger2 = Logger.INSTANCE;

        if(logger1==logger2){
            System.out.println("Both logger instances are same");
        }
        logger1.log("This is a log message");
    }
}
