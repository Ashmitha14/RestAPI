package com.example.demo4.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo4.model.Product;
import com.example.demo4.repositary.ProductRepo;
@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public Product addProduct(Product product)
    {
        return productRepo.save(product);
    }
    public List<Product> getProduct()
    {
        return productRepo.findAll();
    }
    public Optional<Product>getProductByid(int Id)
    {
        return productRepo.findById(Id);
    }
   
}