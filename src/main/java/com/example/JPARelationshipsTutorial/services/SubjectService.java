package com.example.JPARelationshipsTutorial.services;

import com.example.JPARelationshipsTutorial.models.Student;
import com.example.JPARelationshipsTutorial.models.Subject;
import com.example.JPARelationshipsTutorial.models.Teacher;
import com.example.JPARelationshipsTutorial.repositories.StudentRepository;
import com.example.JPARelationshipsTutorial.repositories.SubjectRepository;
import com.example.JPARelationshipsTutorial.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherRepository teacherRepository;

    public List<Subject> getSubjects(){
        return subjectRepository.findAll();
    }

    public Subject createSubject(Subject subject){
        return subjectRepository.save(subject);
    }

    public Subject enrollStudent(Long subjectId, Long studentId){
        Subject subject = subjectRepository.findById(subjectId).get();
        Student student = studentRepository.findById(studentId).get();
        subject.enrollStudent(student);
        return subjectRepository.save(subject);
    }

    public Subject assignTeacher(Long subjectId, Long teacherId){
        Subject subject = subjectRepository.findById(subjectId).get();
        Teacher teacher = teacherRepository.findById(teacherId).get();
        subject.assignTeacher(teacher);
        return subjectRepository.save(subject);
    }


}
