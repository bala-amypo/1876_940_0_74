package com.example.demo.Serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.respository.StudentRespository;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImple implements StudentService{
    private final StudentRespository studentRespository;
    public StudentServiceImple(StudentRespository studentRespository){
        this.studentRespository=studentRespository;
    }
    public Student saveStudent(Student student){
        return studentRespository.save(student);
    }
}
