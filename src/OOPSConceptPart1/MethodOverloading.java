package OOPSConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(20,30);
		main(500);
		main(500,200);

	}
	
	public static void main(int v) {
		System.out.println("First Main Method " + v);
	}
	
	public static void main(int e, int f) {
		System.out.println("Second Main Method " + (e+f));
	}
	
	//You can not create a method inside a method
	//Method Overloading --> when the method name is same with different arguments or with different data types
	//-- or input parameters
	//--within the same class
	
	// duplicate methods -- i.e same method name with same number of arguments are not allowed//
	
	public void sum() {// 0 input parameter
		System.out.println("Sum method with zero parameter");
		
	
	}
	
	public void sum(int i) {// 1 input parameter
		System.out.println("Sum method "+ i);
		

	}
	public void sum(int i,int k) {// 2 input parameter
		System.out.println("Sum method "+ (i+k));
		

	}
}
