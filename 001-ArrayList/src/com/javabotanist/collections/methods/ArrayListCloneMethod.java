package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListCloneMethod {

	public static void main(String[] args) {

		/**
		 * This method is used to clone an ArrayList to another one.
		 * The interesting point to note here is even though we would add or remove elements 
		 * from the original ArrayList, the cloned ArrayList will not be affected. This shows that
		 * clone method returns a shallow copy of the ArrayList.
		 * 
		 * SYNTAX : public Object clone();
		 */
		
		// Initial array list of capacity 5
		ArrayList<String> al = new ArrayList<>();
		al.add("Apple");
		al.add("Orange");
		al.add("Mango");
		al.add("Grapes");
		
		System.out.println("ArrayList: "+al);
		
		ArrayList<String> al2 = (ArrayList<String>) al.clone();
		System.out.println("Shallow Copy: "+al2);
		
		al.add("Fig");
		al.remove("Orange");
		
		System.out.println("Original ArrayList: "+al);
		System.out.println("Cloned ArrayList: "+al2);
		
	}

}
