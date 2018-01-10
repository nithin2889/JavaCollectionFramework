package com.javabotanist.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * ==================
 * ArrayList methods:
 * ==================
 * 1.  add(Object o);
 * 2.  add(int index, Object o);
 * 3.  remove(Object o);
 * 4.  remove(int index);
 * 5.  set(int index, Object o);
 * 6.  get(int index);
 * 7.  indexOf(Object o);
 * 8.  size();
 * 9.  contains(Object o);
 * 10. clear();
 * =================
 */

public class ArrayListTest_001 {

	public static void main(String[] args) {
		ArrayList<String> obj1 = new ArrayList<String>();
		
		// Adding string values into ArrayList.
		System.out.println("Adding string values into ArrayList.");
		obj1.add("India");
		obj1.add("USA");
		obj1.add(null);
		obj1.add(null);
		obj1.add("Italy");
		
		System.out.println("Currently the Array List contains:"+obj1);
		
		// Adding elements at the given index
		System.out.println("\nAdding elements at the given index.");
		obj1.add(5, "France");
		obj1.add(6, "Canada");
		
		System.out.println("Currently the Array List contains:"+obj1);
		
		// Removing elements from the ArrayList
		System.out.println("\nRemoving elements from the ArrayList.");
		obj1.remove("Germany");
		obj1.remove("Italy");
		
		// Removing elements at the given index
		System.out.println("\nRemoving elements at the given index");
		obj1.remove(1);
		obj1.remove(2);
		
		System.out.println("Currently the Array List contains:"+obj1);
		
		// Method 1 - Initializing an ArrayList using Arrays.asList
		System.out.println("\nMethod 1 - Initializing an ArrayList using Arrays.asList");
		ArrayList<String> obj2 = new ArrayList<String>(Arrays.asList("Nithin","Prasad","Akhila","Martia"));
		System.out.println("Elements are: "+obj2);
		
		// Method 2 - Initializing an ArrayList using an Anonymous Inner Class
		System.out.println("\nMethod 2 - Initializing an ArrayList using an Anonymous Inner Class");
		ArrayList<String> obj3 = new ArrayList<String>() {{
			add("Bangalore");
			add("Mysore");
			add("Mangalore");
		}};
		System.out.println("Elements are: "+obj3);
		
		// Method 3: Initializing an ArrayList using Collections.ncopies
		// Creates an array list of 10 elements with a default value 5 for each element.
		System.out.println("\nMethod 3 - Initializing an ArrayList using Collections.ncopies");
		ArrayList<Integer> obj4 = new ArrayList<Integer>(Collections.nCopies(10, 5));
		System.out.println("Elements are: "+obj4);
	}

}
