package com.java.ThreadsPractice;

public class ThreadSleepTest {
	
	public static void main(String[] args) {
		Thread th=new Thread(new MyRunnableForSleepTest());
		th.start();
//		th.start();
	}
}
