package com.example.demo4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// public class Patient {
    
// }
// package com.example.springapp.model;

// import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Id;
// import javax.persistence.Table;



@Entity
@Table(name="Patients")
public class Patient {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int patientid;
    String patientName;
    String doctorName;
    String disease;
    String medication;
    public int getPatientid() {
        return patientid;
    }
    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }
    public String getPatientName() {
        return patientName;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public String getDoctorName() {
        return doctorName;
    }
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getDisease() {
        return disease;
    }
    public void setDisease(String disease) {
        this.disease = disease;
    }
    public String getMedication() {
        return medication;
    }
    public void setMedication(String medication) {
        this.medication = medication;
    }
    

    
    
}