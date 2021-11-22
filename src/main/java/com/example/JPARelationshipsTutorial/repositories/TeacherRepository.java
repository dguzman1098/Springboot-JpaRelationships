package com.example.JPARelationshipsTutorial.repositories;

import com.example.JPARelationshipsTutorial.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
