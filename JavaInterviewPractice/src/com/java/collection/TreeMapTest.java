package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
		map.put(1, "D");
		map.put(2, "C");
		map.put(3, "A");
		map.put(4, "X");
//		map.put(null, "O");		// throw exception as null key is not allowed in TreeMap
		
		System.out.println(map);
		
		TreeMap<Integer, String> m = new TreeMap<>();
		m.put(1, "E");
		m.put(2, "W");
		m.put(3, "A");
		m.put(4, "X");
		m.put(5, "O");
		System.out.println(m);
		
		map.putAll(m);		// overwrite the values of key 1 and 2 of map
		System.out.println(map);
		
		
//		****************************************************************************************************
//		Sorting based on values
//		****************************************************************************************************
		

		Set<Entry<Integer, String>> entrySet=map.entrySet();
		List<Entry<Integer, String>> list = new ArrayList<>(entrySet);
		
		// creating comparator object to sort TreeMap by Value
		
		Comparator<Entry<Integer, String>> c = new Comparator<>() {
			@Override
			public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {

				return o1.getValue().compareTo(o2.getValue());
			}
		};
		
		Collections.sort(list, c);
		System.out.println(list);

	}

}
