package com.example.demo5.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.model.Language;
import com.example.demo5.service.LanguageService;
@RestController
public class LanguageController {
    @Autowired LanguageService ser;
    @PostMapping("/language")
    public ResponseEntity<?> post(@RequestBody Language l)
    {
        try{
        return ResponseEntity.status(201).body(ser.post(l));
    }
    catch(Exception e)
    {
            return ResponseEntity.status(500).build();

    }
    }
    @GetMapping("/language")
    public ResponseEntity<?> get()
    {
        return new ResponseEntity<>(ser.get(),HttpStatus.OK);
    }
    @GetMapping("/language/{languageId}")
    public ResponseEntity<?> getid(@PathVariable int languageId)
    {
        return new ResponseEntity<>(ser.getid(languageId),HttpStatus.OK);
    }
    @PutMapping("/language/{languageId}")
    public ResponseEntity<?> putid(@PathVariable int languageId,@RequestBody Language l)
    {
        return new ResponseEntity<>(ser.put(languageId, l),HttpStatus.OK);
        
    }
    @DeleteMapping("/language/{languageId}")
    public ResponseEntity<?> delid(@PathVariable int languageId)
    {
        return new ResponseEntity<>(ser.delete(languageId),HttpStatus.OK);
        
    }
}