package com.example.JPARelationshipsTutorial.controllers;

import com.example.JPARelationshipsTutorial.models.Subject;
import com.example.JPARelationshipsTutorial.models.Teacher;
import com.example.JPARelationshipsTutorial.services.StudentService;
import com.example.JPARelationshipsTutorial.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @GetMapping
    List<Teacher> getTeacher(){
        return teacherService.getTeachers();
    }

    @PostMapping
    Teacher createSubject(@RequestBody Teacher teacher){
        return teacherService.createTeacher(teacher);
    }



}
