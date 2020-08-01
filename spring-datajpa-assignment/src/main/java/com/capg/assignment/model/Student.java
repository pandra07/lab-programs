package com.capg.assignment.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {

	@Id
	private int studentId;
	private String studentName;
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate dob;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", dob=" + dob + "]";
	}
	public Student(int studentId, String studentName, LocalDate dob) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.dob = dob;
	}
	
}
