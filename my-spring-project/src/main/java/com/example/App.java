package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        PeopleService peopleService = context.getBean(PeopleService.class);
        List<Person> people = peopleService.getAllPeople();

        for (Person person : people) {
            System.out.println("Received message: Hello from " + person.getName());
        }
    }
}
