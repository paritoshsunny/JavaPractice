package com.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(9);
		ts.add(8);
		ts.add(7);
		ts.add(6);
		ts.add(9);		//this element will not add as duplicates are not allowed
		//ts.add(null);	// throw NullPointerException
		
		System.out.println(ts);
		Iterator<Integer> itr=ts.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
			if(i==7) {
				itr.remove();
				// ts.remove		//will throw ConcurrentModificationException
			}
		}
		System.out.println(ts);

	}

}
