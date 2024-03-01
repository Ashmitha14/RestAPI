package com.example.demo2.Day2;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class C_3_JsonIgnore {
    @GetMapping("/student3")
    public Student3 s1() {
        Student3 student=new Student3(1,"ABC","ABC id is 1");
        return student;
    }
}