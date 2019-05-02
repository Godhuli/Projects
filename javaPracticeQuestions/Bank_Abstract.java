package javaPracticeQuestions;

public abstract class Bank_Abstract {

	//This is partial abstraction
	
	public abstract void loan(); // abstract method(implementation is hidden). Implementation will be defined by respective child classes.
	
	
	public void credit(){
		 System.out.println("Bank--Credit");
	 }
	
	
	public void debit(){
		System.out.println("Bank-Debit");
	}
}
