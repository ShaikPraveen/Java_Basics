package com.java.practice;

import java.util.Hashtable;

public class HashTableConcept
{
	public static void main(String[] args) {
		
		Hashtable h=new Hashtable();
		h.put("A", "TEST");
		h.put("B", "HELLOW");
		h.put("C", "WORLD");
		h.put("D", "PRAVEEN");
		
		System.out.println(h.size());
		
		h.put(10, 20);
		h.put(20, 30);
		h.put(30, 40);
		
		System.out.println(h.size());

		System.out.println(h.get(20));//30
		System.out.println(h.get(10));//20
		
		System.out.println(h.get("D"));//PRAVEEN
		System.out.println(h.get("A"));//TEST
		
		h.put(1, "AUTOMATION");
		
		System.out.println(h.size());//8
		System.out.println(h.get(1));//AUTOMATION
		
		Hashtable<Integer,Integer> h1=new Hashtable<Integer,Integer>();
		h1.put(100, 200);
		//h1.put(200, "PRAVEEN"); -> Gives an Error
		
		Hashtable<Integer,String> h2=new Hashtable<Integer,String>();
		h2.put(10, "PRAVEEN");
		//h2.put(20, 25);  ->Gives an Error
		
		
		
	
		
		
		
	}

}
