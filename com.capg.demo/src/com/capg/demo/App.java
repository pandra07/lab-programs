
package com.capg.demo;

public class App {

	public static void main(String[] args) throws NegativeNumberException  {
		int n=5;
		int fact;
		FactorialFinder f=new FactorialFinder();
		try {
			if(n<0)
				throw new NegativeNumberException("factorial does not take negative values");
			fact=f.facto(n);
			System.out.println("Factorial="+fact);
		}
		catch(NegativeNumberException e)
		{
			System.out.println("Error Occured"+e);
		}
		

	}

}

