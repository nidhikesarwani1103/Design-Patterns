package dev.nidhi.DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
        User user = new User.Builder()
                .setName("Nidhi")
                .setEmail("nidhi@gmail.com")
                .setAge(30)
                .build();

        System.out.println("User is: "+user.toString());
    }

}
