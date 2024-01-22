package com.keywords;

public class sampletype extends sample{
	int b = 25;
	
	public void SampleMethod() {
		int b = 50;
		System.out.println(b);
		System.out.println(this.b);
		System.out.println(super.b);
	}
	
	public static void main(String[] args) {
		sampletype s = new sampletype();
		s.SampleMethod();
		
	}

}
