package com.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class TreeSet1 {
	

	public static void main(String[] args) {
		
		Set<Integer> A = new TreeSet <Integer>();
		List<Integer> B = new ArrayList <Integer>();
		
		A.add(2);
		A.add(3);
		A.add(5);
		A.add(7);
		A.add(10);
		A.add(10);
		A.add(18);
		B.add(25);
		B.add(30);
		B.add(35);
		B.add(40);
		
		System.out.println(A);
		System.out.println(B);
		
		int Size = A.size();
		System.out.println(Size);
		
		boolean contains = A.contains(50);
		System.out.println(contains);
		
		A.addAll(B);
		System.out.println(A);
		
		A.retainAll(B);
		System.out.println(A);
		
		A.removeAll(B);
		System.out.println(A);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

