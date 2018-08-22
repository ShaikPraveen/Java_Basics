package com.java.practice;

public class Looping_Statements
{
	public static void main(String[] args) {
		
	// 1. While loop
    //1.Print 1 to 10 NUmbers
		
		int  i=1;
               
		while(i<=10) 
		{
			System.out.println(i);
			i++;
			
		}
		
		System.out.println("*-*-*-*-*");
		 
		 
		//2. For Loop
		
		for (int j=1; j<=10; j++)
		{
			System.out.println(j);
		}
		
	   // Print 10 t0 1
		
		System.out.println("*_*_*_*_*_*_*");
		
		for (int k =10; k>=1; k--) 
		{
			System.out.println(k);
		
		}
		
		System.out.println("=================");
		
		int p=10;
		while(p>=1) 
		{
			System.out.println(p);
            p--; 
		}
		
		System.out.println("*=&=*=*=&=&=*=*");
		//Print 10 to 0 and 0 to -10
		
		  for (int m = 10; m>=-10; m--) 
		  {
			  System.out.println(m);
		
		}
		
	}

}

