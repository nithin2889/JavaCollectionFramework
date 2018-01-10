package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListGetMethod {

	public static void main(String[] args) {

		/**
		 * This method fetches the element from the list by specifying the index.
		 * It will return the element if found else it would return null.
		 * If the index is less than 0 or greater than the list size, then it would 
		 * throw an exception: IndexOutOfBoundsException
		 * 
		 * SYNTAX : public Element get(int index);
		 */

		// Initial array list of capacity 5
		ArrayList<String> al = new ArrayList<>();
		al.add("AA");
		al.add("BB");
		al.add("CC");
		al.add("DD");
		al.add("EE");
		
		// Fetching the element
		System.out.println("Element at index 1 is: " + al.get(1));
		
		System.out.println("Element at index 4 is: " + al.get(4));

		// Throws IndexOutOfBoundsException
		System.out.println("Element at index -1 is: " + al.get(-1));
		
	}

}
