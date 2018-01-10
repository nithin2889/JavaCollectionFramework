package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListRemoveMethod {

	public static void main(String[] args) {
		
		/**
		 * This method is used to remove the specified element by index.
		 * If the element is not found it would return -1. 
		 * If the index is less than zero or greater than the size of the list
		 * it will throw IndexOutOfBoundsException
		 * 
		 * SYNTAX : public Object remove(int index);
		 * 
		 * This method is used to remove element by specifying the object.
		 * If the element is not found it will return false. If there are duplicate
		 * elements present in the list it removes the first occurence of the specified element.
		 * 
		 * SYNTAX : public boolean remove(Object o);
		 */
		
		// Initial array list of capacity 5
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(22);
		al.add(21);
		al.add(1);
		al.add(21);
		
		System.out.println("Before removing, the current list: "+al);
		
		// Removing a particular element by index
		System.out.println("Removing the element for index 1: "+al.remove(1));
		System.out.println("Removing the element for index 3: "+al.remove(3));
		
		System.out.println("After removing, the current list: "+al);
		
		System.out.println("==================================================");
		System.out.println("Removing the element for specified object");
		ArrayList<String> all = new ArrayList<>();
		all.add("AA");
		all.add("BB");
		all.add("CC");
		all.add("DD");
		all.add("EE");
		all.add("FF");
		System.out.println("Before removing the string "+all);
		
		all.remove("AA");
		all.remove("CC");
		all.remove("EE");
		
		boolean gg = all.remove("GG");
		System.out.println("Element GG was removed? "+gg);
		
		System.out.println("After removing the string"+all);
		
		all.removeAll(all);
		System.out.println("After removing all the elments"+all);
	}

}
