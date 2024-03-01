package com.example.demo10.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo10.model.Customer;
import com.example.demo10.repository.CustomerRepo;

import java.util.List;
import java.util.Optional;


@Service
public class CustomerService {
    @Autowired
    CustomerRepo customerRepo;
    public Customer postData(Customer c)
    {
        return customerRepo.save(c);
    }
    public List<Customer> getByCity(String city)
    {
        return customerRepo.findByCity(city);
    }
    public List<Customer> getData()
    {
        return customerRepo.findAll();
    }
    public Optional<Customer> getById(int id){
        return customerRepo.findById(id);
    }
    public Customer updateData(int id,int pincode)
    {
        Customer exist=customerRepo.findById(id).orElse(null);
        if(exist!=null)
        {
            exist.setPincode(pincode);
            return customerRepo.saveAndFlush(exist);

        }
        else
         return null;
    }
    public String deleteData(int id)
    {
        customerRepo.deleteById(id);
        return ("Customer deleted successfully.");
    }
}