package com.set;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Linkedhashset {
	
	public static void main(String[] args) {
		
		Set<Integer> S = new LinkedHashSet<Integer>();
		List<Integer> S1 = new LinkedList<Integer>();
		
		S.add(11);
		S.add(21);
		S.add(31);
		S.add(41);
		S.add(null);
		S.add(41);
		S.add(51);
		
		System.out.println(S);
		
		S1.add(12); S1.add(15); S1.add(18); S1.add(20); S1.add(null); S1.add(20);
		
		System.out.println(S1);
		
		for (Integer value : S) {
			System.out.println(value);
			
		}
		
		int Size = S.size();
		System.out.println(Size);
		
		S.remove(S1);
		System.out.println(S);
		
		boolean contains = S.contains(50);
		System.out.println(contains);
		
		S.addAll(S1);
		System.out.println(S);
		
		S.retainAll(S1);
		System.out.println(S);
		
		S.removeAll(S1);
		System.out.println(S);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
