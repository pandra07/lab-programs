package com.capg.dbutil;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Utility {
	public static EntityManagerFactory emf()
	{
		return Persistence.createEntityManagerFactory("student-unit");	
	}
}
