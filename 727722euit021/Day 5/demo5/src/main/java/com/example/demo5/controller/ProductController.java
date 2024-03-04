package com.example.demo5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.model.Product;
import com.example.demo5.service.ProductService;


@RestController
public class ProductController {
    @Autowired
    ProductService obj;
    
    @PostMapping("/api/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        return new ResponseEntity<>(obj.addProduct(product), HttpStatus.CREATED);
    }

    @PutMapping("/api/product/{productId}")
    public ResponseEntity<?> editProduct(@PathVariable int productId, @RequestBody Product p) {
        try {

            return ResponseEntity.status(200).body(obj.editProduct(productId, p));
        } catch (Exception e) {
            return ResponseEntity.status(404).build();
        }
    }

    @DeleteMapping("/api/product/{productId}")
    public ResponseEntity<?> editProduct(@PathVariable int productId) {
        try {

            return ResponseEntity.status(200).body(obj.deleteProduct(productId));
        } catch (Exception e) {
            return ResponseEntity.status(404).build();
        }
    }
}