package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListIsEmptyfMethod {

	public static void main(String[] args) {

		/**
		 * This method is to check whether the list is empty or not.
		 * 
		 * SYNTAX : public boolean isEmpty();
		 */

		// Initial array list of capacity 5
		ArrayList<String> al = new ArrayList<>();
		al.add("AA");
		al.add("BB");
		al.add("CC");
		al.add("DD");
		al.add("EE");
		
		// Checking before clearing whether the list is empty or not.
		System.out.println("Is the list is empty: "+al.isEmpty());
		
		// Clearing all the elements from the list
		al.clear();
		
		// Checking after clearing whether the list is empty or not.
		System.out.println("Is the list is empty: "+al.isEmpty());
		
	}

}
