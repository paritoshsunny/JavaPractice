package com.java.collection;

import java.util.Iterator;
import java.util.PriorityQueue;

import com.java.Address;
import com.java.Employee;

public class PriorityQueueTest {

	public static void main(String[] args) {
		
//		PriorityQueue<Integer> pq =new PriorityQueue<>();
//		pq.offer(2);
//		pq.offer(5);
//		pq.offer(4);
//		pq.offer(6);
//		pq.offer(3);
//		pq.offer(1);
//		System.out.println(pq);
//		System.out.println(pq.poll());
//		System.out.println(pq.poll());
//		System.out.println(pq.poll());
//		System.out.println(pq.poll());
//		System.out.println(pq.poll());
		MyComparator compare=new MyComparator();
		PriorityQueue<Employee> pq = new PriorityQueue<>(compare);
		pq.offer(new Employee(1, "A", 900, new Address(101, "abc", "pqr", "xyz")));
		pq.offer(new Employee(3, "C", 400, new Address(101, "abc", "pqr", "xyz")));
		pq.offer(new Employee(2, "Z", 700, new Address(101, "abc", "pqr", "xyz")));
		pq.offer(new Employee(5, "K", 600, new Address(101, "abc", "pqr", "xyz")));
		pq.offer(new Employee(4, "E", 100, new Address(101, "abc", "pqr", "xyz")));
		
//		Iterator<Employee> itr = pq.iterator();
//		while(itr.hasNext()){
//			Employee e = itr.next();
//			pq.offer(new Employee(5, "F", 150));		// fail-fast
//		}
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}

}
