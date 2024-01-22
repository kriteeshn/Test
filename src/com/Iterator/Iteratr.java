package com.Iterator;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Iteratr {
	
	public static void main(String[] args) {
		 Set<Integer> a = new LinkedHashSet<Integer>();
		 
		 a.add(25);
		 a.add(50);
		 a.add(75);
		 a.add(100);
		 
		 System.out.println(a);
		 Iterator<Integer> it = a.iterator();
		 
		 while (it.hasNext()) {
			 
			 System.out.println(it.next());
			
		}
	}

}
