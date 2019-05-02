package javaPracticeQuestions;

public class Bank_Abstract_Test {

	public static void main(String[] args) {
		
		
		//Cannot create obj of bank directly
	    //Bank_Abstract b1 = new Bank_Abstract();
		
		
		//Creating object of affiliated bank.
		AffiliatedBank_Abstract obj1 = new AffiliatedBank_Abstract();
		obj1.loan(); // overloaded this method
		obj1.credit();
		obj1.debit();
		obj1.funds();
		
		
		
		// Achieving dynamic polymorphism
		new AffiliatedBank_Abstract();//Creating object without any reference
		
		
		
		
		
		// or we can refer it with bank class interface as well.
		Bank_Abstract b = new AffiliatedBank_Abstract();
		b.loan();
		b.credit();
		b.debit();
		//b.funds(); not available because funds is only part of affiliated bank,
		//b is reference of bank class.
		
	}

}
