package com.collections;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
		
		ArrayList<Integer> x = new ArrayList<Integer>();
		List<Integer> y = new ArrayList<Integer>();
		
		x.add(150);
		x.add(250);
		x.add(300);
		x.add(300);
		x.add(300);
		y.add(10);
		y.add(20);
		y.add(30);
		y.add(40);
		y.add(50);
	
		
		System.out.println(x);
		System.out.println(x.size());
		Integer i = x.get(0);
		System.out.println(i);
		x.set(0,20);
		System.out.println(x);
		x.remove(2);
		System.out.println(x);
		int indexof = x.indexOf(250);
		System.out.println(indexof);
		boolean con = x.contains(300);
		System.out.println(con);
		x.addAll(y);
		System.out.println(x);
		x.retainAll(y);
		System.out.println(x);
		
		y.removeAll(x);
		System.out.println(x);
		
		x.clear();
		System.out.println(y);
			
		}
		
		
	}


		
