package com.example.database.services;

import com.example.database.repositories.PersonRepository;
import com.example.database.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Person getPerson(long id) {
        //and do something else
        return repository.getPerson(id);
    }
}
