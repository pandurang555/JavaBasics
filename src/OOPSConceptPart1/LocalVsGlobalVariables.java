package OOPSConceptPart1;

public class LocalVsGlobalVariables {

	// Global variables  -- class variables
	String name = "Tom";
	int age = 25;
	
	public static void main(String[] args) {
		int i =10; // local variables 
		System.out.println(i);
		// Whenever object is created then copy of class/global variables
		//And non static methods [sum() method] are given to created object 
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		obj.name = "peter";
		System.out.println(obj.name);
		

	}
	
	public void sum() {
		int i = 15;
		int j = 20;
		int age = 25;  //belongs to this method only so local variable
	}

}
