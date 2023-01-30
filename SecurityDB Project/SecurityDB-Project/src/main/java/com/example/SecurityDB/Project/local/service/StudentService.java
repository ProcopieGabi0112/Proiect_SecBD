package com.example.SecurityDB.Project.local.service;

import com.example.SecurityDB.Project.local.model.Student;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);

    Student getStudentByEmail(String emaill);
    void deleteStudentByEmail(String email);
}
