package com.abstraction;

public class AbstractionTest 
{
	  
	public static Switch result(char ch) 
	   {
	     if (ch=='b')
	     {
	    	 return new Fan();
			
		}else 
		{
			return new Bulb();
		}
		  
		   
	   }
	
	  public static void main(String[] args) 
	  {
		  Switch s1=AbstractionTest.result('b');
		         s1.on();
		         s1.off();	
	}

}
