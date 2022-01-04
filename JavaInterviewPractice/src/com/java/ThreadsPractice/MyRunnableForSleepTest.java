package com.java.ThreadsPractice;

import java.util.concurrent.TimeUnit;

public class MyRunnableForSleepTest implements Runnable {

	@Override
	public void run() {
		long start = System.currentTimeMillis();
		System.out.println("Current Time: " + start);
		try {
//			Thread.sleep(2000);
			TimeUnit.SECONDS.sleep(2);	// this will also work same as Thread.sleep(2000)
			long aftersleep = System.currentTimeMillis();
			System.out.println("Time After Sleep: " + aftersleep);
			System.out.println("time from start to runnable: " + (aftersleep - start)); // it may be more then 2 seconds as
																						// it depends on thread
																						// scheduler also
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
