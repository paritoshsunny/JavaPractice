package com.java.ThreadsPractice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolTest {
	
	public static void main(String[] args) {
		ScheduledExecutorService service= Executors.newScheduledThreadPool(1);
		
		for(int i=0;i<100;i++) {
			service.scheduleAtFixedRate(new Task(), 2, 2, TimeUnit.SECONDS);
		}
	}
}
