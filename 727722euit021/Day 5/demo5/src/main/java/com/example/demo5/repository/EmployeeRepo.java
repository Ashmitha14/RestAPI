package com.example.demo5.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo5.model.Employee;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer>{
    
}