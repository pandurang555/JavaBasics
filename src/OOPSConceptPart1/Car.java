package OOPSConceptPart1;

public class Car {

	// Class VAR:
	 int model;
	 String wheel;
			
	public static void main(String[] args) {
		Car a = new Car(); // right side i.e new Car() is the object of the the Car class
		Car b = new Car();
		Car c = new Car();
		
		a.model= 2015;
	    a.wheel="objectA";
	    
	    b.model= 2014;
	    b.wheel="objectB";
	    
	    c.model= 2013;
	    c.wheel="objectC";

	    System.out.println("Before assigning the references");
	    
	    System.out.println(a.model);
	    System.out.println(a.wheel);
	    
	    System.out.println(b.model);
	    System.out.println(b.wheel);
	    
	    System.out.println(c.model);
	    System.out.println(c.wheel);
	    
	    System.out.println("After assigning the references");
	    
	    a=b;
	    b=c;
	    c=a;
	    
	    System.out.println(a.model);
	    System.out.println(a.wheel);
	    
	    System.out.println(b.model);
	    System.out.println(b.wheel);
	    
	    System.out.println(c.model);
	    System.out.println(c.wheel);
	    
	    
	}

}
