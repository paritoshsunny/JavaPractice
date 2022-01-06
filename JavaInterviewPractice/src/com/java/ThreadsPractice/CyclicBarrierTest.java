package com.java.ThreadsPractice;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {

	public static void main(String[] args) {
		CyclicBarrier barrier=new CyclicBarrier(4);
		
		Thread th1=new Thread(new MyThreadA(barrier), "Thread-1");
		Thread th2=new Thread(new MyThreadA(barrier), "Thread-2");
		Thread th3=new Thread(new MyThreadA(barrier), "Thread-3");
		Thread th4=new Thread(new MyThreadA(barrier), "Thread-4");
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		
	}
}


class MyThreadA implements Runnable{
	
	private CyclicBarrier barrier;
	
	public MyThreadA(CyclicBarrier barrier) {
		this.barrier=barrier;
	}

	@Override
	public void run() {
		try{
			System.out.println(Thread.currentThread().getName() + " is running");
			barrier.await();								// blocking
			printString();
		}catch(InterruptedException e) {
			System.out.println(e);
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
	
	void printString() {
		System.out.println(Thread.currentThread().getName());
	}
	
	
}