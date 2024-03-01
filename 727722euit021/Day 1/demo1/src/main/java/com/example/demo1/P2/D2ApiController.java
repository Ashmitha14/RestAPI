package com.example.demo1.P2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class D2ApiController {
    @Autowired
    D2Service userService;
    D2Student newStudent;

    @PostMapping("/students1")
    public D2Student postStudentDetails(@RequestBody D2Student student)
    {
        newStudent=userService.postStudentDetails(student);
        return newStudent;
    }
    @GetMapping("/students1")
    public D2Student getStudentDetails()
    {
        return userService.getStudents();
    }
}
