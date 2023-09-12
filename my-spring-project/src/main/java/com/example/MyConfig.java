package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MyConfig {
    @Bean
    public Person person1() {
        return new Person("Alice");
    }

    @Bean
    public Person person2() {
        return new Person("Bob");
    }

    @Bean
    public PeopleService peopleService(List<Person> people) {
        return new PeopleServiceImp(people);
    }
}
