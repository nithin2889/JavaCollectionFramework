package com.javabotanist.collections;

import java.util.TreeSet;

public class TreeSetTest_001 {
	
	/**
	 * TreeSet:
	 * 1. TreeSet is used to sort the elements, and by default the elements are sorted in ascending order.
	 * 2. TreeSet is not synchronized, but can be made synchronized by explicitly calling Collections.synchronizedSet().
	 * 3. TreeSet doesn't allow null elements.
	 * 4. TreeSet doesn't allow duplicates.
	 */

	public static void main(String[] args) {
		
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("Hodor");
		tSet.add("Sansa");
		tSet.add("Sansa"); // Can't be inserted
		tSet.add("Jon");
		// tSet.add(1); -> ClassCastException occurs
		tSet.add("Arya");
		tSet.add("Tyrion");
		tSet.add("Cersei");
		// tSet.add(null); -> NullPointerException occurs
		
		for(String names : tSet) {
			System.out.println(names);
		}
		
	}
	
}
