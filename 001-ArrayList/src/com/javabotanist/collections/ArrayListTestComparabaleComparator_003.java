package com.javabotanist.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.javabotanist.model.Student_Comparable;
import com.javabotanist.model.Student_Comparator;

/**
 * ================== ArrayList methods: ================== 1. add(Object o); 2.
 * add(int index, Object o); 3. remove(Object o); 4. remove(int index); 5.
 * set(int index, Object o); 6. get(int index); 7. indexOf(Object o); 8. size();
 * 9. contains(Object o); 10. clear(); =================
 */

public class ArrayListTestComparabaleComparator_003 {

	public static void main(String[] args) {
		
		System.out.println("============================================================================");
		
		// Sorting an ArrayList of String in alphabetical order.
		// Comparable provides Default Natural Sorting Order.
		System.out.println("Sorting an ArrayList of Student object with Comparable");
		ArrayList<Student_Comparable> students = new ArrayList<Student_Comparable>();
		students.add(new Student_Comparable("Nithin", 026, 27));
		students.add(new Student_Comparable("Akhila", 002, 26));
		students.add(new Student_Comparable("Martia", 024, 29));
		
		// Collections.sort(students);
		
		for (Student_Comparable student : students) {
			System.out.println(student.getStudentname() + "--" + student.getStudentage());
		}
		
		System.out.println("============================================================================");
		
		// Sorting an ArrayList of String in alphabetical order.
		// Comparator provides Customized Sorting Order.
		System.out.println("Sorting an ArrayList of Student object with Comparator");
		ArrayList<Student_Comparator> students2 = new ArrayList<Student_Comparator>();
		students2.add(new Student_Comparator("Nithin", 026, 27));
		students2.add(new Student_Comparator("Akhila", 002, 26));
		students2.add(new Student_Comparator("Martia", 024, 29));
		
		// Collections.sort(students2, Student_Comparator.studentRollComparator);
		Collections.sort(students2, Student_Comparator.studentNameComparator);
		
		for (Student_Comparator student : students2) {
			System.out.println(student);
		}
		
	}
	
}
