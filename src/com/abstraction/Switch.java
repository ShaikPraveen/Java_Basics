package com.abstraction;

public interface Switch
{
	void on();
	void off();
	
	
	//Abstraction:-
	//Hiding the complexity of the system and exposing required functionality is called as Abstraction
	//Here the Class implementation will be hidden user or usage
	//Through interface we can achieve 100% Abstraction
	//Through abstract class we achieve up-to 100% Abstraction(bc, it is not 100% abstract class)
	
	 //Advantages:-
	 //1. internal enhancement will be not impact on usage
	 //2. Abstraction achieve group of all the common features in a interface or abstract class
	
	//Example:-
	// 1. When we driver a car, we will not know the internal implementation of the car, we just will be exposed to the functionality
	//2. While sending a mail, one composes and  sends a mail,internally there will be a lot of complexity,which will be hidden

}
