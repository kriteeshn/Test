package com.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class List_iterator {
	


	public static void main(String[] args) {
		
		List<Integer> s = new ArrayList<Integer>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		
		
		  System.out.println(s); System.out.println("****************");
		  
		  ListIterator<Integer>lis = s.listIterator();
		 
		
		while (lis.hasNext()) {
			System.out.println(lis.next());
			
		}
		
		System.out.println("*****************");
		while (lis.hasPrevious()) {
			
			System.out.println(lis.previous());
			
		}
		
		
		

		}
	}


