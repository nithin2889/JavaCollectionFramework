package com.javabotanist.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTest_002 {
	
	/**
	 * 
	 * LinkedList methods: Some methods are almost similar to the ArrayList
	 * 1. add(Object o);
	 * 2. add(int index, Object o);
	 * 3. addAll(Collection c);
	 * 4. addAll(int index, Collection c);
	 * 5. addFirst(Object o);
	 * 6. addLast(Object o);
	 * 7. get(int index);
	 * 8. getFirst();
	 * 9. getLast();
	 * 10. set(int index, Object o);
	 * 11. clear();
	 * 12. clone();
	 * 13. indexOf(Object o);
	 * 14. lastIndexOf(Object o);
	 * 15. contains(Object o);
	 * 16. remove();
	 * 17. remove(int index);
	 * 18. remove(Object o);
	 * 19. removeFirst();
	 * 20. removeLast();
	 * 21. removeFirstOccurence(Object o);
	 * 22. removeLastOccurence(Object o);
	 * 23. size();
	 * 24. poll();
	 * 25. pollFirst();
	 * 26. pollLast();
	 * 27. peek();
	 * 28. peekFirst();
	 * 29. peekLast();
	 * 30. offer(Object o);
	 * 31. offerFirst(Object o);
	 * 32. offerLast(Object o);
	 * 33. push(Object o);
	 * 34. pop();
	 * 
	 */

	public static void main(String[] args) {
		
		// Adding an element into the LinkedList
		LinkedList<String> list = new LinkedList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		list.add("EE");
		list.add("CC");
		list.add("GG");
		list.add("XX");
		
		System.out.println("===========================================");
		Iterator<String> iterator = list.iterator();
		
		System.out.println("List of elements ");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("===========================================");
		System.out.println("===========================================");
		System.out.println("===========================================");
		System.out.println("===========================================");
		ListIterator<String> listIterator = list.listIterator();
		
		System.out.println("List of elements in forward direction ");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println("List of elements in backward direction ");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("===========================================");
		System.out.println("List of elements in backward direction another approach ");
		Iterator<String> listDescendingIterator = list.descendingIterator();
		while(listDescendingIterator.hasNext()) {
			System.out.println(listDescendingIterator.next());
		}
	}

}
