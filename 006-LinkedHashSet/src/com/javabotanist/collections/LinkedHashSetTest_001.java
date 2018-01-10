package com.javabotanist.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetTest_001 {
	
	/**
	 * LinkedHashSet:
	 * 1. LinkedHashSet maintains insertion order.
	 * 2. LinkedHashSet internal data structure is Linked List and Hastable.
	 * 3. LinkedHashSet allows one null value, but any subsequent insertions will be overwritten.
	 * 4. LinkedHashSet doesn't allow duplicates.
	 */
	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("AA");
		lhs.add("BB");
		lhs.add("CC");
		lhs.add("DD");
		lhs.add("EE");
		
		System.out.println("Current contents of LinkedHashSet: "+lhs);
		// Can add only one null value. Any more null insertions will be overwritten.
		lhs.add(null);
		lhs.add("FF");
		lhs.add("GG");
		lhs.add("HH");
		lhs.add("II");
		lhs.add("JJ");
		System.out.println("Current contents of LinkedHashSet after inserting null: "+lhs);
		
	}
	
}
