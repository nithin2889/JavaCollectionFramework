package com.javabotanist.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.javabotanist.model.Temp;

public class HashtableTest_001 {
	
	/**
	 * Hashtable:
	 * 1. Hashtable implements Map interface.
	 * 2. Hashtable is synchronized.
	 * 3. Hashtable does not allow any duplicates.
	 * 4. Hashtable cannot have null keys or null values.
	 * 5. Hashtable doesn't guarantee any sort of insertion order, unlike the LinkedHashMap and TreeMap.
	 * 6. Hashtable's enumerator is not fail-fast and doesn't throw ConcurrentModificationException, 
	 * 	  unlike the iterator of HashMap.
	 */
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		Hashtable ht = new Hashtable();
		ht.put(new Temp(5), "AA");
		ht.put(new Temp(2), "BB");
		ht.put(new Temp(6), "CC");
		ht.put(new Temp(15), "DD");
		ht.put(new Temp(23), "EE");
		ht.put(new Temp(16), "FF");
		
		// Using iterator
		Set set = ht.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + "-" + me.getValue());
		}
		
		// Using enumerator
		Enumeration keys = ht.keys();
        while(keys.hasMoreElements()) {
        	System.out.println(keys.nextElement());
        }
		
	}
	
}
