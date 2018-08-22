package com.java.practice;

public class MethodOverloading
{
	public static void main(String[] args) 
	{
		
		MethodOverloading mo=new MethodOverloading();
		mo.first();
		mo.first(10);
		mo.first(20, 15);
		
		
	
	}
	
	public void first() 
	 {
		 System.out.println("First Method without Any Parameters");
	 }
	
	public void first(double j) 
	 {
		 System.out.println("First Method without Any Parameters");
	 }
	public void first(int i) 
	 {
		 System.out.println("First Method  Only one  Parameter");
		 System.out.println(i);
	 }
	
	public void first(int i, int k) 
	 {
		 System.out.println("First Method 2 Parameters");
		 System.out.println(i*k); 
		 
	 }
	
	

}
