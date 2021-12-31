package com.java.ThreadsPractice;

public class CreateByAnonymousClass {
	
	public static void main(String[] args) {
		
		Runnable r=new Runnable() {
			public void run() {
				System.out.println("Thread running");	
			}
		};
		
		Thread th =new Thread(r);
		th.start();
	} 

}
