package com.javabotanist.model;

public class Student_Comparable implements Comparable<Object> {
	
	private String studentname;
	private int rollno;
	private int studentage;
	
	public Student_Comparable(String studentname, int rollno, int studentage) {
		super();
		this.studentname = studentname;
		this.rollno = rollno;
		this.studentage = studentage;
	}
	
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
	public int compareTo(Object comparesTo) {
		int age = ((Student_Comparable)comparesTo).getStudentage();
		// For ascending order
		return this.studentage - age;
		
		// For descending order
		// return age-this.studentage;
	}

	@Override
	public String toString() {
		return "Student [studentname=" + studentname + ", rollno=" + rollno + ", studentage=" + studentage + "]";
	}
	
}
