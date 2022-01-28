package javaBasics;

public class B extends A {
	
	public B() {
		//super be the 1st statement
		//super keyword will be used to call parent class constructor
		
		super();//super class keyword used to call constructor of parent class rather than default class constructor
		System.out.println("Child class Constructor");
	}

	public B(int i) {
		super(i);
	}
	
	public B(int i,int j) {
		super(i,j);
	}
	
	
	public static void main(String[] args) {
		
		B obj = new B();
		B obj1 = new B(10);
		B obj2 = new B(10,20);
	

	}

}
