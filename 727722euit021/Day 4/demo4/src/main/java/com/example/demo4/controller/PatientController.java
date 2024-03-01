package com.example.demo4.controller;

// package com.example.springapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo4.model.Patient;
import com.example.demo4.service.PatientService;

@RestController
public class PatientController {
    @Autowired
    PatientService patientService;
    @PostMapping("/api/patient")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient)
    {
        return new ResponseEntity<>(patientService.addPatients(patient),HttpStatus.CREATED);
    }
    @GetMapping("/api/patient")
    public List<Patient> getPatients()
    {
        return patientService.getPatients();
    }
    @GetMapping("/api/patient/{patientId}")
    public Optional<Patient> getById(@PathVariable int patientId)
    {
        return patientService.getById(patientId);
    }
}