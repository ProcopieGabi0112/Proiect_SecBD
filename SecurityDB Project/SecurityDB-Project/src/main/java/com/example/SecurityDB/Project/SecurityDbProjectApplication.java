package com.example.SecurityDB.Project;

import com.example.SecurityDB.Project.cloud.model.User;
import com.example.SecurityDB.Project.cloud.repository.UserRepository;
import com.example.SecurityDB.Project.local.model.Student;
import com.example.SecurityDB.Project.local.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityDbProjectApplication {


	@Autowired
	public static void main(String[] args)
	{SpringApplication.run(SecurityDbProjectApplication.class, args);}




}
