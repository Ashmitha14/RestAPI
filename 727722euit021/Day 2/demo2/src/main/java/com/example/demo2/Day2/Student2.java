package com.example.demo2.Day2;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Student2 {
    @JsonProperty("Student name")
    String name;
    
    @JsonProperty("Student Age")
    int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }    
}
