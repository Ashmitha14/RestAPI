package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Address;
import com.example.springapp.model.Employee;
import com.example.springapp.repository.AddressRepo;
import com.example.springapp.repository.EmployeeRepo;

@Service
public class AddressService {
    @Autowired
    AddressRepo addressRepo;
    @Autowired
    EmployeeRepo employeeRepo;
    public Address postAddress(int id, Address address) {
        Employee employee = employeeRepo.findById(id).orElse(null);
        if (employee != null) {
            try {
                // Set the address to the employee
                employee.setAddress(address);
    
                // Save the employee (which will save the address)
                employeeRepo.save(employee);
    
                // Return the saved address
                return address;
            } catch (Exception e) {
                // Handle any exceptions (e.g., validation errors)
                System.out.println(e);
                return null;
            }
        } else {
            // If employee is null, return null
            return null;
        }
    }
    
}
