package com.java.ThreadsPractice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFutureTest {
	
	public static void main(String[] args) {
		ExecutorService service=Executors.newSingleThreadExecutor();
		
		Future<String> future = service.submit(new Task2());
		String result=null;
		// some unrelated operations
		try {
			result= future.get();		//it will block the parent/main thread till got the future value
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println(result);
	}

	
	
	
	
	static class Task2 implements Callable<String> {

		@Override
		public String call() throws Exception {
			Thread.sleep(5000);
			return Thread.currentThread().getName();
		}
		
	}
	
}
