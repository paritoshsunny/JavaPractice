package com.java.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class ImmutableStudentContainingCollections {
	
	private int id;
	private String name;
	private Map<String, Integer> marks;
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public Map<String, Integer> getMarks() {
		return marks;
	}

	public ImmutableStudentContainingCollections(int id, String name, HashMap<String, Integer> marks) {
		this.id = id;
		this.name = name;
		this.marks = Collections.unmodifiableMap(marks) ;
	}

	@Override
	public String toString() {
		return "ImmutableStudentContainingCollections [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
	
	
	
	
	
	
}
