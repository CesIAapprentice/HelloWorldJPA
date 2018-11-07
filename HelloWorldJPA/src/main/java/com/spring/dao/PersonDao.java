package com.spring.dao;

import java.util.List;

import com.spring.entity.Person;

public interface PersonDao {
	   void add(Person person);
	   List<Person> listPersons();
	}
