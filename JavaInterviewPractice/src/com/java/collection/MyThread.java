package com.java.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class MyThread {
	
	@Override
	public int hashCode() {
		return 1;
	}
	
	public static void main(String[] args) {
		
//		HashMap<Test, String> map = new HashMap<>();
//		map.put(new Test(), "One");
//		map.put(new Test(), "Two");
//		
//		
//		map.get(new test());
		
//		HashMap<Employee, String> map= new HashMap<Employee, String>();
//		map.put(new Employee(1, "Jack", 10.0f), "ABC");
//		map.put(new Employee(1, "khss", 10.0f), "ABC");
//		System.out.println(map.size());
		
		TreeMap<Employee, String> map = new TreeMap<>();
		map.put(new Employee(1, "sam", 10f), "sam");
		map.put(new Employee(1, "sda", 10f), "safdgm");
		map.put(new Employee(1, "dfd", 1f), "dggf");
		System.out.println(map.size());
		
		
	}

}
