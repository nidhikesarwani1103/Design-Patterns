package dev.nidhi.OOPS.Abstract;

public class HR extends Employee {
    public HR(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(name + " HR is working!");
    }
}
