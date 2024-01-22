package com.abstract2;

public class doctorname extends Hospital_Names{
	public void Arun () {
		System.out.println("Arun");
		
	}
	
	public void david() {
		System.out.println("david");
		
	
	}
	
	@Override
	public void Kauvery() {
		System.out.println("kauvery");
		
	}

	@Override
	public void Narayana() {
		System.out.println("Narayana");
		
	}

	@Override
	public void nimhans() {
		System.out.println("nimhans");
		
	}
	
	public static void main(String[] args) {
		doctorname dn = new doctorname();
		dn.Arun();
		dn.Kauvery();
		dn.manipal();
		dn.Narayana();
		dn.nimhans();
		dn.david();
	}
	
	

}
