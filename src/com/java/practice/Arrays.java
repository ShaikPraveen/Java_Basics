package com.java.practice;

public class Arrays
{
	public static void main(String[] args) {
		
		
		//Syn:- int variablename[]=new variablename[size];
		
		//1. int array
		
		 int i[]=new int[5];
		 i[0]=10;
		 i[1]=20;
		 i[2]=30;
		 i[3]=40;
		 i[4]=50;
		 
		 System.out.println(i[0]);
		 System.out.println(i[1]);
		 System.out.println(i[2]);
		 System.out.println(i[3]);
		 System.out.println(i[4]);
		 //System.out.println(i[5]);
		 
		//Print length of an array 
		 System.out.println(i.length);
		 
		//Print all the values of an array : use for loop
		 
		 for (int j = 0; j < i.length; j++)
		 {
			 System.out.println(i[j]);
		
		}
		 
		 System.out.println("***************************************");
		 
		 //2. Double Array
		 
		  double k[]=new double[3];
		  k[0]=30.48;
		  k[1]=25.36;
		  k[2]=35.45;
		  
		  System.out.println(k[0]);
		  System.out.println(k[1]);
		  System.out.println(k[2]); 
		  
		//3. Char Array
		  
		  char n[]=new char[3];
		  n[0]='P';
		  n[1]='$';
		  n[2]='@';
		  
		  System.out.println(n[0]);
		  System.out.println(n[1]);
		  System.out.println(n[2]);
		  
	  //4. Boolean Array
		  
	  boolean b[]=new boolean[2];
	  b[0]=true;
	  b[1]=false;
	  
	  System.out.println(b[0]);
	  System.out.println(b[1]);
	  
	  //5. String Array
	  
	   String s[]=new String[4];
              s[0]="PRAVEEN";
              s[1]="shaik";
              s[2]="naveen";
              s[3]="automation";
              
         System.out.println(s.length);
         System.out.println(s[0]);
         System.out.println(s[1]);
         System.out.println(s[2]);
         System.out.println(s[3]);
         
     // Object Array
         
         Object ob[]=new Object[6];
         ob[0]="PRAVEEN";
         ob[1]=45.36;
         ob[2]='M';
         ob[3]="01/06/1990";
         ob[4]="Hyderabad";
         ob[5]=1120;
        
         System.out.println(ob[0]);
         System.out.println(ob[1]);
         System.out.println(ob[2]);
         System.out.println(ob[3]);
         System.out.println(ob[4]);
         System.out.println(ob[5]);
         
         System.out.println(ob.length);
	}

}
