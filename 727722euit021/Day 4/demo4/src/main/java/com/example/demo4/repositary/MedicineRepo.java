package com.example.demo4.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo4.model.Medicine;

@Repository
public interface MedicineRepo extends JpaRepository<Medicine,Long>{
    
}
