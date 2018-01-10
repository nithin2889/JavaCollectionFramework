package com.javabotanist.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest_002 {
	
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(5, "A");
        hm.put(11, "C");
        hm.put(4, "Z");
        hm.put(77, "Y");
        hm.put(9, "P");
        hm.put(66, "Q");
        hm.put(0, "R");
		
		// Default Natural Sorting Order by keys using TreeMap
		System.out.println("===Before Sorting===");
		Set set = hm.entrySet();
		Iterator iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			System.out.println(me.getKey() + "-" + me.getValue());
		}
		
		System.out.println("After Sorting");
		Map<Integer, String> tMap = new TreeMap<Integer, String>(hm);
		Set set1 = tMap.entrySet();
		Iterator iterator2 = set1.iterator();
		
		while(iterator2.hasNext()) {
			Map.Entry me = (Map.Entry)iterator2.next();
			System.out.println(me.getKey() + "-" + me.getValue());
		}
		
		System.out.println("=================================================");
		
		// Sorting by values by values using Comparator
		System.out.println("===Before Sorting===");
		Set setComp = hm.entrySet();
		Iterator it = setComp.iterator();
		
		while(it.hasNext()) {
			Map.Entry me = (Map.Entry) it.next();
			System.out.println(me.getKey() + "-" + me.getValue());
		}
		
		System.out.println("===After sorting===");
		Map<Integer, String> map = sortByValues(hm);
		Set sortedSet = map.entrySet();
		Iterator i = sortedSet.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.println(me.getKey() + "-" + me.getValue());
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static HashMap sortByValues(HashMap hmap) {
		List list = new LinkedList(hmap.entrySet());
		Collections.sort(list, new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Comparable) ((Map.Entry)(o1)).getValue())
					.compareTo(((Map.Entry)(o2)).getValue());
			}
		});
		
		HashMap sortedHashMap = new LinkedHashMap();
		for(Iterator i = list.iterator(); i.hasNext();) {
			Map.Entry me = (Map.Entry)i.next();
			sortedHashMap.put(me.getKey(), me.getValue());
		}
		return sortedHashMap;
	}
	
}
