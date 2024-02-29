package com.example.review.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.review.model.Medicine;
import com.example.review.repositary.MedicineRepo;

@Service
public class MedicineService {
    @Autowired
    MedicineRepo medicineRepo;

    public Medicine addMedicine(Medicine medicine) {
        return medicineRepo.save(medicine);
    }

    // public List<Medicine> getMedicines() {
    //     return medicineRepo.findAll();
    // }
    
    //     public List<Medicine> getMedicines(int page, int size, String sortBy, String sortOrder) {
    //     Sort sort = sortOrder.equalsIgnoreCase("asc") ? Sort.by(sortBy).ascending() : Sort.by(sortBy).descending();
    //     Pageable pageable = PageRequest.of(page, size, sort);
    //     return medicineRepo.findAll(pageable).getContent();
    // }

    public List<Medicine> getMedicines(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        Page<Medicine> medicinePage = medicineRepo.findAll(pageable);
        return medicinePage.getContent();
    }


    public Optional<Medicine> getMedicineById(Long id) {
        return medicineRepo.findById(id);
    }

    public Medicine editMedicine(Long id, Medicine user) {
        Medicine userAvail = medicineRepo.findById(id).orElse(null);
        if (userAvail != null) {
            userAvail.setMedicineId(user.getMedicineId());
            userAvail.setMedicineName(user.getMedicineName());
            userAvail.setMedicineFor(user.getMedicineFor());
            userAvail.setMedicineBrand(user.getMedicineBrand());
            userAvail.setManufacturedIn(user.getManufacturedIn());
            userAvail.setMedicinePrice(user.getMedicinePrice());
            userAvail.setExpiryDate(user.getExpiryDate());
            userAvail.setAvailability(user.isAvailability());
            return medicineRepo.saveAndFlush(userAvail);
        } else
            return null;
    }

    public String deleteMedicine(Long id) {
        medicineRepo.deleteById(id);
        return ("Medicine deleted");
    }
    public List<Medicine> getMedicinesByName(String name) {
        return medicineRepo.findByMedicineName(name);
    }
}