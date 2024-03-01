package com.example.demo4.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo4.model.Product;
import com.example.demo4.service.ProductService;

import java.util.*;
@RestController
public class ProductController {
    @Autowired
    ProductService obj;
    @PostMapping("/api/product/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) 
        {
             return new ResponseEntity<>(obj.addProduct(product),HttpStatus.CREATED);
        }

    @GetMapping("/api/product")
    public List<Product>getProducts()
    {
        return obj.getProduct();
    }
    @GetMapping("/api/product/{productId}")
    public Optional<Product> getId(@PathVariable int productId)
    {
        return obj.getProductByid(productId);
    }
}