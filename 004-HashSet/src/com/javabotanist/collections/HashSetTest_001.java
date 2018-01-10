package com.javabotanist.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest_001 {
	
	/**
	 * HashSet: 
	 * 1. HashSet doesn't allow duplicates.
	 * 2. HashSet is not synchronized.
	 * 3. HashSet does not maintain insertion order.
	 * 4. HashSet can contain only one null value.
	 * 5. The iterator returned by this class is fail-fast, that is, any concurrent modifications
	 * 	  after creation of iterator by other means except iterator's remove method will result in
	 *    a ConcurrentModificationException.
	 *    
	 * HashSet methods:
	 * 1. add(Object o);
	 * 2. clear();
	 * 3. clone();
	 * 4. contains(Object o);
	 * 5. isEmpty();
	 * 6. size();
	 * 7. remove(Object o);
	 * 8. remove(Collection c);
	 */

	public static void main(String[] args) {
		
		HashSet<String> hset1 = new HashSet<String>();
		hset1.add("Apple");
		hset1.add("Mango");
		hset1.add("Banana");
		hset1.add("Pear");
		hset1.add("Fig");
		hset1.add("Strawberry");
		
		System.out.println("HashSet content before duplicates and null "+hset1);
		
		System.out.println("Trying to insert duplicates and null");
		
		hset1.add("Mango");
		hset1.add("Banana");
		/*hset1.add(null);
		hset1.add(null);*/
		
		System.out.println("HashSet content after duplicates and null "+hset1);
		
		System.out.println("Iterating HashSet using a while loop");
		
		Iterator<String> iterator = hset1.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("Iterating HashSet using a for-each loop");
		for (String hSetStr : hset1) {
			System.out.println(hSetStr);
		}
		
		System.out.println("Converting an HashSet to an Array");
		String[] hSetArr = new String[(hset1.size())];
		hset1.toArray(hSetArr);
		System.out.println("HashSet to Array");
		for(String arr : hSetArr) {
			System.out.println(arr);
		}
		
		System.out.println("Converting an HashSet to a TreeSet");
		Set<String> hSetTree = new TreeSet<String>(hset1);
		System.out.println("HashSet to TreeSet");
		for(String arr : hSetTree) {
			System.out.println(arr);
		}

		System.out.println("Converting an HashSet to an ArrayList/LinkedList");
		List<String> hSetList = new ArrayList<String>(hset1);
		for (String hsetlist : hSetList) {
			System.out.println(hsetlist);
		}
		
	}
	
}
