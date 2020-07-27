package com.capg.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.capg.dbutil.Utility;
import com.capg.model.Student;
//import com.capg.model.Trainee;

public class StudentDaoJpa implements IStudentDaoJpa {
	EntityManager em=Utility.emf().createEntityManager();



	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		 EntityTransaction tx=em.getTransaction();
		 tx.begin(); em.persist(student); tx.commit(); 
		 return student;
	
	}



	public boolean removeStudent(int id) {
		// TODO Auto-generated method stub
		boolean flag =false;
		EntityTransaction tx=em.getTransaction();
		Student s1=null;
		 tx.begin(); 
		  s1=em.find(Student.class,id); 
		em.remove(s1);
		flag=true;
		 tx.commit(); 
		return flag;
	}



	public Student findStudent(int id) {
		// TODO Auto-generated method stub
		EntityTransaction tx=em.getTransaction();
		Student s1=null;
		 tx.begin(); 
		  s1=em.find(Student.class,id); 
		 tx.commit(); 
		 System.out.println(s1);
		return s1;
		
	}
	
	

	
}
