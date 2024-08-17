package com.example.Spring_JPA_Mapping.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Laptop {

    @Id
    private int id;
    private String name;
}
