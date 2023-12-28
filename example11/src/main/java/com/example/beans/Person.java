package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "Lucy";

    /* The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */

    //  @Autowired(required = false)
    private Vehicle vehicle;

    public Person(Vehicle vehicle) {    // since the Person class has only one constructor, @Autowire annotation is optional
        System.out.println("Person bean created by Spring");
        this.vehicle = vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    //  @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
