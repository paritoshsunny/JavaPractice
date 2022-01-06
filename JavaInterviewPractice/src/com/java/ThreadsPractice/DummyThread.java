package com.java.ThreadsPractice;

public class DummyThread extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
	
}
