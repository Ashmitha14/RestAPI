package com.example.demo7.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo7.model.Course;
import com.example.demo7.service.CourseService;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping("/api/course")
    public ResponseEntity<Course> addCourse(@RequestBody Course course)
    {
        Course c=courseService.addCourse(course);
        if(c!=null)
        {
            return new ResponseEntity<Course> (c,HttpStatus.CREATED);
        }
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    } 
    @GetMapping("/api/course")
    public ResponseEntity<List<Course>> getCourse()
    {
        List<Course> c=courseService.getCourse();
        if(c!=null)
        {
            return new ResponseEntity<List<Course>> (c,HttpStatus.OK);
        }
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @GetMapping("/api/course/{courseName}")
    public ResponseEntity<List<Course>> findBycourseName(@PathVariable String courseName)
    {
        List<Course> c=courseService.findBycourseName(courseName);
        if(c!=null)
        {
            return new ResponseEntity<List<Course>> (c,HttpStatus.OK);
        }
        else
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}