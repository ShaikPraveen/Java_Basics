package com.java.part2;

public class CarTest
{
	public static void main(String[] args) {
		
		
		 //static polymorpsism  ---compiletime polymorphism
		   Audi au=new Audi();
		   au.start();
		   au.stop();
		   au.refuel();
		   au.weels(); 
		   au.type();
		   
		   System.out.println("*---*-*--*--*--*-*--*");
		   Car cr=new Car();
		   cr.start();
		   cr.stop();
		   cr.refuel();
		   
		   //Top casting
		   Car c1=new Audi();//Child class object can be referred by parent class reference variable is called dynamic polymorphism or runtime polymorphism
		   c1.start();
		   c1.stop();
		   c1.refuel();
		   
		   
		   //Down casting
		   Audi a1=(Audi)new Car();	//ClassCastException
		   
	}

}
