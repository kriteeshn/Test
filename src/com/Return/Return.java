package com.Return;

public class Return {
	
	public int Substraction() {
		
		int a = 212;
		int b = 101;
		int c = a-b;
		
		return c;
		
		
	}
	public static void main(String[] args) {
		Return r = new Return();
		
		int Substraction = r.Substraction();
		
		System.out.println(Substraction);
	}

}
