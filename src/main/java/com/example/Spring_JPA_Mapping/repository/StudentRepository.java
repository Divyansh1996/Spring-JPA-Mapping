package com.example.Spring_JPA_Mapping.repository;

import com.example.Spring_JPA_Mapping.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
