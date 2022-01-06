package com.java.InheretanceAndException;

public class Practice {

	public static void main(String[] args) {
//		A a1 = new A();
//		A a2 = new B();
//		A a3 = new C();
//		B b1 = new A();
//		B b2 = new B();
//		B b3 = new C();
//		C c1 = new A();
//		C c2 = new B();
		
		System.out.println("main");
		C c3 = new C();
	}

}

class A {
	int i = 10;
	{
		System.out.println("A");
	}
	static {
		System.out.println("a");
	}
	public A() {
		System.out.println("const A");
	}
}

class B extends A {
	int j = 20;
	{
		System.out.println("B");
	}
	static {
		System.out.println("b");
	}
	public B() {
		System.out.println("const B");
	}
}


class C extends B{
	int k = 30;
	{
		System.out.println("C");
	}
	static {
		System.out.println("c");
	}
	public C() {
		System.out.println("const C");
	}
}
