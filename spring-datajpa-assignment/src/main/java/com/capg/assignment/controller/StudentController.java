package com.capg.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.capg.assignment.exception.InvalidDobException;
import com.capg.assignment.exception.StudentAlreadyExists;
import com.capg.assignment.exception.StudentNotFoundException;
import com.capg.assignment.model.Student;
import com.capg.assignment.service.IStudentService;

@RestController
public class StudentController {

	@Autowired
	IStudentService service;
	
	@PostMapping("/student")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Student addStudent(@RequestBody Student student) throws StudentAlreadyExists, InvalidDobException 
	{
	
			return service.addStudent(student);
	}
	
	@GetMapping("/student/id/{id}")
	public Student findStudent(@PathVariable int id) 
	{
	try {
		return service.findStudent(id);
	}
	catch (StudentNotFoundException e) {
		
throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
}
	}
	@PutMapping("/student")
	public Student updateStudent(@RequestBody Student student)
	{
		return service.updateStudent(student);
	}
	@GetMapping("/student")
	public List<Student> getAllStudents()
	{
		return service.getAllStudents();
	}
	
	@DeleteMapping("/student/id/{id}")
	public void deleteStudent(@PathVariable int id) throws StudentNotFoundException
	{
		service.deleteStudent(id);
	}
	
	
	@GetMapping("/student/name/{studentName}")
	public Student getStudentByName(@PathVariable String studentName)
	{
		return service.findStudentByName(studentName);
	}
	@GetMapping("/student/name/{studentName}/id/{id}")
	public Student getStudentByName(@PathVariable String studentName,int id)
	{
		return service.findStudentByNameAndId(studentName, id);
	}
}
