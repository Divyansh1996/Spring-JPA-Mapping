package com.example.Spring_JPA_Mapping.model;

import com.example.Spring_JPA_Mapping.model.Address;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Student {

    @Id
    private int id;
    private String name;
    private int age;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    List<Address> addressList = new ArrayList<>();
}
