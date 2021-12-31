package com.java;

public class Child extends Parent{
	void show() throws RuntimeException{
		System.out.println(1/0);
	}
}

