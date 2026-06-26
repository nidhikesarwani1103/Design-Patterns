package dev.nidhi.OOPS;

public abstract class Animal {
    // Abstraction
    // Abstract class can have both abstract and non-abstract methods
    String species;
    public Animal(String species) {
        this.species = species;
    }

    public abstract void makeSound();

    public void sleep() {
        System.out.println("Animal is sleeping.");
    }
}
