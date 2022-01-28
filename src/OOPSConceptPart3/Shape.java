package OOPSConceptPart3;

public abstract class Shape {
	
	Shape(){
		System.out.println("Shape class constructor");
	}
	
	int color;
	
	abstract void drawing(); //only method declaration and not body part 
	
	public void fill() {
		System.out.println("Shape -- fill");
	}
	
	//can not create the object of interface
	//can not create the object of abstract class
	//we can create abstract methods as well as non abstract methods under abstract class

}
