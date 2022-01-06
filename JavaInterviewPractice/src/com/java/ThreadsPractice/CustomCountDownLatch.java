package com.java.ThreadsPractice;

import java.util.concurrent.CountDownLatch;

public class CustomCountDownLatch implements Runnable{

	CountDownLatch countDownLatch;

	public CustomCountDownLatch(CountDownLatch countDownLatch) {
		this.countDownLatch = countDownLatch;
	}
	
	public void run() {
		for(int i=2;i>=0;i--) {
			countDownLatch.countDown();
			System.out.println(Thread.currentThread().getName() + "has reduced latch count to "  + i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	
	
}
