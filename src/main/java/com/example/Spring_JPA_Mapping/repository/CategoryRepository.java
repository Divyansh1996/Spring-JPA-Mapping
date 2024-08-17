package com.example.Spring_JPA_Mapping.repository;

import com.example.Spring_JPA_Mapping.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
