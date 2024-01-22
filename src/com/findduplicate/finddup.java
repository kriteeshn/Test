package com.findduplicate;




public class finddup {
	
	public static void main(String[] args) {
		
		String str = "Welcome to selenuim";
		int count = 0;
		char[]ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
			if (ch[i]==ch[j]) {
				System.out.println("enter the duplicate values : " +ch[j]);
				count++;
				
			}
				
			}
			
		}
	
				
			
			
		
					
	}				}
				
			
			
		
		
	

