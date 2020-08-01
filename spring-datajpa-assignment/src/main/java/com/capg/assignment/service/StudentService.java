package com.capg.assignment.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.assignment.exception.InvalidDobException;
import com.capg.assignment.exception.StudentAlreadyExists;
import com.capg.assignment.exception.StudentNotFoundException;
import com.capg.assignment.model.Student;
import com.capg.assignment.repo.IStudentRepo;

@Service
public class StudentService implements IStudentService {

	@Autowired
	IStudentRepo repo;
	@Override
	public Student addStudent(Student student) throws StudentAlreadyExists, InvalidDobException {
		LocalDate startdate=LocalDate.of(2000,01,1);
		
	long diff=	ChronoUnit.YEARS.between(startdate, student.getDob());
if(diff<=0)
{
	throw new InvalidDobException("Invalid DOB The Student should be Born after Year 2000");
	}
	if(repo.existsById(student.getStudentId()))
		{
			throw new StudentAlreadyExists("Student with Id "+student.getStudentId()+" Already exists");
		}
		
		return repo.save(student);
	}

	@Override
	public Student findStudent(int studentId) throws StudentNotFoundException {
		if(!repo.existsById(studentId))
		{
			throw new StudentNotFoundException("Student  with Id "+studentId+" not Found");

		}
		return repo.getOne(studentId);
	}

	@Override
	public Student updateStudent(Student student) {
		Student stu = repo.getOne(student.getStudentId());
		stu.setStudentName(student.getStudentName());
		stu.setDob(student.getDob());
		
		return repo.save(stu);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void deleteStudent(int studentId) throws StudentNotFoundException  {
		if(!repo.existsById(studentId))
		{
			throw new StudentNotFoundException("Student  with Id "+studentId+" not Found");

		}
		repo.deleteById(studentId);
	}

	@Override
	public Student findStudentByName(String studentName) {
		// TODO Auto-generated method stub
		return repo.findByStudentName(studentName);
	}

	@Override
	public Student findStudentByNameAndId(String studentName, int studentId) {
		return repo.findByStudentNameAndStudentId(studentName, studentId);
	}

}
