package com.java.ThreadsPractice;


class MyThreadTest1 implements Runnable {
 
    private static volatile boolean exit;		// volatile boolean flag will make this variable thread safe
 
    private String name;
    Thread t;
 
    MyThreadTest1(String threadname)
    {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        exit = false;
        t.start();
    }
 
    public void run()
    {
        int i = 0;
        while (!exit) {
            System.out.println(name + ": " + i);
            i++;
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e) {
                System.out.println("Caught:" + e);
            }
        }
        System.out.println(name + " Stopped.");
    }
 
    public void stop()
    {
        exit = true;
    }
}

public class KillingThreadByFlag {
	
	public static void main(String args[])
    {
        MyThreadTest1 t1 = new MyThreadTest1("First  thread");
        MyThreadTest1 t2 = new MyThreadTest1("Second thread");
        try {
            Thread.sleep(500);
            t1.stop(); 
            t2.stop(); 
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            System.out.println("Caught:" + e);
        }
        System.out.println("Exiting the main Thread");
    }

}
