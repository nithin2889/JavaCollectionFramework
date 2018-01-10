package com.javabotanist.collections.methods;

import java.util.ArrayList;

public class ArrayListAddAllMethod {

	public static void main(String[] args) {
		
		/**
		 * If we want to copy all the elements of a specified Collection to the current list in question then 
		 * we can use addAll method shown below.
		 * 
		 * SYNTAX: public boolean addAll(Collection c);
		 */
		System.out.println("======================================================================");
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("AA");
		al1.add("BB");
		al1.add("CC");
		al1.add("DD");
		
		System.out.println("Before adding, the elements currently are: "+al1);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("EE");
		al2.add("FF");
		al2.add("GG");
		al2.add("HH");
		System.out.println("Before adding, the elements currently are: "+al2);
		
		al1.addAll(al2);
		
		System.out.println("After adding, the elements currently are: "+al1);
		System.out.println("======================================================================");
		
		/**
		 * If we want to copy all the elements of a specified Collection to the current list in question
		 * starting from the specified position then use addAll method shown below.
		 * 
		 * SYNTAX: public boolean addAll(int index, Collection c);
		 */
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("II");
		al3.add("JJ");
		al3.add("KK");
		al3.add("LL");
		
		System.out.println("Before adding, the elements at the given position for al3: "+al3);
		
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("MM");
		al4.add("NN");
		al4.add("OO");
		al4.add("PP");
		System.out.println("Before adding, the elements at the given position for al4: "+al4);
		
		al3.addAll(2, al4);
		
		System.out.println("After adding, the elements at the given position: "+al3);
		System.out.println("======================================================================");
		
	}

}
