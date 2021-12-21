package com.java.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SyncArrayList {
	
	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>(new Integer[] {1,3,2,5,4});
		Iterator<Integer> iterator = list.iterator();
		list.add(6);
		while(iterator.hasNext()) {
			Integer n=iterator.next();
			System.out.println(n);
			if(n==2) {
				list.remove(2);
			}
		}
		System.out.println(list);
		
		
		
	}

}
