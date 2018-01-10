package com.javabotanist.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest_003 {
	
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
	
	@SuppressWarnings({ "rawtypes" })
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(5, "A");
        hm.put(11, "C");
        hm.put(4, "Z");
        hm.put(77, "Y");
        hm.put(9, "P");
        hm.put(66, "Q");
        hm.put(0, "R");
	
        Set set = hm.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
        	Map.Entry me = (Map.Entry)iterator.next();
        	System.out.println(me.getKey() + "-" + me.getValue());
        }
        
        boolean flag1 = hm.containsKey(44);
        System.out.println("Is key 44 present? " + flag1);
        
        boolean flag2 = hm.containsValue("P");
        System.out.println("Is the value P present? " + flag2);
        
	}
	
}
