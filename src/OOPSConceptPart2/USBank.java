package OOPSConceptPart2;

public interface USBank {

	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	//Only method declaration
	//No method body - only method prototype
	//In Interface,  we can declare the variables, variables are by default static in nature
	//Variables value can not be changed, its final/constant in nature
	//No static method in Interface
	//No Main method in Interface
	//We can not create the object of Interface
	//Interface is abstract in nature
	
}
