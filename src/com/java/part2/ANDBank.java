package com.java.part2;

public class ANDBank implements SBIBank, HDFCBank // WE  are acheing multiple inheritance
{
// If a class is implementing any interface, then its mandatory define/overridden all the methods of interface
	
	//Overridden Methods
	public void credit() 
	{
		System.out.println("ANDBANK------------CREDIT");
	}

	  public void debit()
	  {
		  System.out.println("ANDBBANK---------DEBIT");
	  }
	  
	  public void transferMoney() 
	  {
		  System.out.println("ANDBBANK--------------TRANFERMONEY");
		  
	  }
	  
	  //Separate Methods
	  public void educationLoan() 
	  {
		  
		  System.out.println("ANDB----EDUCATION LOAN");
	  } 
	  
	   public void carLoan() 
	   {
		   System.out.println("CAR-------------LOAN");
	   }
	   
	   
	   //HDFC Method
	   public void fixedAmount() 
	   {
		   System.out.println("HDFC-------FIXEDAMOUNT");
	   }
}

