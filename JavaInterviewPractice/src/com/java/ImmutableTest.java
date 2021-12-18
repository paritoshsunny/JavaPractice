package com.java;

import java.util.Date;

public final class ImmutableTest {
	
	private final int name;
	private final String email;
	private final Employee employee;
	private final Date dob;
	
	public ImmutableTest(int name, String email, Employee employee, Date date) {
		this.name=name;
		this.email=email;
		this.employee = employee;
		this.dob = new Date(date.getTime());
	}

	@Override
	public String toString() {
		return "ImmutableTest [name=" + name + ", email=" + email + ", employee=" + employee + ", dob=" + dob + "]";
	}

	public int getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public Employee getEmployee() {
		return employee;
	}

	public Date getDob() {
		return new Date(dob.getTime());
	}
	
	

}
