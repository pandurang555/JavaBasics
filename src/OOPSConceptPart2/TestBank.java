package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		//Static polymorphism
		
		System.out.println(USBank.min_bal);
		
		HSBCBank hs = new HSBCBank();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.carLoan();
		
		//Dynamic Polymorphism
		//child class object can be referred by parent Interface reference var
		
		USBank b = new HSBCBank();
		b.credit();
		b.debit();
		b.transferMoney();
	
		
		

	}

}
