package com.inheritence;

public class Grade_B extends Grade_A{
	public void black() {
		System.out.println("BLACK COLOUR");
		
	}

	public void yellow() {
		System.out.println("YELLOW COLOUR");
		
	}
	public static void main(String[] args) {
		Grade_B gb = new Grade_B();
		gb.black();
		gb.blue();
		gb.red();
		gb.yellow();
	}
}
