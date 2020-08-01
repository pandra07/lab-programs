package com.capg.assignment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.assignment.model.Student;

public interface IStudentRepo extends JpaRepository<Student, Integer>{

	public Student findByStudentName(String studentName);
	public Student findByStudentNameAndStudentId(String studentName , int studentId);

}
