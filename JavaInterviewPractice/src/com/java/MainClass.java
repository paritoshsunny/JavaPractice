package com.java;

import java.util.Date;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {

		Date date= new Date(9423423);
		System.out.println(date);
		Employee e = new Employee(1, "Test", 343);
		Employee obj = (Employee) e.clone();
		System.out.println("Original : " + e.hashCode() +" Clonned : "+ obj.hashCode());
		ImmutableTest im = new ImmutableTest(2, "hello", e, date);
		
		System.out.println(im.toString());;
		im.getDob().setDate(12122020);;
		e.setName("Changed");
		System.out.println(im.toString());;

	}

}
