package com.rose.student.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.rose.student.dal.entities.Student;
import com.rose.student.dal.repo.StudentRepository;

@SpringBootTest
class StudenDalApplicationTests {
	
	@Autowired
	private StudentRepository repo;
	@Test 
	void testCreatestudent() {
		
		Student student =new Student();
		student.setName("rose");
		student.setCourse("Aws");
		student.setFee(30d);
		repo.save(student);
	}

	@Test
	void testFind() {
		
		Student student = repo.findById(1l).get();
		System.out.println(student);
	}
	
	

}
	
	

	
	


