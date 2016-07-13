package com.example.olga.cs639firebase;


public class Person {

    private String firstname;
    private String id;

    public Person(){}

    public String getName() {
        return firstname;
    }

    public void setName(String firstname) {
        this.firstname = firstname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
