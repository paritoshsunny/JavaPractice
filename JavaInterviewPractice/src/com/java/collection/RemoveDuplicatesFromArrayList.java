package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(2);
		list.add(2);		
		list.add(8);
		list.add(5);
		
		// Removing duplicates from ArrayList
		
		System.out.println(list);
		LinkedHashSet<Integer> set1 =new LinkedHashSet<>(list);   // using LinkedHashSet as it maintain insertion order
		System.out.println(set1);
		ArrayList<Integer> list1 = new ArrayList<>(set1);
		System.out.println(list1);
		
		
		Collections.reverse(list1);   // Reverse an ArrayList using Collections class reverse() method
		Collections.synchronizedList(list1);	// Synchronize an ArrayList using Collections class synchronizedList() method
		Collections.sort(list1);			// Sort an ArrayList using Collections class sort() method
		System.out.println(list1);
		Collections.reverse(list1);			// Reverse an ArrayList using Collections class reverse() method
		System.out.println(list1);
		
		Collection<Integer> readOnlyArrayList = Collections.unmodifiableCollection(list1); // creating read only ArrayList
		list1.add(0);
		System.out.println(list1);
		list1.remove(0);
		System.out.println(list1);
		readOnlyArrayList.add(1);		// throw exception as readOnlyArrayList is unmodifiable
		readOnlyArrayList.clear();		
		
		System.out.println(readOnlyArrayList);
		
	}

}
