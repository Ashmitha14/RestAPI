package com.example.demo5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo5.model.Product;


public interface ProductRepo extends JpaRepository<Product,Integer>{
    
}