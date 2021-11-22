package com.example.JPARelationshipsTutorial.controllers;

import com.example.JPARelationshipsTutorial.models.Student;
import com.example.JPARelationshipsTutorial.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping
    List<Student> getStudents(){
        return studentService.getStudents();
    }

    @PostMapping
    Student createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }
}
