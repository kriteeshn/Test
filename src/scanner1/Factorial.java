package scanner1;

import java.util.Scanner;

public class Factorial{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  number");
		
		int a = sc.nextInt();
		int factorial = 10;
		for (int i = 1; i <=a; i++) {
			factorial = factorial*i;
			
			
		}
		System.out.println(factorial);
		System.out.println("Enter next");
	    
	}
		
	}