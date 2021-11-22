package com.example.JPARelationshipsTutorial.controllers;

import com.example.JPARelationshipsTutorial.models.Student;
import com.example.JPARelationshipsTutorial.models.Subject;
import com.example.JPARelationshipsTutorial.services.StudentService;
import com.example.JPARelationshipsTutorial.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    SubjectService subjectService;

    @GetMapping
    List<Subject> getSubject(){
        return subjectService.getSubjects();
    }

    @PostMapping
    Subject createSubject(@RequestBody Subject subject){
        return subjectService.createSubject(subject);
    }

    @PutMapping("{subjectId}/students/{studentId}")
    Subject enrollStudentToSubject(@PathVariable Long subjectId, @PathVariable Long studentId){
        return subjectService.enrollStudent(subjectId, studentId);
    }

    @PutMapping("{subjectId}/teacher/{teacherId}")
    Subject assignTeacherToSubject(@PathVariable Long subjectId, @PathVariable Long teacherId){
        return subjectService.assignTeacher(subjectId, teacherId);
    }
}
