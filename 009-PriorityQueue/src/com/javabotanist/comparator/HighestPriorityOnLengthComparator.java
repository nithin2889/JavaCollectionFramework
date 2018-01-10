package com.javabotanist.comparator;

import java.util.Comparator;

public class HighestPriorityOnLengthComparator implements Comparator<String> {

	@Override
	public int compare(String x, String y) {
		// returns the string length in ascending order.
		return (x.length() - y.length());
		
		// returns the string length in descending order.
		// return -(x.length() - y.length());
	}
	
}
