package com.string;

public class String_Methods {
	
	public static void main(String[] args) {

	
	String a = "Abc Private Limited";
	String b = " Product Basis";
	
	int length = a.length();
	System.out.println(length);
	boolean equals = a.equals(b);
	System.out.println(equals);
	boolean ei = a.equalsIgnoreCase(b);
	System.out.println(ei);
	String upc = a.toUpperCase();
	System.out.println(upc);
	String loc = b.toLowerCase();
	System.out.println(loc);
	boolean sw = a.startsWith(b);
	System.out.println(sw);
	boolean ew = a.endsWith("d");
	System.out.println(ew);
	boolean con = a.contains(b);
	System.out.println(con);
	int index = a.lastIndexOf("e");
	System.out.println(index);
	char charat = a.charAt(15);
	System.out.println(charat);
	String rpch = a.replace("Abc", "Infosys");
	System.out.println(rpch);
	String substr = a.substring(4);
	System.out.println(substr);
	String trim =a.trim();
	System.out.println(trim);
	String concact = a.concat(b);
	System.out.println(concact);
	int i = 679;
	String j = "Krish";
	String valueof = String.valueOf(i);
	System.out.println(valueof);
	String concact2 = j.concat(valueof);
	System.out.println(concact2);
	
		
	}

}
	
	
	
	


