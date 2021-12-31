package com.java.collection;

import java.util.HashMap;

public class ImmutableStudentTest {
	
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("Math", 80);
		map.put("English", 90);
		ImmutableStudentContainingCollections studentContainingCollections=new ImmutableStudentContainingCollections
							(101, "Walter", map);
		System.out.println(studentContainingCollections.getMarks().hashCode());
		System.out.println(studentContainingCollections.toString());
//		studentContainingCollections.getMarks().put("English", 100);
	}
}
