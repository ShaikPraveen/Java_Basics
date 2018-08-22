package com.java.practice;

public class CallByValueandCallbyReference 
{
	public static void main(String[] args) 
	{
		CallByValueandCallbyReference cv=new CallByValueandCallbyReference();
		int x=10;
		int y=20;
		cv.sample(x,y); // call by value or pass by value
			
	}
	
	
	public int  sample(int a, int b) 
	{
		a=30;
		b=40;
		int c=a+b;
		return c;
		
	}
	

}
