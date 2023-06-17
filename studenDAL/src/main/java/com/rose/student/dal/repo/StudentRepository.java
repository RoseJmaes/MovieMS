package com.rose.student.dal.repo;

import org.springframework.data.repository.CrudRepository;

import com.rose.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student,Long>{

}
