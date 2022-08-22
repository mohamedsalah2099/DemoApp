package com.example.test.model;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Setter
@Getter
public class Motable {
    @Id
    private int id;
    private String name;
    private String city;

}
