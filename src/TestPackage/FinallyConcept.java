package TestPackage;

public class FinallyConcept {

	public static void main(String[] args) {
		
		//test1();
		//test2();
		division();
		
     // Finally block executed after the Try catch block //
	}
	
	public static void test1() {
		try {
			System.out.println("Inside test1 method");
			throw new RuntimeException("test");
		}catch(Exception e) {
			System.out.println("Inside catch block");
		}
		finally {
			System.out.println("Inside finally block");
		}
	}
	//
	
	public static void test2() {
		try {
			System.out.println("Inside test2 method");
			throw new RuntimeException("test");
		}
		finally {
			System.out.println("Inside finally block in Test2");
		}
	}
	
	// 
	public static void division() {
		
		int i=10;
		try {
			System.out.println("Inside try block");
			int k = i/0;
		}
		catch(NullPointerException e) {
			System.out.println("Inside the catch block and divide by zero error");
		}
		finally {
			System.out.println("Execute this code even after any exception");
		}
 }
}