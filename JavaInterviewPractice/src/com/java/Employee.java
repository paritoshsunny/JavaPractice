package com.java;

public class Employee implements Cloneable{
	
	int id;
	String name;
	int salary;
	
	Address address;
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
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
	public Employee(int id, String name, int salary, Address address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Employee emp1 = (Employee) super.clone();
		emp1.setAddress(new Address(getAddress().getHouseNo(), getAddress().getStreet(), getAddress().getCity(), getAddress().getCountry()));

		return emp1;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]";
	}
	
	
	
	
	
	

}
