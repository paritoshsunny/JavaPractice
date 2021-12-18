package com.java;

public class Employee {
	
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Clonning not supported");
		return this;
	}
	
	
	

}
