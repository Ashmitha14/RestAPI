package com.example.demo4.repositary;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo4.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}