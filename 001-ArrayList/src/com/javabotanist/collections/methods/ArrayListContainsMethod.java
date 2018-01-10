package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListContainsMethod {

	public static void main(String[] args) {

		/**
		 * This method is used to check the existence of a specified element in the list.
		 * Returns true is found else returns false.
		 * 
		 * SYNTAX : public boolean contains(Object element);
		 */

		// Initial array list of capacity 5
		ArrayList<String> al = new ArrayList<>();
		al.add("AA");
		al.add("BB");
		al.add("CC");
		al.add("DD");
		al.add("EE");
		
		// Checking the existence of the element
		System.out.println("Does CX exist in the list? \n"+al.contains("CX"));

	}

}
