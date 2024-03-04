package com.example.demo6.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo6.model.Product;
import com.example.demo6.repository.ProductRepo;

import java.util.*;

@Service
public class ProductService {
    @Autowired
    private ProductRepo rep;

    public boolean post(Product children)
    {
        try
        {
            rep.save(children);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }


    public Product get1(int a)
    {
        return rep.findById(a).orElse(null);
    }
    public List<Product> get2(int a,int b)
    {
        return rep.findAll(PageRequest.of(a, b)).getContent();
    }


    public List<Product> get3(int a,int b,String c)
    {
        return rep.findAll(PageRequest.of(a, b,Sort.by(Sort.Direction.ASC,c))).getContent();
    }

    
}