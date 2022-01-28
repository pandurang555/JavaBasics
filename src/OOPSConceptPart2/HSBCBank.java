package OOPSConceptPart2;

public class HSBCBank implements USBank,BrazilBank{//we are achieving multiple inheritance
// IS-a relationship
	
	//If a class is implemented any Interface , then its mandatory to define/override all the methods
	//-- of Interface.
	
	//Overriding from USBank:
	public void credit() {
		System.out.println("hsbc--credit method");
		
	}

	
	public void debit() {
		System.out.println("hsbc--debit method");
		
	}

	
	public void transferMoney() {
		System.out.println("hsbc--transferMoney method");
		
	}
	//Separate methods of HSBC bank class:
	public void educationLoan() {
		System.out.println("hsbc--edu loan");
		
	}
	
	public void carLoan() {
		System.out.println("hsbc--car loan");
		
	}


    // Brazil Bank Method:
	public void mutualFund() {
		System.out.println("hsbc--mutual fund");
		
	}

}
