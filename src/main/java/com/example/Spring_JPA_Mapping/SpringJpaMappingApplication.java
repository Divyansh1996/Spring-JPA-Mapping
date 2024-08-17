package com.example.Spring_JPA_Mapping;

import com.example.Spring_JPA_Mapping.model.Laptop;
import com.example.Spring_JPA_Mapping.model.Student;
import com.example.Spring_JPA_Mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaMappingApplication.class, args);
	}

}
