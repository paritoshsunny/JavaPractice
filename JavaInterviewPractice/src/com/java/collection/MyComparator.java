package com.java.collection;

import java.util.Comparator;

import com.java.Employee;

public class MyComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getSalary()-emp2.getSalary();
	}

}
