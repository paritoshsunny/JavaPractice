package com.java.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeFailFast {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(7);
		list.add(2);
		list.add(2);		
		list.add(8);
		list.add(5);
		
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
//			if(i==2) {
//				list.add(1);		// will throw ConcurrentModificationException
//			}
		}
		
		CopyOnWriteArrayList<Integer> list1 = new CopyOnWriteArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(4);
		list1.add(5);
		
		Iterator<Integer> itr1 = list1.iterator();
		
		while(itr1.hasNext()) {
			Integer i1 =  itr1.next();
			System.out.println(i1);
			if(i1==3) {
				list1.add(6);		// does not throw ConcurrentModificationException
			}
		}
		
		System.out.println(list1);
		
		
	}

}
