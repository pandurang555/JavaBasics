package javaBasics;

public class ConstructorWithThisKeyword {
	
	// class variables or Global variables -- to initialize the class variables this keyword used//
	//This.Global variables = Local variables
	//If number of variables are more in number then same name of vars used along with this keyword 
	
	String name;
	int age;

	public ConstructorWithThisKeyword(String name,int age){//These are local variables for this constructor
		this.name = name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",30);
		
	}

}
