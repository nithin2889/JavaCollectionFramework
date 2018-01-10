package com.javabotanist.collections;

import java.util.PriorityQueue;

import com.javabotanist.comparator.HighestPriorityOnLengthComparator;

public class PriorityQueueTest_001 {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<String>(15, new HighestPriorityOnLengthComparator());
		pq.add("Jon Snow");
		pq.add("Daenerys Targaryen");
		pq.add("Sansa Stark");
		pq.add("Arya Stark");
		pq.add("Tyrion Lannister");
		
		while(pq.size() != 0) {
			System.out.println(pq.poll());
		}
		
		// remove() method retrieves and removes the head element in the Queue. If Queue is empty will throw NoSuchElementFoundException.
		// System.out.println(pq.remove());
		
		// poll() method is same as remove(), but it will return null if Queue is empty.
		// System.out.println(pq.poll());
		
		// element() method returns the head element. If Queue is empty will throw NoSuchElementFoundException.
		// System.out.println(pq.element());
		
		// peek() method retrieves and removes the head element of the Queue, but will return null if Queue is empty.
		// System.out.println(pq.peek());
		
	}

}
