package com.set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Hashset {
	
	public static void main(String[] args) {
		
		Set<Integer> I = new HashSet<Integer>();
		List<Integer> L = new LinkedList<Integer>();
		
		I.add(15);
		I.add(25);
		I.add(35);
		I.add(null);
		I.add(45);
		I.add(50);
		
		System.out.println(I);
		
		L.add(150); L.add(250); L.add(350); L.add(450); L.add(450); L.add(500);
		System.out.println(L);
		
		for (Integer value : I) {
			System.out.println(value);
			
		}
		
		int size = I.size();
		System.out.println(size);
		
		I.remove(L);
		System.out.println(I);
		
		boolean contains = I.contains(45);
		System.out.println(contains);
		
		I.addAll(L);
		System.out.println(I);
		
		I.retainAll(L);
		System.out.println(I);
		
		I.removeAll(L);
		System.out.println(I);
		
		
		
		
		
		
		
		
		
		
		
	}

}
