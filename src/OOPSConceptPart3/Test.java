package OOPSConceptPart3;

public class Test extends Shape{

	//50% abstraction is achieved by abstract class and complete abstraction is achieved by Interface 
	
	Test(){
		System.out.println("Test Class Constructor");
	}
	
	public static void main(String[] args) {
		//Shape s = new Test();
		//s.drawing();
		//s.fill();
		Test test = new Test();
		

	}

	@Override
	void drawing() {
		System.out.println("Test -- drawing");
		
	}

}
