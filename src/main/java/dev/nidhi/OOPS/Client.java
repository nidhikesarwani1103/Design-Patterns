package dev.nidhi.OOPS;

public class Client {
    public static void main(String[] args) {
        Animal a = new Person(2, "Amit", "Human");
        Person p = new Person(45, "Devdas", "Human");

        a.sleep();
        a.makeSound();
        p.sleep();
        p.eat();
        p.makeSound();
    }

}
