package com.java.practice;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());
		
		
		ar.add(400);//3
		ar.add(500);//4
		
		System.out.println(ar.size());
		
		ar.add("PRAVEEN");//5
		ar.add(1120);//6
		ar.add('M');//7
		ar.add(45.45);//8
		ar.add(54.26);//9
		
		System.out.println(ar.size());
		ar.remove(9);
		System.out.println(ar.size());
		
	
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(5));
		
		//System.out.println(ar.get(9)); //Gives an Error
		
		for (int i = 0; i < ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("praveen"); gives an Error
		//ar1.add(25.56);
		//ar1.add('M');
		
		ArrayList<String> ar2=new ArrayList<String>();
		ar2.add("PRAVEEN");
		//ar2.add(12);
		//ar2.add('F');
		//ar2.add(43.34);
		
		
		
	}

}
