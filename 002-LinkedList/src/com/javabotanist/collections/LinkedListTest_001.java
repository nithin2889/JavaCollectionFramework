package com.javabotanist.collections;

import java.util.LinkedList;

public class LinkedListTest_001 {
	
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
		list.add(null);
		list.add(null);
		list.add(null);
		
		System.out.println("===========================================");
		System.out.println("Current list content before adding "+list);
		list.add("EE");
		System.out.println("Current list content after adding "+list);
		
		System.out.println("===========================================");
		list.add(0, "ZZ");
		System.out.println("Current list content after adding at the specified index "+list);
		System.out.println("===========================================");
		
		list.addFirst("00");
		System.out.println("Current list content after adding at the first index "+list);
		list.addLast("99");
		System.out.println("Current list content after adding at the last index "+list);
		
		System.out.println("===========================================");
		System.out.println(list.remove());
		System.out.println("Current list content after remove() "+list);
		System.out.println("===========================================");
		
		System.out.println(list.removeFirst());
		System.out.println("Current list content after removeFirst() "+list);
		System.out.println(list.removeLast());
		System.out.println("Current list content after removeLast() "+list);
		System.out.println("===========================================");
		
		System.out.println(list.removeFirstOccurrence("CC"));
		System.out.println("Current list content after removeFirstOccurrence(\"CC\") "+list);
		System.out.println("===========================================");
		System.out.println(list.removeLastOccurrence("EE"));
		System.out.println("Current list content after removeLastOccurrence(\"EE\") "+list);
		
		System.out.println(list.poll());
		System.out.println("Current list content after poll() "+list);
		
		System.out.println(list.pollFirst());
		System.out.println("Current list content after pollFirst() "+list);
		
		System.out.println(list.pollLast());
		System.out.println("Current list content after pollLast() "+list);
		
		System.out.println(list.peek());
		System.out.println("Current list content after peek() "+list);
		
		System.out.println(list.peekFirst());
		System.out.println("Current list content after peekFirst() "+list);
		
		System.out.println(list.peekLast());
		System.out.println("Current list content after peekLast() "+list);
		
		System.out.println(list.offer("NN"));
		System.out.println("Current list content after offer() "+list);
		
		System.out.println(list.offerFirst("II"));
		System.out.println("Current list content after offerFirst(\"II\") "+list);
		
		System.out.println(list.offerLast("TT"));
		System.out.println("Current list content after offerLast(\"TT\") "+list);
		
		list.push("HH");
		System.out.println("Current list content after push(\"HH\") "+list);
		
		System.out.println(list.pop());
		System.out.println("Current list content after pop() "+list);
		
	}

}
