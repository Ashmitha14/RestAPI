package com.example.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.model.Student;
import com.example.springapp.model.StudentDetail;
import com.example.springapp.repository.StudentDetailRepository;
import com.example.springapp.repository.StudentRepository;

@Service
public class StudentDetailService {
    @Autowired
    private StudentDetailRepository studentDetailRepository;
@Autowired
private StudentRepository studentRepository;
    public StudentDetail saveStudentDetail(StudentDetail studentDetail,Long id) {
        Student student=studentRepository.findById(id).orElse(null);
        if(student!=null)
        {
            student.setStudentDetail(studentDetail);
            studentDetailRepository.save(studentDetail);
            return studentDetail;
        }
        else{
            return null;
        }
    }

    public StudentDetail getStudentDetailById(Long id) {
        return studentDetailRepository.findById(id).orElse(null);
    }
}
