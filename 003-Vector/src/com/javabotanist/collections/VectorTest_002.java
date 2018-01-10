package com.javabotanist.collections;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class VectorTest_002 {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>(5);
		v1.addElement("AA");
		v1.addElement("BB");
		v1.addElement("CC");
		v1.addElement("DD");
		
		Vector<String> v2 = new Vector<String>(5);
		v2.addElement("11");
		v2.addElement("22");
		v2.addElement("33");
		v2.addElement("44");
		v2.addElement("55");
		v2.addElement("66");
		
		System.out.println("Vector v2 before copy "+v2);
		Collections.copy(v2, v1);
		System.out.println("Vector v2 after copy "+v2);
		
		System.out.println("===========================");
		
		Vector<String> v3 = new Vector<String>(5);
		v3.addElement("NN");
		v3.addElement("II");
		v3.addElement("TT");
		v3.addElement("HH");
		v3.addElement("II");
		v3.addElement("NN");
		
		List<String> subList = v3.subList(1, 6);
		
		System.out.println("SubList elements");
		for(int i=0; i<subList.size(); i++) {
			System.out.println(subList.get(i));
		}
		
		System.out.println("===========================");
		System.out.println("index of element II is: "+v3.indexOf("II"));
		System.out.println("index of element II is: "+v3.indexOf("II", 1));
		System.out.println("===========================");
		System.out.println("index of element II is: "+v3.lastIndexOf("HH"));
		System.out.println("index of element II is: "+v3.lastIndexOf("HH", 3));
		System.out.println("===========================");
		
	}

}
