package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListTrimToSizeMethod {

	public static void main(String[] args) {
		
		/**
		 * This method is used for memory optimization. It trims the capacity 
		 * of array list to its list size.
		 * 
		 * SYNTAX: public void trimToSize();
		 */
		
		// Initial array list of capacity 5
		ArrayList<Integer> al = new ArrayList<Integer>(50);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		
		al.trimToSize();
		System.out.println("Array List size after trimming: "+al);
		
	}

}
