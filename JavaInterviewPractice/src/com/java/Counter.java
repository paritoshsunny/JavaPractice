package com.java;

public class Counter {
	
	protected long count=0;
	
	public long add() {
		this.count++;
		return this.count;
	}
	
	public long get() {
		return this.count;
	}
}
