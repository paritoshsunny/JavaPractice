package com.java.collection;

import java.util.PriorityQueue;

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
		pq.offer(new Employee(1, "A", 900));
		pq.offer(new Employee(3, "C", 400));
		pq.offer(new Employee(2, "Z", 700));
		pq.offer(new Employee(5, "K", 600));
		pq.offer(new Employee(4, "E", 100));
		
		System.out.println(pq);
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}

}
