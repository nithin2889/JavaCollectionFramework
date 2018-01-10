package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListLastIndexOfMethod {

	public static void main(String[] args) {

		/**
		 * This method is used to find the index of the last occurrence of the specified element.
		 * If the element is not found it would return -1
		 * 
		 * SYNTAX : public int lastIndexOf(Object o);
		 */

		// Initial array list of capacity 5
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(22);
		al.add(21);
		al.add(1);
		al.add(21);
		
		// Finding the index of a particular element
		System.out.println("Last Index of 1: "+al.lastIndexOf(1));
		System.out.println("Last Index of 21: "+al.lastIndexOf(21));
	}

}
