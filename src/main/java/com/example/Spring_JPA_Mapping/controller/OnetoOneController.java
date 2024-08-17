//package com.example.Spring_JPA_Mapping.controller;
//
//import com.example.Spring_JPA_Mapping.model.Laptop;
//import com.example.Spring_JPA_Mapping.model.Student;
//import com.example.Spring_JPA_Mapping.repository.LaptopRepository;
//import com.example.Spring_JPA_Mapping.repository.StudentRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class OnetoOneController {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    @Autowired
//    private LaptopRepository laptopRepository;
//
//    @PostMapping("/api/v1/student")
//    public String saveStudent() {
//        Student s1=new Student();
//        s1.setId(12);
//        s1.setAge(23);
//        s1.setName("Student1");
//
//        Student s2=new Student();
//        s2.setId(13);
//        s2.setAge(56);
//        s2.setName("Student2");
//
//        Laptop l1=new Laptop();
//        l1.setId(1);
//        l1.setName("Laptop1");
//
//
//        Laptop l2=new Laptop();
//        l2.setId(2);
//        l2.setName("Laptop2");
//
////        s1.setLaptop(l1);
////        s2.setLaptop(l2);
//
//        l1.setStudent(s1);
//        l2.setStudent(s2);
//
//
////        studentRepository.save(s1);
////        studentRepository.save(s2);
//
//        laptopRepository.save(l1);
//        laptopRepository.save(l2);
//
//        return "Student saved successfully";
//    }
//
//    @GetMapping("/api/v1/student/{id}")
//    public String getStudent(@PathVariable("id") int id) {
//        Student student = studentRepository.findById(id).get();
//        return student.getLaptop().getName();
//    }
//
//    @GetMapping("/api/v1/laptop/{id}")
//    public String getLaptop(@PathVariable("id") int id) {
//        Laptop laptop = laptopRepository.findById(id).get();
//        return laptop.getStudent().getName();
//    }
//
//
//}
