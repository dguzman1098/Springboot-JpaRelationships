package com.example.JPARelationshipsTutorial.repositories;

import com.example.JPARelationshipsTutorial.models.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
