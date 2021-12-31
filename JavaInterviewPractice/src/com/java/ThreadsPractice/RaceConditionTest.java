package com.java.ThreadsPractice;

import com.java.Counter;

public class RaceConditionTest {
	
	public static void main(String[] args) {
		Counter counter=new Counter();
		
		Thread th1 = new Thread(getRunnable(counter, "thread1"));
		Thread th2 = new Thread(getRunnable(counter, "thread2"));
		th1.start();
		th2.start();	
	}
	
	
	private static Runnable getRunnable(Counter counter, String name) {
		return () -> {
			for(int i=0;i<1000000;i++) {
				counter.add();
			}
			System.out.println(name + counter.get());
		};
	}
	
	
	

}
