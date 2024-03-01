package com.example.demo7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo7.model.Course;
import com.example.demo7.repository.CourseRepo;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    public Course addCourse(Course course)
    {
        return courseRepo.save(course);
    }

    public List<Course> getCourse()
    {
        return courseRepo.findAll();
    }

    public List<Course> findBycourseName(String courseName)
    {
        return courseRepo.findBycourseName(courseName);
    }
}