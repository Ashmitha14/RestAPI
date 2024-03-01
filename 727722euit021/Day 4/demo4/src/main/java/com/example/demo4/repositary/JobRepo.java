package com.example.demo4.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo4.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job,Long>{
    
}
// package com.example.springapp.repository;

// import org.springframework.data.jpa.repository.JpaRepository;

// import com.example.springapp.model.Job;

// public interface JobRepo extends JpaRepository<Job,Integer>
// {

//     Job findById = null;
    
// }