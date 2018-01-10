package com.javabotanist.model;

import java.util.Comparator;

public class Student_Comparator {
	
	private String studentname;
	private int rollno;
	private int studentage;
	
	public Student_Comparator(String studentname, int rollno, int studentage) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.studentage = studentage;
	}
	
	public static Comparator<Student_Comparator> studentNameComparator = new Comparator<Student_Comparator>() {
		public int compare(Student_Comparator student1, Student_Comparator student2) {
			String studentName1 = student1.getStudentname().toUpperCase();
			String studentName2 = student2.getStudentname().toUpperCase();
			
			// ascending order
			return studentName1.compareTo(studentName2);
			
			// descending order
			// return studentName2.compareTo(studentName1);
		}
	};
	
	public static Comparator<Student_Comparator> studentRollComparator = new Comparator<Student_Comparator>() {
		public int compare(Student_Comparator s1, Student_Comparator s2) {
			int roll1 = s1.getRollno();
			int roll2 = s2.getRollno();
			
			// ascending order
			return roll1 - roll2;
			
			// descending order
			// return roll2 - roll1;
		}
	};
	
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}
	
}
