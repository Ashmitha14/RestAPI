package com.example.demo2.Day2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class C_2_JsonProperty {
    @GetMapping("/student2")
    public Student2 getMethodName() {
        Student2 s2=new Student2("ABC", 18);
        return s2;
    }    
}    
