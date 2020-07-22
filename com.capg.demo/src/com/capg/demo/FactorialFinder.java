

package com.capg.demo;

public class FactorialFinder {
    int facto(int n)
    {
    	int f=1;
    	while(n>0)
    	{
    		f=f*n;
    		n--;
    	}
    	return f;
    }
}
