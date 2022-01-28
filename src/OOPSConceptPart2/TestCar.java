package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		//Static Polymorphism -- compile time polymorphism //
		
		BMW bmw = new BMW();
		bmw.start();
		bmw.stop();
		bmw.refuel();
		bmw.theftSafety();
		bmw.engine();

		System.out.println("**********");
		
		Car c = new Car();
		c.start();
		c.refuel();
		c.stop();
		
		System.out.println("************");
		
		//Child class object can be referred by parent class reference variable --
		//-- called as Dynamic Polymorphism -- Run-Time Polymorphism //
		//Top Casting
		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		
		// Down Casting 
		//BMW B1 = new Car(); not allowed in java and this can be done as follows//
		//BMW b1 =(BMW) new Car();  // ClassCastException
		//b1.theftSafety();

	}

}
