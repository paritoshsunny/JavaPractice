package com.java.InheretanceAndException;

import java.io.IOException;
import java.sql.SQLException;

public class ExceptionPractice {

	public static void main(String[] args) {
		P a1 = new P();
		P a2 = new Q();
		P a3 = new R();
//		Q b1 = new P();				//compile time error
		Q b2 = new Q();
		Q b3 = new R();
//		R c1 = new P();				//compile time error
//		R c2 = new Q();				//compile time error
		R c3 = new R();
//		System.out.println("main");
		a1.p();
		a2.p();
		a3.p();
		
		b2.p();
		b2.q();
		
		c3.p();
		c3.q();
		c3.r();
//		a1,a2,a3 can only access method of class A
//		   b2,b3 can only access method of class A and B
//		      c3 can only access method of class A, B and C
	}

}

class P {
	public void p() {
		try {
			throw new ArithmeticException();
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
	}
}

class Q extends P {
	public void q() {
		try {
			throw new IOException();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}


class R extends Q{
	public void r() {
		try {
			throw new SQLException();
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
