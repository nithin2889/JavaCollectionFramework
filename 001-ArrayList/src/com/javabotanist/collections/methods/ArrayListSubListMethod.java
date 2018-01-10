package com.javabotanist.collections.methods;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubListMethod {

	public static void main(String[] args) {
		
		/**
		 * This method is used to get a sub list from an existing array list.
		 * Here, the fromIndex is inclusive and toIndex is exclusive. 
		 * 
		 * The subList will throw IndexOutOfBoundsException if fromIndex < 0 || toIndex > size of list.
		 * The subList will throw IllegalArgumentException if fromIndex > toIndex.
		 * 
		 * SYNTAX: public List<T> subList(int fromIndex, int toIndex);
		 */
		
		// Initial array list of capacity 5
		ArrayList<String> al = new ArrayList<>();
		al.add("Sansa");
		al.add("Arya");
		al.add("Jon");
		al.add("Lannister");
		al.add("Hodor");
		
		System.out.println("Original Array List content is: "+al);
		
		List<String> subList = al.subList(1, 4);
		System.out.println("Sublist stored in the list "+subList);
		System.out.println("=====================================");
		ArrayList<String> al2 = new ArrayList<>(al.subList(1, 4));
		System.out.println("Sublist stored in the ArrayList "+al2);
		
	}

}
