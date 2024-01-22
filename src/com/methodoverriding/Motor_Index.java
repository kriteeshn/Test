package com.methodoverriding;

public class Motor_Index extends Car_Parts{
	
	public void carfront(String name) {
		super.carfront(name);
	}
	
	public void carfront(String name,  int type) {
		super.carfront(name, type);
		
	}
	public static void main(String[] args) {
		Motor_Index mi = new Motor_Index();
		mi.carfront( "number plate");mi.carfront( "BUMPER"  , 02);
		mi.carfront( "bumper");  
		
	}

}
