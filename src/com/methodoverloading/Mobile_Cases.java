package com.methodoverloading;

public class Mobile_Cases extends Mobile_Details {
	public void mobilecase1 (String name ) {
		System.out.println("mobile case for " +  name);
	}

	public void mobilecaseprice(int price) {
		System.out.println("mobile case price is " +  price);
		
	}
	
	public static void main(String[] args) {
		Mobile_Cases ma = new Mobile_Cases();
		ma.mobilecase1("APPLE");
		ma.mobilecaseprice(250);
        ma.moblie("APPLE");
        ma.mobile(2012);
		
	}

}
