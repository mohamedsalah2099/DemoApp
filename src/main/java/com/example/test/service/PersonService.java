package com.example.test.service;



import com.example.test.model.Motable;
import com.example.test.repo.PersonRepo;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    private final PersonRepo personRep;

    public PersonService(PersonRepo personRep) {
        this.personRep = personRep;
    }

    public Object[] listAllMotables() {
        return personRep.findAll().toArray();
    }

    public Motable getMotable(int id) {
        return personRep.findAll().get(id);
    }
}
