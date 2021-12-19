package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ArraylistTest {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		System.out.println(list.get(3));

	}

}
