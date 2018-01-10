package com.javabotanist.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_001 {

	public static void main(String[] args) {
		
		Deque<String> dq = new ArrayDeque<String>();
		dq.add("AA");
		dq.add("BB");
		dq.add("CC");
		dq.addFirst("ZZ");
		dq.addLast("YY");
		dq.add("DD");

		System.out.println("Elements inside the deque are: "+dq);
		
		// Removing first and last elements from the deque.
		System.out.println("First element removed is: "+dq.removeFirst());
		System.out.println("Last element removed is: "+dq.removeLast());
		
		System.out.println("\nElements inside the deque are: "+dq);
		
		// Polling first and last element from the deque.
		System.out.println("Polled first element is "+dq.pollFirst());
		System.out.println("Polled last element is "+dq.pollLast());
		
		System.out.println("\nElements inside the deque are: "+dq);
		
		// Peeking first and last element from the deque.
		System.out.println("Peeked first element is "+dq.peekFirst());
		System.out.println("Peeked last element is "+dq.peekLast());
		
		System.out.println("\nElements inside the deque are: "+dq);
		
		// Returning the head element from the deque.
		System.out.println("Returning the head element: "+dq.element());
		
		System.out.println("\nElements inside the deque are: "+dq);
		
	}

}
