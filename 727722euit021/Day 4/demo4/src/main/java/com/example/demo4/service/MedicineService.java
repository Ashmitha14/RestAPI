package com.example.demo4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo4.model.Medicine;
import com.example.demo4.repositary.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    MedicineRepo medicineRepo;

    public Medicine addMedicine(Medicine medicine)
    {
        return medicineRepo.save(medicine);
    }
    public List<Medicine> getMedicines()
    {
        return medicineRepo.findAll();
    }
    public Optional<Medicine> getMedicineById(Long id)
    {
     return medicineRepo.findById(id);
    }
}