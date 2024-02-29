// package com.example.review.controller;

// import org.springframework.web.bind.annotation.RestController;

// import com.example.review.model.Medicine;
// import com.example.review.service.MedicineService;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;

// @RestController
// public class MedicineController {
//     @Autowired
//     MedicineService medicineService;

//     @PostMapping("/medicine")
//     public Medicine addMedicine(@RequestBody Medicine medicine) {
//         return medicineService.addMedicine(medicine);
//     }

//     @GetMapping("/getmed")
//     public List<Medicine> getMedicines() {
//         return medicineService.getMedicines();
//     }

//     @GetMapping("/medicine/{medicineId}")
//     public Optional<Medicine> getMedicineById(@PathVariable Long medicineId) {
//         return medicineService.getMedicineById(medicineId);
//     }
//     @PutMapping("/editmedicine/{id}")
//     public Medicine editMedicine(@PathVariable Long id, @RequestBody Medicine medicine)
//     {  return medicineService.editMedicine(id, medicine);
//     }
//     @DeleteMapping("/deletemedicine/{id}")
//     public String deleteMedicine(@PathVariable Long id){
//         return medicineService.deleteMedicine(id);
//     }
// }


package com.example.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.review.model.Medicine;
import com.example.review.service.MedicineService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/medicine")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @PostMapping
    public ResponseEntity<Medicine> addMedicine(@RequestBody Medicine medicine) {
        try {
            Medicine addedMedicine = medicineService.addMedicine(medicine);
            return new ResponseEntity<>(addedMedicine, HttpStatus.CREATED);//201
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);//500
        }
    }

    // @GetMapping
    // public ResponseEntity<List<Medicine>> getMedicines() {
    //     List<Medicine> medicines = medicineService.getMedicines();
    //     if (medicines.isEmpty()) {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);//404
    //     }
    //     return new ResponseEntity<>(medicines, HttpStatus.OK);//200
    // }
    // @GetMapping
    // public ResponseEntity<List<Medicine>> getMedicines(
    //         @RequestParam(defaultValue = "0") int page,
    //         @RequestParam(defaultValue = "10") int size,
    //         @RequestParam(defaultValue = "medicineId") String sortBy,
    //         @RequestParam(defaultValue = "asc") String sortOrder) {
    //     List<Medicine> medicines = medicineService.getMedicines(page, size, sortBy, sortOrder);
    //     if (medicines.isEmpty()) {
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }
    //     return new ResponseEntity<>(medicines, HttpStatus.OK);
    // }    


    @GetMapping("/paged")
    public ResponseEntity<List<Medicine>> getPagedMedicines(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "medicineId") String sortBy) {

        List<Medicine> medicines = medicineService.getMedicines(page, size, sortBy);
        if (medicines.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(medicines, HttpStatus.OK);
    }

    @GetMapping("/{medicineId}")
    public ResponseEntity<Medicine> getMedicineById(@PathVariable Long medicineId) {
        Optional<Medicine> medicine = medicineService.getMedicineById(medicineId);
        return medicine.map(value -> new ResponseEntity<>(value, HttpStatus.OK))//200
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));//404
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medicine> editMedicine(@PathVariable Long id, @RequestBody Medicine medicine) {
        Medicine editedMedicine = medicineService.editMedicine(id, medicine);
        if (editedMedicine != null) {
            return new ResponseEntity<>(editedMedicine, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMedicine(@PathVariable Long id) {
        try {
            String result = medicineService.deleteMedicine(id);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);//500
        }
    }
    @GetMapping("/byname/{medicineName}")
    public ResponseEntity<List<Medicine>> getMedicinesByName(@PathVariable String medicineName) {
        List<Medicine> medicines = medicineService.getMedicinesByName(medicineName);
        if (medicines.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(medicines, HttpStatus.OK);
    }
}