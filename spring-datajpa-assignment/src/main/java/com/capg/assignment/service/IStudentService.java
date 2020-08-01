package com.capg.assignment.service;

import java.util.List;

import com.capg.assignment.exception.InvalidDobException;
import com.capg.assignment.exception.StudentAlreadyExists;
import com.capg.assignment.exception.StudentNotFoundException;
import com.capg.assignment.model.Student;

public interface IStudentService {

	public Student addStudent(Student student) throws StudentAlreadyExists, InvalidDobException;
	public Student findStudent(int studentId) throws StudentNotFoundException;
	public Student updateStudent(Student student);
	public List<Student> getAllStudents();
	public void deleteStudent(int studentId) throws StudentNotFoundException;
	
	public Student findStudentByNameAndId(String studentName , int studentId);

	public Student findStudentByName(String studentName);
} 
