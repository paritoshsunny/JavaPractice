package com.java.ThreadsPractice;

import java.util.concurrent.CountDownLatch;

public class CustomCountDownLatchMain {
	
	public static void main(String[] args) {
		CountDownLatch countDownLatch=new CountDownLatch(3);
		
		new Thread(new CustomCountDownLatch(countDownLatch),"Thread-1").start();
		
		try {
			countDownLatch.await();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count reached to zero, " + Thread.currentThread().getName() +" thread has ended");
	}
}
