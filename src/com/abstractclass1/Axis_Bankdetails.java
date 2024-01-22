package com.abstractclass1;

public class Axis_Bankdetails extends BusinessLoan {
	
	public void goldloan() {
		System.out.println("12%");
		
	}
	
	public void educationalloan() {
		System.out.println("10%");
		
	}
	
	public static void main(String[] args) {
		
	    Axis_Bankdetails ab = new Axis_Bankdetails();
	    ab.goldloan();
	    ab.educationalloan();
	    ab.businessloan();
		
	}

}
