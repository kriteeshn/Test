package com.selection.statement;

public class Else_If_Else {
	public static void main(String[] args) {
		int age = 25;
		double height = 5.2;
		if (age>26) {
			System.out.println("Eligible to vote");
			
		} else if (height>5.5) {
			System.out.println("Not eligible to join hospital");
		}
		else {
			System.out.println("Eligible to join hospital");
		}
		
		
	}
}
