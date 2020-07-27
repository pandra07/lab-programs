
package com.capg.demo;

import java.util.Scanner;

public class ExceptionLab2 {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter age:");
			int age=sc.nextInt();
			try {
			if(age<15)
			   throw new AgeException("age should be above 15");
			System.out.println("Age is:"+age);
			
			}
			catch(AgeException e) {
			System.out.println(e);
			}


	}

}
