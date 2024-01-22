package com.reverseastring;

public class Stringrev {
	
	public static void main(String[] args) {
		
       String str = "KriteeshN";
       String st = " ";
       
       for(int i=str.length()-1; i>=0; i--) {
    	   
    	   st = st+str.charAt(i);
       }
	
          
       System.out.println("Reverse of Sring :" + st);
	}
	
	
}


	