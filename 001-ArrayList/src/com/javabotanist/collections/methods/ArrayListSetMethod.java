package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListSetMethod {

	public static void main(String[] args) {

		/**
		 * This method updates an existing element in the list by specifying the index.
		 * It will return the element if found else it would return null.
		 * If the index is less than 0 or greater than the list size, then it would 
		 * throw an exception: IndexOutOfBoundsException
		 * 
		 * SYNTAX : public Element set(int index, Element e);
		 */

		// Initial array list of capacity 5
		ArrayList<String> al = new ArrayList<>();
		al.add("AA");
		al.add("BB");
		al.add("CC");
		al.add("DD");
		al.add("EE");
		
		// Fetching the element
		System.out.println("Array List before updating: " + al);
		// updating first element
		al.set(1, "ZZ");
		// updating second element
		al.set(2, "GG");
		// updating third element
		al.set(3, "HH");
		
		System.out.println("Array List before updating: " + al);
		
	}

}
