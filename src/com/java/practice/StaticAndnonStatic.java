package com.java.practice;

public class StaticAndnonStatic
{
	
	String name="PRAVEEN"; //Non-static global variable
	static int age=10; // static global variable
	
	
	public static void main(String[] args)
	{
		 //How to Access Static variables and Methods. Two types
		 //1. Directly
		 marks();
		 //2. Calling By Classname
		 StaticAndnonStatic.marks();
		 
		 System.out.println(age);
		 System.out.println(StaticAndnonStatic.age);
		 
		 
		 // How to Access Non-static variables and Methods. Using Object reference
		 
		 StaticAndnonStatic sn=new StaticAndnonStatic();
		 sn.sentmail(); 
		 System.out.println(sn.name);
		 
		 
		 //Can i access Static methods by using Object reference? -> Yes
		   sn.marks(); // warning will be given
		 
	}
	
	
	   public void sentmail() // non-static method
	   {
		   System.out.println("Sending the Mail");
		   
	   }
      
	   public static void marks() // static method
	   {
		   System.out.println("Student Marks");
		   
	   }
}
