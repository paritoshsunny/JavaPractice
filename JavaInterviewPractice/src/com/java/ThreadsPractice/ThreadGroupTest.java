package com.java.ThreadsPractice;

import java.util.List;

public class ThreadGroupTest {
	
	public static void main(String[] args) {
		
		ThreadGroup group1= new ThreadGroup("group1");
		ThreadGroup group2=new ThreadGroup("group2");
		
		Thread th1=new Thread(group1, new DummyThread(),"th1");
		Thread th2=new Thread(group1, new DummyThread(),"th2");
		Thread th3=new Thread(group1, new DummyThread(), "th3");
		
		Thread th4 = new Thread(group2, new Task(), "th4");
		Thread th5 = new Thread(group2, new Task(), "th5");
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		group1.list();
		group2.list();
		
		group1.setMaxPriority(8);
		group1.list();
		
		
	}

}
