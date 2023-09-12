package com.example;

import java.util.List;
import java.util.ArrayList;

public class PeopleServiceImp implements PeopleService {
    private List<Person> people;

    public PeopleServiceImp(List<Person> people) {
        this.people = people;
    }

    @Override
    public List<Person> getAllPeople() {
        return people;
    }
}
