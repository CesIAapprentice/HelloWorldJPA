package com.spring.service;

import java.util.List;

import com.spring.entity.Person;

public interface PersonService {
    void add(Person person);
    List<Person> listPersons();
}

