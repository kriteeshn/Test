package com.constructor;

public class cars {
	
	public cars() {
		System.out.println("It is a default or non parameterized car");
		
		
	}
	
	public cars(String name) {
		System.out.println("It is a parameterized car");
		System.out.println("Car name is " + name);
	}
	
	public cars (int model) {
		System.out.println("Car model is " + model);
		
	}
	
	public static void main(String[] args) {
		cars c = new cars();
		cars c1 = new cars("Rollysroyce");
		cars c2 = new cars(2012);
	}

}
