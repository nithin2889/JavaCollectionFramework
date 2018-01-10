package com.javabotanist.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ==================
 * ArrayList methods:
 * ==================
 * 1.  add(Object o);
 * 2.  add(int index, Object o);
 * 3.  remove(Object o);
 * 4.  remove(int index);
 * 5.  set(int index, Object o);
 * 6.  get(int index);
 * 7.  indexOf(Object o);
 * 8.  size();
 * 9.  contains(Object o);
 * 10. clear();
 * =================
 */

public class ArrayListTest_002 {

	public static void main(String[] args) {
		
		System.out.println("============================================================================");
		
		// Sorting an ArrayList of String in alphabetical order.
		System.out.println("Sorting an ArrayList of String in alphabetical order.");
		ArrayList<String> countries = new ArrayList<String>();
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("China");
		countries.add("Denmark");
		
		// Unsorted list
		System.out.println("Before sorting, the list is: ");
		for(String country : countries) {
			System.out.println(country);
		}
		
		// Sorting the list of countries
		Collections.sort(countries);
		
		// Sorted list
		System.out.println("\nAfter sorting, the list is");
		for(String country : countries) {
			System.out.println(country);
		}
		
		System.out.println("============================================================================");
		
		// Sorting an ArrayList of Integers in descending order.
		System.out.println("Sorting an ArrayList of Integers in ascending order.");
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(11);
		numbers.add(8);
		numbers.add(1);
		numbers.add(0);
		numbers.add(3);
		
		// Unsorted list
		System.out.println("Before sorting, the list is: ");
		for(Integer number : numbers) {
			System.out.println(number);
		}
		
		// Sorting the list of countries
		Collections.sort(numbers);
		
		// Sorted list
		System.out.println("\nAfter sorting, the list is");
		for(Integer number : numbers) {
			System.out.println(number);
		}
		
		System.out.println("============================================================================");
		
		// Sorting an ArrayList of String in descending order.
		System.out.println("Sorting an ArrayList of String in descending order.");
		ArrayList<String> alphaList = new ArrayList<String>();
		alphaList.add("AA");
		alphaList.add("ZZ");
		alphaList.add("KK");
		alphaList.add("JJ");
		alphaList.add("GG");
		
		System.out.println("\n Before sorting the list is: ");
		for(String alpha : alphaList) {
			System.out.println(alpha);
		}
		
		Collections.sort(alphaList, Collections.reverseOrder());
		
		System.out.println("\n After sorting the list is: ");
		for(String alpha : alphaList) {
			System.out.println(alpha);
		}
		
	}

}
