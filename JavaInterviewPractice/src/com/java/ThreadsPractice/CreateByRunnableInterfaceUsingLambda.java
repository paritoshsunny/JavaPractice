package com.java.ThreadsPractice;

public class CreateByRunnableInterfaceUsingLambda {
	
	public static void main(String[] args) {
		Runnable r= () -> {
			System.out.println("Thread running by lambda");
		};
		
		Thread th=new Thread(r);
		th.start();
	}
}
