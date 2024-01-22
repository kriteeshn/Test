package com.methodoverriding;

public class Car_Parts {
	
	public void carfront(String name) {
		System.out.println("head light"+  name);
		
	}
	
	public void carfront(String name,int type) {
		System.out.println("head light"+  type);
		
	}

}
