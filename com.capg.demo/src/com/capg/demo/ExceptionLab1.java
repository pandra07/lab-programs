
package com.capg.demo;
import java.util.Scanner;
public class ExceptionLab1 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter first name:");
			String firstName=sc.nextLine();
			System.out.println("Enter last name:");
			String lastName=sc.nextLine();
			try {
			if(firstName.length()==0 || lastName.length()==0)
			    throw new ValidEmployeeException("first name and last name cannot be blank");
			System.out.println("First name:"+firstName+"\nlast name:"+lastName);
			}
			catch(ValidEmployeeException e)
			{
				System.out.println(e);
			}

	}

}
