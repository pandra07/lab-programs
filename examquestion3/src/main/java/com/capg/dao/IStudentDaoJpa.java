package com.capg.dao;

import com.capg.model.Student;

public interface IStudentDaoJpa {
Student addStudent(Student student);
boolean removeStudent(int id);
Student findStudent(int id);
}
