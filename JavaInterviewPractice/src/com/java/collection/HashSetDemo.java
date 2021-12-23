package com.java.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hs=new HashSet<>(); //will internally create a HashMap with default constructor  
		hs.add(0);   //will internally call the put method of HashMap
		hs.add(9);
		hs.add(8);	// this element will not add as duplication is not allowed
		hs.add(5);
		hs.add(2);
		hs.remove(5);	//will internally call the remove method of HashMap
		hs.add(null);
		hs.add(7);
		hs.add(4);
		hs.add(3);
		Iterator<Integer> itr = hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());  //this print will not maintain insertion order
		}
	}

}
