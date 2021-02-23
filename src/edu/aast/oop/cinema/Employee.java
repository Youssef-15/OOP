package edu.aast.oop.cinema;

public class Employee extends Person {

    private int id;

    public Employee(String name, int id) {
        super(name);
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void showPersonInfo() {
        System.out.println(this.getId() + ": " + this.getName());
    }
}
