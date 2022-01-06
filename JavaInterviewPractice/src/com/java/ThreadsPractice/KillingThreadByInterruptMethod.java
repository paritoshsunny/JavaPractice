package com.java.ThreadsPractice;

class MyThreadDemo implements Runnable {
	 
    Thread t;
 
    MyThreadDemo()
    {
        t = new Thread(this);
        System.out.println("New thread: " + t);
        t.start(); 
    }
 
    public void run()
    {
        while (!Thread.interrupted()) {
            System.out.println("Thread is running");
        }
        System.out.println("Thread has stopped.");
    }
}

public class KillingThreadByInterruptMethod {
	
	public static void main(String args[])
    {
		MyThreadDemo t1 = new MyThreadDemo();
 
        try {
            Thread.sleep(1);
            t1.t.interrupt();
            Thread.sleep(5);
        }
        catch (InterruptedException e) {
            System.out.println("Caught:" + e);
        }
        System.out.println("Exiting the main Thread");
    }
}
