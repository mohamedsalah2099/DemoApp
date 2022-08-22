package com.example.test.controller;

import com.example.test.model.Motable;
import com.example.test.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(value = "/get/{id}")
    public ResponseEntity<Motable> getUser(@PathVariable("id") int id){
        return ResponseEntity.ok(personService.getMotable(id));
    }

    @GetMapping(value = "/get")
    public ResponseEntity<Object[]> getUser(){
        return ResponseEntity.ok(personService.listAllMotables());
    }

}
