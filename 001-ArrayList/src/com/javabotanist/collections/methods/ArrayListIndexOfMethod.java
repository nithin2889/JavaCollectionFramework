package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListIndexOfMethod {

	public static void main(String[] args) {

		/**
		 * This method is used to find the index of a particular element
		 * 
		 * SYNTAX : public int indexOf(Object o);
		 */

		// Initial array list of capacity 5
		ArrayList<String> al = new ArrayList<>();
		al.add("AA");
		al.add("BB");
		al.add("CC");
		al.add("DD");
		al.add("EE");
		
		// Finding the index of a particular element
		System.out.println("Index of AA: "+al.indexOf("AA"));
		
	}

}
