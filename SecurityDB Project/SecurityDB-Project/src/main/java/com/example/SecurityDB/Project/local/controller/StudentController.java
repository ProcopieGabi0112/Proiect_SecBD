package com.example.SecurityDB.Project.local.controller;

import com.example.SecurityDB.Project.local.model.Student;
import com.example.SecurityDB.Project.local.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addStudent")
    public String saveStudent(@RequestBody Student student)
    {
        studentService.saveStudent(student);
        return "Student with  [email:" + student.getEmail()+ "- nume: "+ student.getNume()+" ] was created";
//        - email_institutionalizat: "+student.getEmail_institutionalizat()+" - parola "+student.getParola()+"- tip_client: " + student.getTip_client() + "- nr_telefon: "+ student.getNr_telefon() + " ] was created";

    }
    @GetMapping("/findAllStudents")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/findAllStudents/{email}")
    public Student getStudentsByEmail(@PathVariable String email){
        return studentService.getStudentByEmail(email);
    }

    @DeleteMapping("/deleteStudent/{email}")
    public String deteleStudent(@PathVariable String email){
        studentService.deleteStudentByEmail(email);
        return "Student deleted with email:" + email;
    }

}
