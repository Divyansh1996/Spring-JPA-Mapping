package com.example.Spring_JPA_Mapping.repository;

import com.example.Spring_JPA_Mapping.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
