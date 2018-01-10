package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListEnsureCapacityMethod {

	public static void main(String[] args) {

		/**
		 * Consider a scenario where there is a need to insert huge number of elements
		 * into an already full array list. As we know, ArrayList is a dynamically
		 * growing array and hence when we insert elements in bulk it would
		 * automatically resize internally, but this would result in poor performance.
		 * 
		 * SYNTAX : public void ensureCapacity(int minCapacity);
		 */

		// Initial array list of capacity 5
		ArrayList<String> al = new ArrayList<>();
		al.add("AA");
		al.add("BB");
		al.add("CC");
		al.add("DD");
		al.add("EE");

		// Increases array list capacity by 5
		al.ensureCapacity(5);

		// Adding 3 extra array list elements
		al.add("FF");
		al.add("GG");
		al.add("HH");

		System.out.println("Printing all the elements in the ArrayList: ");
		for (String alpha : al) {
			System.out.println(alpha);
		}

	}

}
