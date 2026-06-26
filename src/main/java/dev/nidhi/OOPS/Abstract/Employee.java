package dev.nidhi.OOPS.Abstract;

// Can't be instantiated directly, must be subclassed
public abstract class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
    // by default public, must be implemented by subclasses
    abstract void work();
}
