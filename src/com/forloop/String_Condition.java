package com.forloop;

public class String_Condition {
	
	public static void main(String[] args) {
		
		String a = "Hello Welcome To Java Class";
		System.out.println(a);
		System.out.println("*********************");
		
		int b = a.indexOf('o');
		int c = a.lastIndexOf('o');
		
		System.out.println("First index of 'o': "+b);
		System.out.println("Last index of 'o':"+c);
		System.out.println("***********************");
		
		for (int i = 0; i < a.length(); i++) {
			
			if (a.charAt(i) == 'o') {
				
				if (i == b) {
					
				} else if (i == c) {
				
					
				}else {
					System.out.println("index of middle 'o': " + i +"");
					System.out.println(a.charAt(i));
				}
					
				}

				}
				
			}
			
		
		
	}



