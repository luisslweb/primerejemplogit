package com.myjsfexample1.view.controller;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class IndexController implements Serializable {
    private String firstName = "John";
    private String lastName = "Doe";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @PostConstruct
    void init() { //Varibles variables que inicializa la anotacion @PostConstruct no ses el contructor
        this.firstName = "Juan...123";
        this.lastName = "Perez...1234";
    }

    public String showGreeting() {
        System.out.println("Hello World!");

        return "Hello " + firstName + " " + lastName + "!";
    }
}
