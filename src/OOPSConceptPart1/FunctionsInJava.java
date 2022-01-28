package OOPSConceptPart1;

public class FunctionsInJava {
	
	//main method --> starting point of execution 
	public static void main(String[] args) {
		// Whenever object is created the copy of non-static methods
		// like test(), pqr(), qa(), division() are given to the created object
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		String s1 = obj.qa();
		System.out.println(s1);
		int div = obj.division(30, 10);
		System.out.println(div);
		

	}
	
	// non static methods
	
	//void  -- does not return any value
	//return type = void
	public void test() {// no input, no output
		System.out.println("test method");
	}
	
	// return type=integer
	
	public int pqr() {// no input, some output
		System.out.println("PQR Method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	// return type --> String
	public String qa() {// no input, some output
		System.out.println("qa method");
		String s = "Selenium";
		
		return s;
	}
	//return type ---> integer  
	// x,y ---> input parameters/arguments
	public int division(int x, int y) {
		System.out.println("Division Method");
		int d = x/y;
		
		return d;
		
		
	}

}
