package com.stringmeth;

public class stringmeth {
	
	public static void main(String[] args) {
		
		
		String a = "Welcome tO JaVa";
		String b = " Kriteesh";
		
		int length = a.length();
		System.out.println(length);
		String sc = a.toLowerCase();
		System.out.println(sc);
		String uc = b.toUpperCase();
		System.out.println(uc);
		boolean e = a.equalsIgnoreCase(b);
		System.out.println(e);
		char cha = a.charAt(11);
		System.out.println(cha);
		String ch = a.replace("Wel", "kri");
		System.out.println(ch);
		String concat = a.concat(b);
		System.out.println(concat);
	}
	

}
