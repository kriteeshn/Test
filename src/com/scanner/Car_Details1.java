package com.scanner;

import java.util.Scanner;

public class Car_Details1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the car details");
		String name = s.nextLine();
		System.out.println(name);

		System.out.println("Enter the number");
		int id = s.nextInt();
		System.out.println(id);

		System.out.println("enter the last name");
		String name1 = s.nextLine();

		System.out.println(name1);

		System.out.println("to get the perticular charecter");
		char charAt = s.next().charAt(3);
		System.out.println(charAt);

	}

	private static void charAt(int i) {
		// TODO Auto-generated method stub

	}

}
