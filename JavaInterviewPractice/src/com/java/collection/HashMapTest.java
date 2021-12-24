package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();
		map.put(0, null);
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "Three");
		map.put(4, "Four");
		System.out.println(map.hashCode());

		System.out.println(map);
		System.out.println(map.get(0));
		map.put(0, "Zero"); // This will re-write the value of key 0
		System.out.println(map);

		HashMap<Integer, String> m = new HashMap<>();
		m.put(5, "five");
		m.put(6, "Six");
		System.out.println(m.hashCode());

		map.putAll(m);
		System.out.println(map);
		m.putAll(map);
		System.out.println(m);

		System.out.println(map.equals(m));
		System.out.println(map.hashCode());
		System.out.println(m.hashCode()); // hashCode of m is same as map earlier it is not same		

	}

}
