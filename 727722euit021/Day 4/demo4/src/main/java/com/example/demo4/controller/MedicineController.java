package com.example.demo4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo4.model.Medicine;
import com.example.demo4.service.MedicineService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class MedicineController {
    @Autowired
    MedicineService medicineService;

    @PostMapping("/medicine")
    public Medicine addMedicine(@RequestBody Medicine medicine) {// returns added w
        return medicineService.addMedicine(medicine);// call service class
    }

    @GetMapping("/getmed")
    public List<Medicine> getMedicines() {
        return medicineService.getMedicines();// call service
    }

    @GetMapping("/medicine/{medicineId}")
    public Optional<Medicine> getMedicineById(@PathVariable Long medicineId) {
        return medicineService.getMedicineById(medicineId);
    }
}
