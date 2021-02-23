package edu.aast.oop.cinema;

import java.security.PublicKey;

public class Person {

    private String name;


    public Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showPersonInfo() {
        System.out.println(this.name);
    }
}




