package com.example.demo2.Day2;


import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class C_4_Book {
    @GetMapping("/book1")
    public Student4 b1()
    {
        Date date1 =new Date();//fetching today's date
        Student4 book=new Student4("Book1", "author1",date1);
        return book;
    }
}
