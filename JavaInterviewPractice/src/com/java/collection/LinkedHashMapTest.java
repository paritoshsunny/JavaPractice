package com.java.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> map =new LinkedHashMap<>();
		map.put(0, 0);
		map.put(5, 5);
		map.put(9, 9);
		
		System.out.println(map);
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.getOrDefault(1, 3));

	}

}
