package com.example.JPARelationshipsTutorial.repositories;

import com.example.JPARelationshipsTutorial.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
