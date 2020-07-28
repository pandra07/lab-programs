package com.capg.demo.spring_xml_lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
    	//Employee emp=new Employee(123,"Dhanush",30000,"marketing",21);
    	//emp.displayDetails();
    	Employee e1=context.getBean("employee",Employee.class);
    	e1.displayDetails();
    }
}
