package com.java.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {

	public static void main(String[] args) {
		

		ConcurrentHashMap<Integer, Employee> map = new ConcurrentHashMap<>(16,0.75f,18);// If InitialCapacity < ConcurrencyLevel
																						// then it will create the ConcurrentHashMap of 
																						// InitialCapacity = ConcurrencyLevel as defined in 
																						// public ConcurrentHashMap(int initialCapacity,
        																				//	float loadFactor, int concurrencyLevel) constructor
		
		
		Employee e1=new Employee(1, "A", 150);
		Employee e2=new Employee(5, "B", 80);
		Employee e3=new Employee(4, "C", 50);
		Employee e4=new Employee(7, "D", 110);
		Employee e5=new Employee(2, "E", 10);
		Employee e6=new Employee(9, "F", 130);
		Employee e7=new Employee(3, "G", 20);
		
		
		map.put(e1.id, e1);
		map.put(e2.id, e2);
		map.put(e3.id, e3);
		map.put(e4.id, e4);
		map.put(e5.id, e5);
		map.put(e6.id, e6);
		map.put(e7.id, e7);
		
//		System.out.println(map);
//		
//		for(Integer itr: map.keySet()) {
//			System.out.println("Key: "+ itr +" Value: "+ map.get(itr));
//		}
		
		Set<Map.Entry<Integer, Employee>> set= map.entrySet();
		Iterator<Map.Entry<Integer, Employee>> itr1 = set.iterator();
		
		while(itr1.hasNext()) {
			Map.Entry<Integer, Employee> entry=itr1.next();
			System.out.println(entry);
		}
			
		
		
	}

}
