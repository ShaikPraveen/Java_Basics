package com.java.practice;

public class WrapperClasses
{
	public static void main(String[] args) {
		
		
		  String  x="100";
		  System.out.println(x+20);
		  
		  
		  // Converting String to Integer
		  int i=Integer.parseInt(x);
		  System.out.println(i);
		  
		  
		  //String to double
		  String y="24.43";
		 double d= Double.parseDouble(y);
		 System.out.println(d+20);
		 
		 
		 //String to boolean
		 String k="true";
		boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		//Int to String 
		
		int m=20;
		System.out.println(m+40);
		
		String s=String.valueOf(m);
		System.out.println(s); //20
		System.out.println(s+25);//2025
		
		
		
		String  a="100A";
		Integer.parseInt(a); // it will gives an error like NumberFormatException
		                     //100A is not correct the input string to convert integer
	}

}
