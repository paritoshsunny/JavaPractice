package com.java;

import java.util.Date;

public class DeepCopyTest {

	public static void main(String[] args) throws CloneNotSupportedException {

//		Date date= new Date(9423423);
//		System.out.println(date);
//		Employee e = new Employee(1, "Test", 343);
//		Employee obj = (Employee) e.clone();
//		System.out.println("Original : " + e.hashCode() +" Clonned : "+ obj.hashCode());
//		ImmutableTest im = new ImmutableTest(2, "hello", e, date);
//		
//		System.out.println(im.toString());;
//		im.getDob().setDate(12122020);;
//		e.setName("Changed");
//		System.out.println(im.toString());;
		
		Address add=new Address(101, "abc", "pqr", "xyz");
		Employee emp =new Employee(10, "Jack", 1451, add);
		
		try {
			Object obj = emp.clone();
			Employee emp1= (Employee) obj;
			emp1.setName("abcdef");
			emp1.getAddress().setHouseNo(202);;
			System.out.println(emp);
			System.out.println(emp1);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}
