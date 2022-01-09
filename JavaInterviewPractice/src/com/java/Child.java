package com.java;

import com.java.Parent;

public class Child extends Parent{
	void show() throws RuntimeException{
		System.out.println(1/0);
	}
}

