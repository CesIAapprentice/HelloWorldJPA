package com.spring.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.PersonDao;
import com.spring.entity.Person;

@Service
public class PersonServiceImplement implements PersonService {

   @Autowired
   private PersonDao userDao;

   @Transactional
   public void add(Person person) {
      userDao.add(person);
   }

   @Transactional(readOnly = true)
   public List<Person> listPersons() {
      return userDao.listPersons();
   }

}

