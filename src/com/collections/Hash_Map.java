package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash_Map {
	
	public static void main(String[] args) {
		Map<Integer,String> I = new HashMap<Integer,String>();
		
		I.put(10, "Audi");
		I.put(20, "Benz");
		I.put(30, "Maruti");
		I.put(40, "Hyndai");
		I.put(40, "Ford");
		
		System.out.println(I);
		System.out.println(I.size());
		System.out.println(I.get(40));
		
		Set<Integer> keyset = I.keySet();
		System.out.println(keyset);
		
		Collection<String> values = I.values();
		System.out.println(values);
		
		boolean containskey = I.containsKey(40);
		System.out.println(containskey);
		
		boolean containsvalue = I.containsValue("Hyndai");
		System.out.println(containsvalue);
		
		Set<Entry<Integer,String>> entryset = I.entrySet();
		System.out.println(entryset);
		
		Set<Entry<Integer,String>> entryset2 = I.entrySet();
		for (Entry<Integer, String> entry : entryset2) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
