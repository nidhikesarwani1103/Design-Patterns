package dev.nidhi.OOPS;

public class Person extends Animal implements FoodHabits {
    private int age;
    private String name;

    public Person(int age, String name, String species) {
        super(species);
        this.age = age;
        this.name = name;
    }

    // data hiding
    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }

    // Encapsulation, having a check
    void setName(String name) {
        if(name ==null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    String getName() {
        return name;
    }

    // Polymorphism - method overriding
    @Override
    public void eat() {
        System.out.println(name + " is eating.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is speaking");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }
}
