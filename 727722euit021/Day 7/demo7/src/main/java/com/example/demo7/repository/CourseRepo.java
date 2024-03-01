package com.example.demo7.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo7.model.Course;


@Repository
public interface CourseRepo extends JpaRepository<Course, Integer> {
    List<Course> findBycourseName(String courseName);
}