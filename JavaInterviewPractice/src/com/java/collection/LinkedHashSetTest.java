package com.java.collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs=new LinkedHashSet<>();
		lhs.add(9);
		lhs.add(4);
		lhs.add(8);
		lhs.add(5);
		lhs.add(0);
		
		System.out.println(lhs);
		
		Iterator<Integer> itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());  //this print maintain insertion order
		}
		

	}

}
