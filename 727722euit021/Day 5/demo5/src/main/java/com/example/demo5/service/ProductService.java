package com.example.demo5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo5.model.Product;
import com.example.demo5.repository.ProductRepo;


@Service
public class ProductService {
   @Autowired
   ProductRepo obj;
   public Product addProduct(Product product)
   {
    return obj.save(product);
   }
   public Product editProduct(int id,Product product)
   {
    Product p2=obj.findById(id).orElse(null) ;
    if(p2!=null)
    {
        p2.setProductName(product.getProductName());
        p2.setProductDescription(product.getProductDescription());
        return obj.saveAndFlush(p2);
    } 
    else
    return null;

    }
    public boolean deleteProduct(int id) {
        if(obj.existsById(id)) {
           obj.deleteById(id);
           return true;
        } else {
           return false;
        }
     }
  

}