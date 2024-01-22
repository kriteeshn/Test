package com.inheritense;

public class ronB extends ronA{
	
	public void yellow() {
		System.out.println("yellow colour");
		
	}
	
	public void white() {
		System.out.println("white colour");
		
	}
	public static void main(String[] args) {
		
		ronB b = new ronB();
		b.yellow();
		b.white();
		b.green();
		b.red();
		
		
	}

}
