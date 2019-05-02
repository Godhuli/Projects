package javaPracticeQuestions;

public class MainclassOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method-1");
		main("Apple");
		main(55);
		MainclassOverloadPart2.main(args);
		Bank_Abstract_Test.main(args); //Calling main method from other class.
		
	

	}
	
	public static void main(String args) {
		// TODO Auto-generated method stub
		System.out.println("Main method-2");

	}
	
	public static void main(int args) {
		// TODO Auto-generated method stub
		System.out.println("Main method-3");

	}
	
	
}

class MainclassOverloadPart2{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is Second class.");
		
		

	}
	

}
