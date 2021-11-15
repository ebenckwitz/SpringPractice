package com.example.SpringStarter;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentDatabaseApplication implements CommandLineRunner {
	@Autowired
	StudentRepo repository;
	public static void main(String[] args) {
		SpringApplication.run(StudentDatabaseApplication.class, args);
	}
	
	public void run(String... args) throws Exception {
		repository.save(new Student("Ethan", "Benckwitz", "ethan@gmail.com", "123 Street"));
		repository.save(new Student("FirstName", "lastName", "test@utep.edu", "456 Dr"));
	}
}
