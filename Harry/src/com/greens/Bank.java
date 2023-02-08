package com.greens;

public class Bank implements Sbi,Icici {
	public void loan() {
System.out.println("200000");

	}
	public void personalLoan() {
System.out.println("900000");

	}
	public void educationLoan() {
System.out.println("800000");

	}
public static void main(String[] args) {
	Bank b=new Bank();
	b.personalLoan();
	b.educationLoan();b.loan();
	b.Carloan();b.Homeloan();
	b.farmersloan();
}
@Override
public void Homeloan() {
	// TODO Auto-generated method stub
	
}
@Override
public void Carloan() {
	// TODO Auto-generated method stub
	
}
@Override
public void farmersloan() {
	// TODO Auto-generated method stub
	
}
}
