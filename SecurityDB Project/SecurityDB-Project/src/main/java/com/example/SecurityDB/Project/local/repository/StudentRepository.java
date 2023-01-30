package com.example.SecurityDB.Project.local.repository;

import com.example.SecurityDB.Project.local.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.Optional;

@Repository
@Transactional
@EnableTransactionManagement
public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional<Student> findByEmail(String email);
    void deleteByEmail(String email);
}
