package com.capg.demo;
import java.util.Scanner;
public class ExceptionLab3 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary:");
		int sal=sc.nextInt();
		try {
			if(sal<3000)
				throw new EmployeeException("salary should be greater than 3000");
			System.out.println("salary:"+sal);
		}
		catch(EmployeeException e)
		{
			System.out.println(e);
		}

	}

}
