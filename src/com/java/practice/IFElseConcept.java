package com.java.practice;

public class IFElseConcept 
{
	public static void main(String[] args)
	{
		//Comparison operators : < > <= >= != ==
		// = is the Assignment Operator
		// == is the comparison operator
		
		int a=60;
		int b=50;
		
		if (a>b) 
		{
			System.out.println("A IS GRATER THAN B");
			
		} else
		{
			System.out.println("A IS LESS THAN B");
		}
		
		int c=40;
		int d=40;
		
		if (c==d) 
		{
			System.out.println("C AND D ARE EQUAL");
			
		} else 
		{
			System.out.println("C AND D ARE NOT EQUAL");

		}
		
   //Write a logic find to find out Highest Number
		
		  int x= 100;
		  int y=500;
		  int z=665;
		  
		  
		  ////nested if-else
		  if (x>y & x>z) //false & false = false, true & true =true, false & true=false
		  {
			  System.out.println("X IS GREATEST VALUE");
			
		}
		  else if(y>z)
		  {
			  System.out.println("Y IS THE GREATEST VALUE");
			  
		  }else 
		  {
			  System.out.println("Z IS THE GREATEST VALUE");
		  }
		  
	}

}
