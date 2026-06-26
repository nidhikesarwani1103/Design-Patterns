package dev.nidhi.OOPS.Abstract;

public class Developer extends Employee {
    public Developer(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(name + " developer is working!");
    }
}
