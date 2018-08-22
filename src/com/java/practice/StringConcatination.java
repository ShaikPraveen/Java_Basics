package com.java.practice;

public class StringConcatination 
{
	
	public static void main(String[] args)
	{
		//Here + sign is : Concatenation Operator
		
		  int a=10;
		  int b=20;
		  
		  String x="PRAVEEN";
		  String y="AUTOMATION";
		  
		  double c=23.33;
		  double d=21.33;
		  
		  
		  System.out.println(a+b);//30
		  System.out.println(x+y);//PRAVEENAUTOMATION
		  System.out.println(a+b+x+y);//30PRAVEENAUTOMATION
		  System.out.println(x+y+a+b);//PRAVEENAUTOMATION1020
		  
		  System.out.println(x+y+(a+b));//PRAVEENAUTOMATION30
		  System.out.println(a+b+x+y+a+x+b+y);//30PRAVEENAUTOMATION10PRAVEEN20AUTOMATION
		  
		  System.out.println(a+b+x+y+a+b);//30PRAVEENAUTOMATION1020
		  
		  System.out.println(c+d);//44.66
		  System.out.println(x+y+c+d);//PRAVEENAUTOMATION23.3321.33
		  
		  System.out.println("PRAVEENAUTOMATION");//PRAVEENAUTOMATION
          System.out.println(a);//10
          System.out.println(b);//20
          
          System.out.println("The value of a is "+a);//10
          System.out.println("The value of x is "+x);//PRAVEEN
          System.out.println("The value is "+(a+b));//30
          
         //What is Difference b/w Print and Println
         //Println :- println is used to print on the console with a new line
         //Print :- print is just  used to print on the console
          
          System.out.print("PRAVEEN SELENIUM");
          System.out.println("PRAVEEN TESTING");//PRAVEEN SELENIUMPRAVEEN TESTING
          
          
          
	}

}


