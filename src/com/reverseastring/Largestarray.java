package com.reverseastring;

public class Largestarray {
	
	public static void main(String[] args) {
		
	int a[] = {100,300,500,600};
	int largest = a[0];
	
	for (int i = 1; i < a.length; i++) {
		
		if (a[i]>largest) {
			
			largest = a[i];
			
		}
		
	}
	
	System.out.println("largest number is:"+largest);
	}

	
}

