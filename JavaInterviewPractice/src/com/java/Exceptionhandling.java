package com.java;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(print());
		

	}
	
	public static int print() {
		try {
			System.out.println(" try");
			return 10;
			
		} catch(Exception e) {
			System.out.println(" Catch");
			return 20;
		} finally {
			System.out.println(10/0);
			//return 30;
		}
	}

}
