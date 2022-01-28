package javaBasics;

public class ConstructorConcept {
  // Constructor overloading: 

	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("Single param constructor");
		System.out.println("The value of i "+ i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("Two params constructor");
		System.out.println("The value of i "+ i);
		System.out.println("The value of j "+ j);
	}
	
	
	public static void main(String[] args) {
		System.out.println("This is main method");
		ConstructorConcept c1= new ConstructorConcept();
		ConstructorConcept c2= new ConstructorConcept(10);
		ConstructorConcept c3= new ConstructorConcept(34,35);
		
		c1.start();

	}
	
	public void start() {
		System.out.println("This is the start method");
	}

}
