package com.example.Spring_JPA_Mapping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Address {

    @Id
    private int id;
    private String street;
    private String city;

    @ManyToOne
    private Student student;
}
