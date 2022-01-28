package OOPSConceptPart3;

public class Dog extends Animal{
	
	public void eat() {
		System.out.println("Animal -- eat");
	}

	public static void main(String[] args) {
		
		Dog d = new Dog();
		d.eat();
		
	}

}
