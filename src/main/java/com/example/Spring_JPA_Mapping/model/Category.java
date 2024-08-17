package com.example.Spring_JPA_Mapping.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Category {

    @Id
    private int id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();
}
