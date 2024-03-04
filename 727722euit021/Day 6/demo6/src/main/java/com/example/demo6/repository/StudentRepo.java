package com.example.demo6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo6.model.Student;


@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {
    
}
