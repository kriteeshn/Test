package com.oops;

public class Industry extends New_Products{
	
	public void Produtcs() {
		
	System.out.println("Milk");
		
	}
	
	public void Produtcs2() {
		System.out.println("Butter");
		
	}
	
public void Products5() {
	System.out.println("Wheat");
		
		
	}

	@Override
	public void Products() {
		System.out.println("Maida");
		
	}

	@Override
	public void Produtcs6() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Industry I = new Industry();
		I.Products();
		I.Products3();
		I.Produtcs2();
		I.Products4();
		I.Products5();
		I.Produtcs6();
	}

}
