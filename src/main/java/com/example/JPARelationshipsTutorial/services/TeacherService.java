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
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;


    public List<Teacher> getTeachers(){
        return teacherRepository.findAll();
    }

    public Teacher createTeacher(Teacher teacher){
        return teacherRepository.save(teacher);
    }

}
