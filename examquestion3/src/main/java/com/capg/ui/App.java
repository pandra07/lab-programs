package com.capg.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.capg.dao.IStudentDaoJpa;
import com.capg.dao.StudentDaoJpa;
import com.capg.model.Student;

public class App 
{
	static Scanner scan;
	static IStudentDaoJpa impl;
    public static void main( String[] args )
    {
    	int choice =0;
    	boolean flag=false;
    	
        while(true)
        {
        	do {
        		scan= new Scanner(System.in);
        		System.out.println("Select the operation to be performed");
        		System.out.println("Enter 1 for add");
        		System.out.println("Enter 2 for remove student");
        		System.out.println("Enter 3 for find the student");
        		try {
        			choice =  scan.nextInt();
        			flag=true;
        		}
        		catch (InputMismatchException e) {
					// TODO: handle exception
        			System.err.println("Enter the valid number from above");
				}
        	}
        	while(!flag);
        	switch(choice)
        	{
        	case 1:
        		scan=new Scanner(System.in);
        		System.out.println("Enter the id");
        		int id =scan.nextInt();
        		System.out.println("Enter the name");
        		String name=scan.next();
        		System.out.println("Enter the height");
        		double height=scan.nextDouble();
        		Student s=new Student(id,name,height);
        		impl=new StudentDaoJpa();
        		if(!(impl.addStudent(s)==null))
        		{
        			System.out.println("Added");
        		}
        		else {
        			System.out.println("Not added");
        		}
        		break;
        	case 2:
        		scan=new Scanner(System.in);
        		System.out.println("Enter the id");
        		int idForRemoval =scan.nextInt();
        		
        		impl=new StudentDaoJpa();
        		if(!(impl.removeStudent(idForRemoval)==false))
        		{
        			System.out.println("removed");
        		}
        		else {
        			System.out.println("Not exist");
        		}
        		break;
        	case 3:
        		scan=new Scanner(System.in);
        		System.out.println("Enter the id");
        		int idForFind =scan.nextInt();
        		
        		impl=new StudentDaoJpa();
        		if((impl.findStudent(idForFind)==null))
        		{
        			System.out.println("Not Exist");
        		}
        		else {
        			System.out.println("found");
        		}
        		break;
        	default:
        		System.out.println("Enter from the above numbers");
        	}
        }
    }
}
