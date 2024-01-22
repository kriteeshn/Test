package com.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Linked_Hashmap {
	
	public static void main(String[] args) {
		Map<Integer,String> a = new LinkedHashMap<Integer,String>();
		a.put(15, "Tomato");
		a.put(20, "Potato");
		a.put(35, "Onion");
		a.put(50, "Capsicum");
		a.put(65, "Cucumber");
		a.put(65, "Cabbage");
		
		System.out.println(a);
		
		System.out.println(a.size());
		
		System.out.println(a.get(65));
		
		Set<Integer> keyset = a.keySet();
		System.out.println(keyset);
		
		Collection<String> values = a.values();
		System.out.println(values);
		
		boolean containskey = a.containsKey(50);
		System.out.println(containskey);
		
		boolean containsvalue = a.containsValue("Cucumber");
		System.out.println(containsvalue);
	
		Set<Entry<Integer,String>> entryset = a.entrySet();
		System.out.println(entryset);
		
		for (Entry<Integer, String> entry : entryset) {
			System.out.println(entry.getValue());
			
		}
			
		}
		
	}


