package com.example.SpringStarter;

import java.util.*;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
		public List<Student> findByFirstName(String firstname);
		public List<Student> findByLastName(String lastname);
	}

