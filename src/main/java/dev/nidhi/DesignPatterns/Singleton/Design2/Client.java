package dev.nidhi.DesignPatterns.Singleton.Design2;

public class Client {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();

        // This line will cause a compilation error because the constructor is private
        // Logger logger2 = new Logger();
        Logger logger2 = Logger.getInstance();

        if(logger1==logger2) {
            System.out.println("Both logger1 and logger2 are same");
        }
    }
}
