package com.abstraction;

public class Fan implements Switch
{
	
	public void on() 
	{
		 System.out.println("Fan is Turned On");
	}
	
	public void off() 
	{
		System.out.println("Fan is Turned Off");
	}

}
