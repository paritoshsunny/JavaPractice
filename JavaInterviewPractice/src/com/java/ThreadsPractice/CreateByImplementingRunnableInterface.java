package com.java.ThreadsPractice;

public class CreateByImplementingRunnableInterface {

	public static class MyRunnableClass implements Runnable{

		@Override
		public void run() {
			System.out.println("Thread from MyRunnableClass is running");
			
		}
		
	}
	
	public static void main(String[] args) {
		
		Thread thread=new Thread(new MyRunnableClass());     //constructor of thread class ----  Thread(Runnable r)
		thread.start();
		
		Thread thread2=new Thread("My thread");		//constructor of thread class ----  Thread(String threadName)
		System.out.println(thread2.getName());
		
		Thread thread3=new Thread(new MyRunnableClass(), "MySecondThread");	//constructor of thread class ----  Thread(Runnable r,String threadName)
		thread3.start();
		System.out.println(thread3.getName());
		
	}

}
