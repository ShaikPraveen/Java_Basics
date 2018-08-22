package com.java.part2;

public class TestBank
{
	public static void main(String[] args) {
		
		//we can not create the Object for Interface, it will gives an error
		
		//SBIBank sb=new SBIBank(); // it will gives an error 
		
		
		ANDBank ab=new ANDBank();
		ab.credit();
		ab.debit();
		ab.transferMoney();
		ab.educationLoan();
		ab.carLoan();
		
		
		
		//Dynamic Polymorphism : Child class object can be referred by Parent reference Variable
		
		       SBIBank sb=new ANDBank();
		       sb.credit();
		       sb.debit();
		       sb.transferMoney();
		       
	//Here we can access only credit() and debit() and transferMoney() methods why because these are overridden methods
    //Here we can not access educationLoan() and carLoan() methods why because these methods are our own methods
		       
		       
		       System.out.println(SBIBank.min_Bal);
	}

}
