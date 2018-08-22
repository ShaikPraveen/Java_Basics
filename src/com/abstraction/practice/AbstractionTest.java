package com.abstraction.practice;

import com.abstraction.Switch;

public class AbstractionTest
{
	 
	      public   static Switch resultwsitch(char ch)
	           {
	        	   if (ch=='b')
	        	   {
	        		  return new Fan();
					
				}else 
				{
					return new Buld();
				}	   	   
	           }
	      
	      public static void main(String[] args) 
	      {
	    	  Switch S1= AbstractionTest.resultwsitch('f');
	    	  S1.on();
	    	  S1.off();	  
		}
}
