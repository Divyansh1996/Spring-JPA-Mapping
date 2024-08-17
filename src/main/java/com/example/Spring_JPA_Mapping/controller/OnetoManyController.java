package com.example.Spring_JPA_Mapping.controller;

import com.example.Spring_JPA_Mapping.model.Address;
import com.example.Spring_JPA_Mapping.model.Student;
import com.example.Spring_JPA_Mapping.repository.AddressRepository;
import com.example.Spring_JPA_Mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class OnetoManyController {


    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AddressRepository addressRepository;

    @PostMapping("/api/v1/newstudent")
    public String newStudent() {
        Student s1 = new Student();
        s1.setName("John");
        s1.setId(1);
        s1.setAge(23);

        Student s2 = new Student();
        s2.setName("Michael");
        s2.setId(2);
        s2.setAge(43);

        Address a1 = new Address();
        a1.setId(1);
        a1.setStreet("123 Main Street");
        a1.setCity("San Francisco");

        Address a2 = new Address();
        a2.setId(2);
        a2.setStreet("Michael Street");
        a2.setCity("New York");

        Address a3 = new Address();
        a3.setId(3);
        a3.setStreet("Ko street");
        a3.setCity("Lans");

        Address a4 = new Address();
        a4.setId(4);
        a4.setStreet("Lo street");
        a4.setCity("Las vegas");

        List<Address> address1 = new ArrayList<>();
        address1.add(a1);
        address1.add(a4);

        List<Address> address2 = new ArrayList<>();
        address2.add(a2);
        address2.add(a3);

        address1.get(0).setStudent(s1);
        address1.get(1).setStudent(s1);

        address2.get(0).setStudent(s2);
        address2.get(1).setStudent(s2);

        s1.setAddressList(address1);
        s2.setAddressList(address2);




        studentRepository.save(s1);
        studentRepository.save(s2);
        return "success";
    }

    @GetMapping("/api/v1/student/{id}")
    public String getAddress(@PathVariable("id") int id) {
        Student student = studentRepository.findById(id).get();
        String result = student.getAddressList().get(0).getStreet() +" "+ student.getAddressList().get(1).getStreet();
        return result;
    }

    @GetMapping("/api/v1/address/{id}")
    public String getStudent(@PathVariable("id") int id) {
        Address address = addressRepository.findById(id).get();
        return address.getStudent().getName();
    }
}
