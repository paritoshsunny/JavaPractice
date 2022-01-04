package com.java.ThreadsPractice;

public class ThreadLifeCycle implements Runnable{

	public static Thread thread1;
    public static ThreadLifeCycle obj;
      
    public static void main(String[] args)
    {
        obj = new ThreadLifeCycle();
        thread1 = new Thread(obj);
          
        System.out.println("State of thread1 after creating it - " + thread1.getState());
        thread1.start();
          
        System.out.println("State of thread1 after calling .start() method on it - " + 
            thread1.getState());
    }
      
    public void run()
    {
        MyThread myThread = new MyThread();
        Thread thread2 = new Thread(myThread);
          
        System.out.println("State of thread2 after creating it - "+ thread2.getState());
        thread2.start();
          
        System.out.println("State of thread2 after calling .start() method - " + 
            thread2.getState());
          
        
        try
        {
            Thread.sleep(200);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("State of thread2 after calling .sleep() method  - "+ 
            thread2.getState() );
          
          
        try 
        {
            thread2.join();
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("State of thread2 when it has finished  - " + 
            thread2.getState());
    }

}
