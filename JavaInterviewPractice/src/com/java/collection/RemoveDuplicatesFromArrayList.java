package com.java.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(null);
		list.add(4);
		list.add(4);		
		list.add(null);
		list.add(5);
		System.out.println(list);
		LinkedHashSet<Integer> set1 =new LinkedHashSet<>(list);   // LinkedHashSet maintain insertion order
		System.out.println(set1);
		ArrayList<Integer> list1 = new ArrayList<>(set1);
		System.out.println(list1);
	}

}
