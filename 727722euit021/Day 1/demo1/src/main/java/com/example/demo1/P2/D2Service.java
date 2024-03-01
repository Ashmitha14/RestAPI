package com.example.demo1.P2;

import org.springframework.stereotype.Service;

@Service
public class D2Service {
    D2Student newStudent;
    public D2Student postStudentDetails(D2Student student)
    {
        newStudent =new D2Student(student.name, student.age);
        return newStudent;
    }
    public D2Student getStudents()
    {
        return newStudent;
    }
}
