package OOPSConceptPart1;

public class StaticAndNonStaticConcept {

	String name = "Tom"; // non static global variable
	static int age = 25; // static global variable
	
	public static void main(String[] args) {
		
		// how to call static methods and variables?
		// 1.direct calling:
		sum();
		// 2. calling by class name:
		System.out.println(age);
		StaticAndNonStaticConcept.sum();
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		obj.sum();
		int f= obj.age= 89;
		System.out.println(f);
		
		

	}
	
	public void sendMail() { // non static method
		System.out.println("send mail method");
	}
	
	public static void sum() {// static method
		System.out.println("Sum Method");
	}

}
