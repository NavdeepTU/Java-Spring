package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        // will print Honda bcoz of PostConstruct
        System.out.println("Component Vehicle name from Spring Context is: " + veh.getName());
        veh.printHello();
        context.close(); // will call the methods of all the beans that have @Predestroy Annotation
    }
}
