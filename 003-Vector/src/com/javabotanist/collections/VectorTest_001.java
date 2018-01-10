package com.javabotanist.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest_001 {

	/**
	 * 
	 * 1. Vector class methods are synchronized by default. 
	 * 2. Vector performance is low when compared to ArrayList as it is thread-safe, 
	 * 	  and only one thread can access at any given point of time. 
	 * 3. Vector's underlying data structure is Resizable-Array or Growable Array. 
	 * 4. Vector was introduced in Java 1.0 and is it is considered legacy code. 
	 * 5. Duplicates are allowed. 
	 * 6. Insertion order is maintained. 
	 * 7. NULL insertion is possible.
	 * 
	 * Vector methods:
	 * 1. addElement(Object o);
	 * 2. capacity();
	 * 3. size();
	 * 4. contains(Object o);
	 * 5. containsAll(Collection c);
	 * 6. setSize(int size);
	 * 7. elementAt(int index);
	 * 8. get(int index);
	 * 9. firstElement();
	 * 10. lastElement();
	 * 11. isEmpty();
	 * 12. removeElement(Object o);
	 * 13. removeAll(Collection c);
	 * 14. setElementAt(Object o, int index);
	 * 
	 */
	public static void main(String[] args) {
		
		// First approach of creating a Vector
		// Vector<String> v1 = new Vector<>();

		// First approach of creating a Vector
		Vector<String> v2 = new Vector<String>(5);
		v2.addElement("AA");
		v2.addElement("BB");
		v2.addElement("CC");
		v2.addElement("DD");
		
		System.out.println("Size is: "+v2.size());
		System.out.println("Capacity is: "+v2.capacity());
		
		v2.addElement("EE");
		v2.addElement("FF");
		
		System.out.println("Size is: "+v2.size());
		System.out.println("Capacity is: "+v2.capacity());
		
		Enumeration<String> en = v2.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement() + " ");
		}
		
		String subList = v2.subList(1, 4).get(2);
		System.out.println("===="+subList+"====");
		
		// First approach of creating a Vector
		// Vector<String> v3 = new Vector<>(5, 6);
		
	}

}
