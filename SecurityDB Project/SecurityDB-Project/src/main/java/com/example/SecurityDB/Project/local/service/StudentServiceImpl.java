package com.example.SecurityDB.Project.local.service;

import com.example.SecurityDB.Project.cloud.model.User;
import com.example.SecurityDB.Project.cloud.repository.UserRepository;
import com.example.SecurityDB.Project.local.model.Student;
import com.example.SecurityDB.Project.local.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        this.studentRepository.save(student);
        return student;
    }

    @Override
    public Student getStudentByEmail(String email) {
        Optional<Student> optional = studentRepository.findByEmail(email);
        Student student = null;
        if (optional.isPresent()) {
            student = optional.get();
        }else{
            throw  new RuntimeException("Student not found for email :: " + email);
        }
        return student;
    }

    @Override
    public void deleteStudentByEmail(String email) {
        this.studentRepository.deleteByEmail(email);

    }
}
