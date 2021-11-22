package com.example.JPARelationshipsTutorial.services;

import com.example.JPARelationshipsTutorial.models.Student;
import com.example.JPARelationshipsTutorial.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    public Student createStudent(Student student){
        return studentRepository.save(student);
    }


}
