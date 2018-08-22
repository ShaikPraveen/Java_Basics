package com.java.practice;

public class TwoDimensionalArray
{
	public static void main(String[] args)
	{
	
		//1. String Array
		
		String a[][]=new String[3][5];
		
		System.out.println(a.length); // 3 -> it will return 3 rows only
		System.out.println(a[0].length); //5 -> it will return 5 columns
		
		
		a[0][0]="A";
		a[0][1]="B";
		a[0][2]="C";
		a[0][3]="D";
		a[0][4]="E";
		
		a[1][0]="A1";
		a[1][1]="B1";
		a[1][2]="C1";
		a[1][3]="D1";
		a[1][4]="E1";
		
		
		a[2][0]="A2";
		a[2][1]="B2";
		a[2][2]="C2";
		a[2][3]="D2";
		a[2][4]="E2";
		
		
		System.out.println(a[0][0]);
		System.out.println(a[1][0]);
		System.out.println(a[2][0]);
		System.out.println(a[1][2]);
		
		
		
		for (int row=0; row<a.length;row++) 
		{
			for(int col=0; col<a[0].length;col++)
			{
				System.out.println(a[row][col]);
	
			} 
			
		}
	}

}
