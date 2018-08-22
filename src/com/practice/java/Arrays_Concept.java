package com.practice.java;

public class Arrays_Concept 
{
	public static void main(String[] args) {
		
		
   //What is An Array:- An array is used to store similar data types values in array variable
   //Lower bound=0 , Upper bound =n-1 here n is the size
		
   //Advantages of Array
  //1. We can store multiple values in single variable
		
   //Disadvantages of Array
	 //1. Array size is fixed (Static Array)-> To over come this problem we can use Collections like ArrayList and HashMap(Dynamic Array)
	//2. Stores only similar data types -> To over come this problem we can use Object Array
		
	//What is Object Array
	// Object is a super class of all the classes, Object array is used to store different data types values
		
   //1.Integer Array
		
		  int a[]=new int[4];
		     a[0]=10;
		     a[1]=20;
		     a[2]=30;
		     a[3]=40;
		     
		     System.out.println(a.length);
		     System.out.println(a[3]);
		     
		 for (int i = 0; i < a.length; i++)
		 {
			 System.out.println(a[i]);	
		}
		 
		   System.out.println("------*----*----");
		  
	//2. String Array
		 
		  String s[]=new String[5];
		         s[0]="PRAVEEN";
		         s[1]="MCA";
		         s[2]="GOPI";
		         s[3]="RVR";
		         s[4]="ABC";
		         
		         System.out.println(s.length);
		         
		   for (int j = 0; j < s.length; j++)
		   {
			   System.out.println(s[j]);
		}
		   
		   System.out.println("@@@@@@@@@@@@-------------@@@@@@@@@@@@");
		         
	//3. Boolean Array
		   
		   boolean b[]=new boolean[2];
		           b[0]=true;
		           b[1]=false;
		           
		       System.out.println(b.length);
		       
		  for (int k = 0; k < b.length; k++)
		  {
			  System.out.println(b[k]);
			
		}
		  System.out.println("###########----------------$$$$$$$$$$$");
		  
    //4. Char Array
		  
		  char c[]=new char[2];
		       c[0]='@';
		       c[1]='M';
		       
		  System.out.println(c.length);
		  
		  for (int h = 0; h < c.length; h++) 
		  {
			  System.out.println(c[h]);	
		}
		  
		  System.out.println("$$$$$$$$$$$$$--------------@@@@@@@@@@@@@@@@@@");
		  
     //5. Double Array
		  
		  double d[]=new double[4];
		  d[0]=12.43;
		  d[1]=34.23;
		  d[2]=45.34;
		  d[3]=34.23;
		  
		  System.out.println(d.length);
		  
		  for (int g = 0; g < d.length; g++)
		  {
			  System.out.println(d[g]);	
		}
		  
		  System.out.println("**********-----------^^^^^^^^^^^^");
		  
		  Object ob[]=new Object[4];
		         ob[0]="PRAVEEN";
		         ob[1]='S';
		         ob[2]=1234;
		         ob[3]=34.43;
		         
	 //System.out.println(ob[4]); -> ArrayIndexOutOfBoundsException
		         
		   System.out.println(ob.length);
		   
		   for (int h = 0; h < ob.length; h++)
		   {
			   System.out.println(ob[h]);
			
		}
	
	}

}
