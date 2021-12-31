package com.java.ThreadsPractice;

public class CreateByExtendingThreadClass {
	
	public static class Mythread extends Thread{
		public void run() {
			System.out.println("thread is running");
		}
	}
	

	public static void main(String[] args) {
		Mythread thread=new Mythread();
		thread.start();
	}
}
