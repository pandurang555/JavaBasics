package TestPackage;

public class FinalizeConcept {

	// Concept of finalize method
	// Garbage collector will clean all the memory using finalize keyword
	public static void main(String[] args) {
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		
		System.gc();
		

	}
	
	public void finalize() {
		System.out.println("Finalize Method");
	}

}
