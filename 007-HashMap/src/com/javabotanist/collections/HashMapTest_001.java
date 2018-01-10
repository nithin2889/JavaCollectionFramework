package com.javabotanist.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest_001 {
	
	/**
	 * Map:
	 * 1. A map is an object that maps the keys to its values.
	 * 2. A map has three implementations: HashMap, TreeMap and LinkedHashMap.
	 * 
	 * HashMap:
	 * 1. HashMap underlying data structure is Hashtable.
	 * 2. HashMap doesn't maintain any insertion order.
	 * 3. HashMap is similar to Hashtable, but it is not synchronized.
	 * 4. HashMap allows only a single null for keys and any number of nulls for its values.
	 * 5. HashMap doesn't sort its keys and values.
	 * 6. Both key and value are Objects.
	 * 7. Each key-value pair is known as an Entry, and hence the map is considered as a collection of Entry Objects.
	 */
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(12, "FF");
		hm.put(3, "BB");
		hm.put(1, "AA"); 
		hm.put(4, "CC");
		hm.put(6, "DD");
		hm.put(8, "EE");
		
		System.out.println("Current HashMap content is "+hm);
		
		Set set = hm.entrySet();
		Iterator iterator = set.iterator();
		
		System.out.println("Keys: "+hm.keySet());
		System.out.println("Values: "+hm.values());
		
		// Iterating using while loop
		System.out.println("Iterating using while loop");
		while(iterator.hasNext()) {
			Map.Entry mEntry = (Map.Entry)iterator.next();
			System.out.println(mEntry.getKey() + "-" + mEntry.getValue());
			if(mEntry.getKey().equals(4)) {
				mEntry.setValue("NN");
			}
			// System.out.println(mEntry.getKey() + "-" + mEntry.getValue());
		}
		
		// Iterating using for-each loop
		System.out.println("Iterating using for-each loop");
		for(Map.Entry me : hm.entrySet()) {
			System.out.println(me.getKey() + "-" + me.getValue());
		}
		
	}
	
}
