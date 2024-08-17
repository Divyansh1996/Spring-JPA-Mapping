package com.example.Spring_JPA_Mapping.controller;

import com.example.Spring_JPA_Mapping.model.Category;
import com.example.Spring_JPA_Mapping.model.Product;
import com.example.Spring_JPA_Mapping.repository.CategoryRepository;
import com.example.Spring_JPA_Mapping.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ManytoManyController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @PostMapping("/api/v1/category")
    public String addCategory() {
        Category category1 = new Category();
        category1.setName("Electronics");
        category1.setId(1);

        Category category2 = new Category();
        category2.setName("Mobile Phone");
        category2.setId(2);

        Product product1 = new Product();
        product1.setName("IPhone 8");
        product1.setId(100);

        Product product2 = new Product();
        product2.setName("Samsung Galaxy");
        product2.setId(101);

        Product product3 = new Product();
        product3.setName("Samsung TV");
        product3.setId(102);


        List<Product> electronicsProducts = new ArrayList<>();
        electronicsProducts.add(product1);
        electronicsProducts.add(product2);
        electronicsProducts.add(product3);

        List<Product> mobileproducts = new ArrayList<>();
        mobileproducts.add(product1);
        mobileproducts.add(product2);

        category1.setProducts(electronicsProducts);
        category2.setProducts(mobileproducts);

        categoryRepository.save(category1);
        categoryRepository.save(category2);
        return "Success";
    }

    @GetMapping("/api/v1/categories/{id}")
    public String getAllCategories(@PathVariable int id) {
        Category category = categoryRepository.findById(id).get();
        return category.getProducts().get(0).getName()+" "+category.getProducts().get(1).getName();
    }

    @GetMapping("/api/v1/products/{id}")
    public String getAllProducts(@PathVariable int id) {
        Product product = productRepository.findById(id).get();
        return product.getCategories().get(0).getName();
    }


}
