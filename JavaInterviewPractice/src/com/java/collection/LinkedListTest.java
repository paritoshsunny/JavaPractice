package com.java.collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
		list.addFirst(0);
		list.addLast(2);
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		list.removeFirst();
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		
		list.add(9);
		list.addFirst(8);
		list.add(1, 6);
		list.addLast(9);
		list.add(4, 5);
		System.out.println(list);
		
		list.removeFirstOccurrence(9);
		System.out.println(list);
		
		//Using LinkedList as Stack
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.push(0);
		list1.push(1);
		list1.push(2);
		System.out.println(list1);
		list1.pop();
		System.out.println(list1);
		
		
	}

}
