package com.Stringtyp;

public class String_Types {
	
	public static void main(String[] args) {
		/*
		 * String a = "Apple"; String b = "Apple"; System.out.println(a);
		 * System.out.println(System.identityHashCode(a));
		 * 
		 * System.out.println(b); System.out.println(System.identityHashCode(b));
		 * 
		 * String concat = a.concat(b); System.out.println(concat);
		 * System.out.println(System.identityHashCode(concat));
		 */
		
		StringBuffer ab = new StringBuffer("Apple");
		System.out.println(ab);
		System.out.println(System.identityHashCode(ab));
		
		StringBuffer ab1 = new StringBuffer("Apple");
		System.out.println(ab1);
		System.out.println(System.identityHashCode(ab1));
		
		StringBuffer append = ab.append(ab1);
		System.out.println(append);
		System.out.println(System.identityHashCode(append));
		
	}

}
