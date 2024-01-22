package com.reverseastring;

import java.util.Arrays;

public class Anagram {
	
	
	private static boolean IsAnagram(String s1,String s2) {
		
		String st1  = s1.replaceAll("\\s", "");
		String st2  =s2.replaceAll("\\s", "");
		
	if (st1.length() != st2.length()) {
		
		return false;
		
	}
	else {
		
		char c1 [] = st1.toLowerCase().toCharArray();
		char c2 [] = st2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}

	}
	public static void main(String[] args) {
		
		System.out.println(IsAnagram("CAT","ACT"));
		System.out.println(IsAnagram("mat","ATM"));
	}
	
	
}


	




		
		
